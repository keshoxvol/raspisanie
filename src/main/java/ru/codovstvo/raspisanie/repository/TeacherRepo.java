package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Teacher;

public interface TeacherRepo extends CrudRepository<Teacher, Long> {
}