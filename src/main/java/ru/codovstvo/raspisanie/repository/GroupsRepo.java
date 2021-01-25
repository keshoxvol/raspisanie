package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Groups;

public interface GroupsRepo extends CrudRepository<Groups, Long> {
    
}