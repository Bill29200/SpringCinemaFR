package fr.formation.cinema.bll;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.cinema.bo.Film;
import fr.formation.cinema.dal.FilmDAO;

@Service
public class FilmManagerImpl implements FilmManager {
	
	@Autowired
	private FilmDAO filmDAO;

	@Override
	@Transactional
	public void add(Film film) {
		filmDAO.save(film);

	}

	@Override
	@Transactional
	public void modify(Film film) {
		filmDAO.save(film);

	}

	@Override
	@Transactional
	public void delete(Film film) {
		filmDAO.delete(film);

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		filmDAO.deleteById(id);

	}

	@Override
	public Film getById(Integer id) {
		
		return filmDAO.findById(id).orElse(null);
	}

	@Override
	public List<Film> getAll() {
		
		return (List<Film>) filmDAO.findAll() ;
	}

}
