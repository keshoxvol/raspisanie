package ru.codovstvo.raspisanie.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.raspisanie.models.Party;
import ru.codovstvo.raspisanie.models.Thing;
import ru.codovstvo.raspisanie.models.Timetable;
import ru.codovstvo.raspisanie.repository.PartyRepo;
import ru.codovstvo.raspisanie.repository.ThingRepo;
import ru.codovstvo.raspisanie.repository.TimetableRepo;


@RestController
@RequestMapping("/timetable")
public class TimetableController {
    
    @Autowired
    private PartyRepo partyRepo;
    
    @Autowired
    private ThingRepo thingRepo;

    @Autowired
    private TimetableRepo timetableRepo;
    
    @PostMapping(value="/add")
    public String add(@RequestParam(value = "thingid") Long thingId,
                            @RequestParam(value = "partyid") Long partyId,
                            @RequestParam(value = "audience") int audience,
                            @RequestParam(value = "date") String date) {
        if(partyRepo.findById(partyId).isPresent() || thingRepo.findById(thingId).isPresent()){
            Party party = partyRepo.findById(partyId).get();
            Thing thing = thingRepo.findById(thingId).get();
            timetableRepo.save(new Timetable(thing, party, audience, date));
            return "200";
        }else{
            return "400";
        }
    }
   
    @GetMapping(value="/all")
    public Iterable<Timetable> getAll() {
        Iterable<Timetable> timetable = timetableRepo.findAll();
        return timetable;
    }

    @PostMapping(value="/delltimetable")
    public void deleteAll() {
        timetableRepo.deleteAll();
    }
    
}