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
@RequestMapping("/teacher")
public class TeacherController {
    
    @Autowired
    private TeacherRepo teashersRepo;
    
    @GetMapping(value="/all")
    public Iterable<Teacher> getAll() {
        Iterable<Teacher> teachers = teashersRepo.findAll();
        return teachers;
    }

    @PostMapping(value="/add")
    public void addTeacher(@RequestParam(value = "title")String title) {
        teashersRepo.save(new Teacher(title));
    }

    @PostMapping(value="delall")
    public void delTeachers(){
        teashersRepo.deleteAll();
    }
    
}