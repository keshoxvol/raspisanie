package ru.codovstvo.raspisanie.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.raspisanie.models.Teacher;
import ru.codovstvo.raspisanie.models.Thing;
import ru.codovstvo.raspisanie.repository.TeacherRepo;
import ru.codovstvo.raspisanie.repository.ThingRepo;

@RestController
@RequestMapping("/thing")
public class ThingCntroller {

    @Autowired
    private ThingRepo thingRepo;

    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping(value = "/all")
    public Iterable<Thing> getAll() {
        Iterable<Thing> thing = thingRepo.findAll();
        return thing;
    }

    @PostMapping(value = "/add")
    public String addThing(@RequestParam(value = "title") String title, @RequestParam(value = "teacherid") Long teacherId,
            @RequestParam(value = "numberhours") int numberHours) {
        if(teacherRepo.findById(teacherId).isPresent()){
            Teacher teacher = teacherRepo.findById(teacherId).get();
            thingRepo.save(new Thing(title, teacher, numberHours));
            return "200";
        }else{
            return "400";
        }
    }

    @PostMapping(value = "/delbyid")
    public void delThingById(@RequestParam(value = "teacherid") Long teacherId){
        thingRepo.deleteById(teacherId);
    }

    @PostMapping(value = "/delall")
    public void delThingAll(){
        thingRepo.deleteAll();
    }

}   