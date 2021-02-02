package ru.codovstvo.raspisanie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Timetable;

public interface TimetableRepo extends CrudRepository<Timetable, Long> {
}