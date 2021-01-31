package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Things {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private Long teacherId;
    private int numberHours;

    public Things(String title, Long teacherId, int numberHours){
        this.title = title;
        this.teacherId = teacherId;
        this.numberHours = numberHours;
    }

}