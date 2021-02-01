package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Thing;

public interface ThingRepo extends CrudRepository<Thing, Long> {
    
}