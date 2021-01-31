package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Party {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String title;
    private int numberPeoples;

    public Party(String title, int numberPeoples){
        this.title = title;
        this.numberPeoples = numberPeoples;
    }

}