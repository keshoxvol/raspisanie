package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import ru.codovstvo.raspisanie.models.Things;

public interface ThingsRepo extends CrudRepository<Trings, Long> {
    
}