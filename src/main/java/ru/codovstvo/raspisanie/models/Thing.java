package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

    @ManyToOne
    private Teacher teacher;


    public Thing(String title, int numberHours){
        this.title = title;
        this.numberHours = numberHours;
        // this.teacher = teacher;
    }

}