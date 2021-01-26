package ru.codovstvo.raspisanie.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import ru.codovstvo.raspisanie.models.*;
import ru.codovstvo.raspisanie.repository.*;

@RestController
public class TeacherController {
    
    @Autowired
    private TeachersRepo teashersRepo;
    
    @GetMapping(value="/teachers")
    public Iterable<Teachers> getAll() {
        Iterable<Teachers> teachers = teashersRepo.findAll();
        return teachers;
    }
}