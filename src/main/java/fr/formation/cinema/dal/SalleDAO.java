package fr.formation.cinema.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.cinema.bo.Salle;

public interface SalleDAO extends CrudRepository<Salle, Integer> {

}
