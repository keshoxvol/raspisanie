// package ru.codovstvo.raspisanie.restControllers;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.GetMapping;

// import ru.codovstvo.raspisanie.models.*;
// import ru.codovstvo.raspisanie.repository.*;


// @RestController
// @RequestMapping("/partythinghours")
// public class PartyThingHoursContholler {

//     @Autowired
//     PartyThingHoursRepo partyThingHoursRepo;

//     @Autowired
//     private ThingsRepo thingsRepo;

//     @Autowired
//     private TeachersRepo teacherRepo;

//     @Autowired
//     private PartyRepo partyRepo;

//     @GetMapping(value="/all")
//     public Iterable<PartyThingHours> getAll() {
//         Iterable<PartyThingHours> partyThingHours = partyThingHoursRepo.findAll();
//         return partyThingHours;
//     }

//     @PostMapping(value="/add")
//     public String add(@RequestParam(value = "partyid") Long partyId,
//                     @RequestParam(value = "thingid") Long thingId,
//                     @RequestParam(value = "teacherid") Long teacherId,
//                     @RequestParam(value = "numberhoursbalance") int numberHoursBalance){
//         if(teacherRepo.findById(teacherId).isPresent() || thingsRepo.findById(thingId).isPresent() || partyRepo.findById(partyId).isPresent()){
//                 partyThingHoursRepo.save(new PartyThingHours(partyId, thingId, teacherId, numberHoursBalance));
//                 return "200";
//             }else{
//                 return "400";
//             }
//         }
    
// }