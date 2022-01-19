package fr.formation.cinema.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.cinema.bo.Client;

public interface ClientDAO extends CrudRepository<Client, Integer> {

}
