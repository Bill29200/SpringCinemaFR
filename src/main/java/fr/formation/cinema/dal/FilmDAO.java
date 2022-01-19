package fr.formation.cinema.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.cinema.bo.Film;

public interface FilmDAO extends CrudRepository<Film, Integer> {

}
