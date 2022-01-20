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

import fr.formation.cinema.bll.ReserverManager;
import fr.formation.cinema.bo.Reserver;

@RestController
public class ReserverWs {
	@Autowired
	private ReserverManager reserverManager;
	
	@GetMapping("/WS/reserver")
	public List<Reserver> getAllReserver()
	{
		return reserverManager.getAll();
	}
	
	@GetMapping("/WS/reserver/{id}")
	public Reserver OneReserver(@PathVariable("id") Integer id)
	{
		return reserverManager.getById(id);
	}
	
	@DeleteMapping("/WS/reserver/{id}")
	public void deleteReserver(@PathVariable("id") Integer id)
	{
		reserverManager.deleteById(id);
	}
	
	@PostMapping("/WS/reserver")
	public void createReserver(@RequestBody Reserver reserver) 
	{
		reserverManager.add(reserver);
	}
	@PutMapping("/WS/reserver")
	
	public void modifyReserver(@RequestBody Reserver reserver)
	{
		reserverManager.modify(reserver);
	}
	


}
