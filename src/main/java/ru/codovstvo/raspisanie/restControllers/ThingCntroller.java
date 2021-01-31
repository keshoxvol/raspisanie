package ru.codovstvo.raspisanie.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import ru.codovstvo.raspisanie.models.*;
import ru.codovstvo.raspisanie.repository.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.Long;

@RestController
@RequestMapping("/thing")
public class ThingCntroller {

    @Autowired
    private ThingsRepo thingsRepo;

    @Autowired
    private TeachersRepo teacherRepo;

    @GetMapping(value = "/all")
    public Iterable<Things> getAll() {
        Iterable<Things> things = thingsRepo.findAll();
        return things;
    }

    @PostMapping(value = "/add")
    public String addThing(@RequestParam(value = "title") String title, @RequestParam(value = "teacherid") Long teacherId,
            @RequestParam(value = "numberhours") int numberHours) {
        if(teacherRepo.findById(teacherId).isPresent()){
            thingsRepo.save(new Things(title, teacherId, numberHours));
            return "200";
        }else{
            return "400";
        }
    }

    @PostMapping(value = "/delbyid")
    public void delThingById(@RequestParam(value = "teacherid") Long teacherId){
        thingsRepo.deleteById(teacherId);
    }

    @PostMapping(value = "/delall")
    public void delThingAll(){
        thingsRepo.deleteAll();
    }

}   