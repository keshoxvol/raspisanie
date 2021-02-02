$(document).ready(function () {

    $(".postmethod").submit(function (e) {

        e.preventDefault(); 

        var form = $(this);
        var url = form.attr('action');

        $.ajax({
            type: "POST",
            url: url,
            data: form.serialize(), // serializes the form's elements.
            success: function (data) {
                alert(data); // show response from the php script.
                location.reload();
            }
        });


    });

    jQuery.getJSON("http://localhost:8080/teacher/all", {
      }, function(data) {
        console.log(data);
        jQuery.each(data, function(i, item) {

                jQuery("#resultsteachers").append("<li>" + item.title + "</li>");
        });
      });
    
      jQuery.getJSON("http://localhost:8080/teacher/all", {
      }, function(data) {
        console.log(data);
        jQuery.each(data, function(i, item) {
                jQuery("#selectteachers").append("<option>" + item.id + "</option>");
        });
      });

    jQuery.getJSON("http://localhost:8080/party/all", {
    }, function(data) {
      console.log(data);
      jQuery.each(data, function(i, item) {
              jQuery("#resultsparty").append("<li>" + "Название предмета: " + item.title + " Колличество учащихся: " + item.numberPeoples +"</li>");
      });
    });

    jQuery.getJSON("http://localhost:8080/party/all", {
    }, function(data) {
      console.log(data);
      jQuery.each(data, function(i, item) {
              jQuery("#selectparty").append("<option>" + item.id + "</option>");
      });
    });

    jQuery.getJSON("http://localhost:8080/thing/all", {
    }, function(data) {
      console.log(data);
      jQuery.each(data, function(i, item) {
              jQuery("#resultsthings").append("<li>" + "Название группы: " + item.title + " Id преподавателя: " + item.teacherId + " Число часов: " + item.numberHours +"</li>");
      });
    });

    jQuery.getJSON("http://localhost:8080/thing/all", {
    }, function(data) {
      console.log(data);
      jQuery.each(data, function(i, item) {
              jQuery("#selectthing").append("<option>" + item.id + "</option>");
      });
    });

    jQuery.getJSON("http://localhost:8080/timetable/all", {
    }, function(data) {
      console.log(data);
      jQuery.each(data, function(i, item) {
              jQuery("#resultstimetable").append("<li>" + "Название предмета: " + item.thing.title + " Группа: " + item.party.title + " Аудитория: " + item.audienceId + " ФИО преподавателя: " + item.thing.teacher + " Дата: " + item.date + "</li>");
      });
    });



});