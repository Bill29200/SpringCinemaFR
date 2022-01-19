package fr.formation.cinema.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.cinema.bo.Reserver;

public interface ReserverDAO extends CrudRepository<Reserver, Integer> {

}
