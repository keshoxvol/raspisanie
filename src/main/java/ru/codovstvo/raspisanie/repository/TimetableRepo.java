package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Timetable;

public interface TimetableRepo extends CrudRepository<Timetable, Long> {
    
}