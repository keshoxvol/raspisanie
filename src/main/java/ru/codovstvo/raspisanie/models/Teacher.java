package ru.codovstvo.raspisanie.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToMany(targetEntity = Thing.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Thing> things = new ArrayList<>();

    public Teacher(String title){
        this.title = title;
    }

}