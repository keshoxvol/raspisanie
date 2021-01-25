package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Teachers;

public interface TeachersRepo extends CrudRepository<Teachers, Long> {
    
}