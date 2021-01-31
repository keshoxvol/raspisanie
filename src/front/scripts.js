$(".bell").submit(function () {
    var form_data = $(this).serialize();
    $.ajax({
        type: "POST",
        url: `http://localhost:8080/party/add?${form_data}`,
        crossDomain: true,
        headers: {
        "Access-Control-Allow-Origin": "*",
        "Access-Control-Allow-Headers": "*",
        "Access-Control-Allow-Methods": "POST,GET,PUT,DELETE,OPTIONS"
    },
    success: function () {
        $(".bell").removeClass("active");
        $('.bell-bg').removeClass('active')
        setTimeout(function () {}, 2000);
    }
    });
    event.preventDefault();
    });