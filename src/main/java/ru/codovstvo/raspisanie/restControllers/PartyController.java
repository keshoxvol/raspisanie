package ru.codovstvo.raspisanie.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import ru.codovstvo.raspisanie.models.*;
import ru.codovstvo.raspisanie.repository.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    private PartyRepo partyRepo;
    
    @GetMapping(value="/all")
    public Iterable<Party> getAll() {
        Iterable<Party> party = partyRepo.findAll();
        return party;
    }
    
    @PostMapping(value="/add")
    public void addParty(@RequestParam(value = "title") String title, @RequestParam(value = "numberpeoples") int numberPeoples) {
        partyRepo.save(new Party(title, numberPeoples));
    }
    
}