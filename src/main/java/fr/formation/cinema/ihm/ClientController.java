package fr.formation.cinema.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.cinema.bll.ClientManager;
import fr.formation.cinema.bo.Client;

@Controller

public class ClientController {
	@Autowired
	ClientManager clientManager;
	
	@GetMapping("/client")
	public String indexClient(Model model) {
		model.addAttribute("lstClients",clientManager.getAll());
		return "client";
	}
	
	@GetMapping("/detailsClient/{id}")
	public String detailsClient(Model model,@PathVariable("id") Integer id) {
		Client client = clientManager.getById(id);
				
		model.addAttribute("client",client);
		model.addAttribute("mode","detailsClient");
		return "detailsClient";
	}
	
	@GetMapping("/addClient")
	public String addClient(Model model,Client client) {
		model.addAttribute("id",0); // j'envoie un attribut id à 0 pour que l'url de retour du formulaire soit conforme à celle du modify
		model.addAttribute("mode","addClient");
		return "clientForm";
	}
	
	@GetMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable("id") Integer id) {
		clientManager.deleteById(id);
		return "redirect:/client";
	}
	@PostMapping("/validClient/{mode}/{id}")
	public String valid(Model model, @Valid Client client, BindingResult result, @PathVariable String mode, @PathVariable Integer id) {
		if(result.hasErrors()) {
			return "clientForm";
		}
		if("addClient".equals(mode)) {
			clientManager.add(client);
			
		}
		else if("modifyClient".equals(mode)) {
			client.setIdClient(id); 
			clientManager.modify(client);
			
		}
		return "redirect:/client";
	}
	
	@GetMapping("/modifyClient/{id}")
	public String modifyClient(Model model,@PathVariable("id") Integer id, Client client) {
		client = clientManager.getById(id); 
		model.addAttribute("mode","modifyClient");
		model.addAttribute("client", client); 
		model.addAttribute("id",id);
		return "clientForm";
	}
	
	
}
