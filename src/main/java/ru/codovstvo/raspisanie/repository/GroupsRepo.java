package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import ru.codovstvo.raspisanie.models.Groups;

public interface GroupsRepo extends CrudRepository<Groups, Long> {
    
}