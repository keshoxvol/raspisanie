package ru.codovstvo.raspisanie.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import ru.codovstvo.raspisanie.models.*;
import ru.codovstvo.raspisanie.repository.*;


@RestController
@RequestMapping("/timetable")
public class TimetableController {

    @Autowired
    private TimetableRepo timetableRepo;
    
    @PostMapping(value="/addentry")
    public void addEntry(@RequestParam(value = "thing") String thing,
                            @RequestParam(value = "party") String party,
                            @RequestParam(value = "date") String date,
                            @RequestParam(value = "audience") String audience,
                            @RequestParam(value = "teacher") String teacher, Timetable timetable) {
        timetableRepo.save(timetable);
    }

    @GetMapping(value="/getbydateandparty")
    public Timetable getByDateAndParty(@RequestParam(value = "date") String date, @RequestParam(value = "party") String party) {
        return timetableRepo.findByDateAndParty(date, party);
    }

    @GetMapping(value="/getbydateandteacher")
    public Timetable getByDateAndTeacher(@RequestParam(value = "date") String date, @RequestParam(value = "teacher") String teacher) {
        return timetableRepo.findByDateAndTeacher(date, teacher);
    }
    
    @GetMapping(value="/byparty")
    public List<Timetable> getTimetableByParty(@RequestParam String party) {
        return timetableRepo.findByParty(party);
    }

    @GetMapping(value="/bydate")
    public List<Timetable> getTimetableByDate(@RequestParam String date) {
        return timetableRepo.findByDate(date);
    }

    @GetMapping(value="/byteacher")
    public List<Timetable> getTimetableByTeacher(@RequestParam String teacher) {
        return timetableRepo.findByParty(teacher);
    }

    @GetMapping(value="/byaudience")
    public List<Timetable> getTimetableByAudience(@RequestParam String audience) {
        return timetableRepo.findByAudience(audience);
    }

    @GetMapping(value="/bything")
    public List<Timetable> getTimetableByThing(@RequestParam String thing) {
        return timetableRepo.findByThing(thing);
    }
    
    @GetMapping(value="/all")
    public Iterable<Timetable> getAll() {
        Iterable<Timetable> timetable = timetableRepo.findAll();
        return timetable;
    }

    @PostMapping(value="/dellbydateandparty")
    public void delByDateAndParty(@RequestParam(value = "date") String date, @RequestParam(value = "party") String party) {
        timetableRepo.deleteByDateAndParty(date, party);
    }
    
    @PostMapping(value="/delltimetable")
    public void deleteAll() {
        timetableRepo.deleteAll();
    }
    
}