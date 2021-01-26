package ru.codovstvo.raspisanie.repository;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.raspisanie.models.Party;

public interface PartyRepo extends CrudRepository<Party, Long> {
    
}