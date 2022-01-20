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

import fr.formation.cinema.bll.ClientManager;
import fr.formation.cinema.bo.Client;

@RestController
public class ClientWs {

	
	@Autowired
	private ClientManager clientManager;
	
	@GetMapping("/WS/client")
	public List<Client> getAllClient()
	{
		return clientManager.getAll();
	}
	
	@GetMapping("/WS/client/{id}")
	public Client OneClient(@PathVariable("id") Integer id)
	{
		return clientManager.getById(id);
	}
	
	@DeleteMapping("/WS/client/{id}")
	public void deleteClient(@PathVariable("id") Integer id)
	{
		clientManager.deleteById(id);
	}
	
	@PostMapping("/WS/clients")
	public void createClient(@RequestBody Client client) 
	{
		clientManager.add(client);
	}
	@PutMapping("/WS/client")
	
	public void modifyClient(@RequestBody Client client)
	{
		clientManager.modify(client);
	}
	
}
