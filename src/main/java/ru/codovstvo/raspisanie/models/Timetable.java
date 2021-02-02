package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.lang.Long;

@Data
@NoArgsConstructor
@Entity
public class Timetable {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "timetablething")
    private Thing thing;

    @ManyToOne
    @JoinColumn(name = "timetableparty")
    private Party party;
    private int audience;
    private String date;

    public Timetable(Thing thing, Party party, int audience, String date) {
        this.thing = thing;
        this.party = party;
        this.audience = audience;
        this.date = date;
    }
}