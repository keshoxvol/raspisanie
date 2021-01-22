package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import ru.codovstvo.raspisanie.models.Teachers;

public interface TeachersRepo extends CrudRepository<Teachers, Long> {
    
}