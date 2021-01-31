package ru.codovstvo.raspisanie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Timetable;

public interface TimetableRepo extends CrudRepository<Timetable, Long> {
    List<Timetable> findByPartyId(Long partyId);
    List<Timetable> findByTeacherId(Long teacherId);
    List<Timetable> findByAudienceId(Long audienceId);
    List<Timetable> findByThingId(Long thingId);
    List<Timetable> findByDate(String date);
    Timetable findByDateAndPartyId(String date, Long partyId);
    Timetable findByDateAndTeacherId(String date, Long teacherId);
    void deleteByDateAndPartyId(String date, Long partyId);
}