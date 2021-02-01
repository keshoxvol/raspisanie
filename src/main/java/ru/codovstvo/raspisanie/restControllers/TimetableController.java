// package ru.codovstvo.raspisanie.restControllers;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.GetMapping;

// import ru.codovstvo.raspisanie.models.*;
// import ru.codovstvo.raspisanie.repository.*;


// @RestController
// @RequestMapping("/timetable")
// public class TimetableController {

//     @Autowired
//     private TimetableRepo timetableRepo;
    
//     @PostMapping(value="/add")
//     public void add(@RequestParam(value = "thing") Long thingId,
//                             @RequestParam(value = "party") Long partyId,
//                             @RequestParam(value = "audience") Long audienceId,
//                             @RequestParam(value = "teacher") Long teacherId,
//                             @RequestParam(value = "date") String date) {
//         timetableRepo.save(new Timetable(thingId, partyId, audienceId, teacherId, date));
//     }

//     @GetMapping(value="/getbydateandparty")
//     public Timetable getByDateAndPartyId(@RequestParam(value = "date") String date, @RequestParam(value = "partyid") Long partyId) {
//         return timetableRepo.findByDateAndPartyId(date, partyId);
//     }

//     @GetMapping(value="/getbydateandteacher")
//     public Timetable getByDateAndTeacherId(@RequestParam(value = "date") String date, @RequestParam(value = "teacherid") Long teacherId) {
//         return timetableRepo.findByDateAndTeacherId(date, teacherId);
//     }
    
//     @GetMapping(value="/byparty")
//     public List<Timetable> getTimetableByPartyId(@RequestParam Long partyId) {
//         return timetableRepo.findByPartyId(partyId);
//     }

//     @GetMapping(value="/bydate")
//     public List<Timetable> getTimetableByDate(@RequestParam String date) {
//         return timetableRepo.findByDate(date);
//     }

//     @GetMapping(value="/byteacher")
//     public List<Timetable> getTimetableByTeacherId(@RequestParam Long teacherId) {
//         return timetableRepo.findByTeacherId(teacherId);
//     }

//     @GetMapping(value="/byaudience")
//     public List<Timetable> getTimetableByAudience(@RequestParam Long audienceId) {
//         return timetableRepo.findByAudienceId(audienceId);
//     }

//     @GetMapping(value="/bything")
//     public List<Timetable> getTimetableByThing(@RequestParam Long thingId) {
//         return timetableRepo.findByThingId(thingId);
//     }
    
//     @GetMapping(value="/all")
//     public Iterable<Timetable> getAll() {
//         Iterable<Timetable> timetable = timetableRepo.findAll();
//         return timetable;
//     }

//     @PostMapping(value="/dellbydateandparty")
//     public void delByDateAndParty(@RequestParam(value = "date") String date, @RequestParam(value = "partyid") Long partyId) {
//         timetableRepo.deleteByDateAndPartyId(date, partyId);
//     }
    
//     @PostMapping(value="/delltimetable")
//     public void deleteAll() {
//         timetableRepo.deleteAll();
//     }
    
// }