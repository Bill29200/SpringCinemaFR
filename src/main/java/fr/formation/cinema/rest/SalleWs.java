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

import fr.formation.cinema.bll.SalleManager;
import fr.formation.cinema.bo.Salle;

@RestController
public class SalleWs {

	
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
}
