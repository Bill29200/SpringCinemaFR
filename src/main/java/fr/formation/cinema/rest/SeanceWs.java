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

import fr.formation.cinema.bll.SeanceManager;
import fr.formation.cinema.bo.Seance;

@RestController
public class SeanceWs {
	
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
