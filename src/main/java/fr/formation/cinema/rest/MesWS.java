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
import fr.formation.cinema.bll.SalleManager;
import fr.formation.cinema.bll.SeanceManager;
import fr.formation.cinema.bo.Film;
import fr.formation.cinema.bo.Salle;
import fr.formation.cinema.bo.Seance;

@RestController
public class MesWS {
	
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
	//************************************************************************
	@Autowired
	private SalleManager salleManager;
	
	@GetMapping("/WS/salle")
	public List<Salle> getAllSalle()
	{
		return salleManager.getAll();
	}
	
	@GetMapping("/WS/salle/{id}")
	public Salle OneSalle(@PathVariable("id") Integer id)
	{
		return salleManager.getById(id);
	}
	
	@DeleteMapping("/WS/salle/{id}")
	public void deleteSalle(@PathVariable("id") Integer id)
	{
		salleManager.deleteById(id);
	}
	
	@PostMapping("/WS/salle")
	public void createSalle(@RequestBody Salle salle) 
	{
		salleManager.add(salle);
	}
	@PutMapping("/WS/salle")
	
	public void modifySalle(@RequestBody Salle salle)
	{
		salleManager.modify(salle);
	}
	//*************************************************************************
	@Autowired
	private SeanceManager seanceManager;
	
	@GetMapping("/WS/seance")
	public List<Seance> getAllSeance()
	{
		return seanceManager.getAll();
	}
	
	@GetMapping("/WS/seance/{id}")
	public Seance OneSeance(@PathVariable("id") Integer id)
	{
		return seanceManager.getById(id);
	}
	
	@DeleteMapping("/WS/seance/{id}")
	public void deleteSeance(@PathVariable("id") Integer id)
	{
		seanceManager.deleteById(id);
	}
	
	@PostMapping("/WS/seance")
	public void createSeance(@RequestBody Seance seance) 
	{
		seanceManager.add(seance);
	}
	@PutMapping("/WS/seance")
	
	public void modifySeance(@RequestBody Seance seance)
	{
		seanceManager.modify(seance);
	}
}
