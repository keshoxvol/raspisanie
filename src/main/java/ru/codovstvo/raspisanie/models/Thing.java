package ru.codovstvo.raspisanie.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Thing {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private int numberHours;

    @OneToMany(targetEntity = Timetable.class)
    private List<Timetable> timetablething = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "things", insertable = true, updatable = true)
    private Teacher teacher;


    public Thing(String title, Teacher teacher, int numberHours){
        this.title = title;
        this.numberHours = numberHours;
        this.teacher = teacher;
    }

}