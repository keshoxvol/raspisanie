package ru.codovstvo.raspisanie.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import ru.codovstvo.raspisanie.models.*;
import ru.codovstvo.raspisanie.repository.*;

@RestController
public class ThingCntroller {

    @Autowired
    private ThingsRepo thingsRepo;
    
    @GetMapping(value="/things")
    public Iterable<Things> getAll() {
        Iterable<Things> things = thingsRepo.findAll();
        return things;
    }

}