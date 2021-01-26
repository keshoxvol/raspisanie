package ru.codovstvo.raspisanie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Timetable;

public interface TimetableRepo extends CrudRepository<Timetable, Long> {
    List<Timetable> findByParty(String party);
    List<Timetable> findByTeacher(String teacher);
    List<Timetable> findByAudience(String audience);
    List<Timetable> findByThing(String thing);
    List<Timetable> findByDate(String date);
    Timetable findByDateAndParty(String date, String party);
    Timetable findByDateAndTeacher(String date, String teacher);
    void deleteByDateAndParty(String date, String party);
}