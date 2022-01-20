package fr.formation.cinema.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.cinema.bll.FilmManager;
import fr.formation.cinema.bo.Film;

@RestController
public class FilmWs {

	@Autowired
	private FilmManager filmManager;
	
	@GetMapping("/WS/film")
	public List<Film> getAllFilm()
	{
		return filmManager.getAll();
	}
	
	@GetMapping("/WS/film/{id}")
	public Film OneFilm(@PathVariable("id") Integer id)
	{
		return filmManager.getById(id);
	}
	
	@DeleteMapping("/WS/film/{id}")
	public void deleteFilm(@PathVariable("id") Integer id)
	{
		filmManager.deleteById(id);
	}
	
	@PostMapping("/WS/film")
	public void createFilm(@RequestBody Film film) 
	{
		filmManager.add(film);
	}
	@PutMapping("/WS/film")
	
	public void modifyFilm(@RequestBody Film film)
	{
		filmManager.modify(film);
	}
}
