package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Things;

public interface ThingsRepo extends CrudRepository<Things, Long> {
    
}