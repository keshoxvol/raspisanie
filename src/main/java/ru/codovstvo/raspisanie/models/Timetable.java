package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    private Long thingId;
    private Long partyId;
    private Long audienceId;
    private Long teacherId;
    private String date;

    public Timetable(Long thingId, Long partyId, Long audienceId, Long teacherId, String date) {
        this.thingId = thingId;
        this.partyId = partyId;
        this.audienceId = audienceId;
        this.teacherId = teacherId;
        this.date = date;
    }
}