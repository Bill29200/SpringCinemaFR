package fr.formation.cinema.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.cinema.bll.SalleManager;
import fr.formation.cinema.bo.Salle;

@Controller
public class SalleController {

	@Autowired
	SalleManager salleManager;
	
	//..................................

	@GetMapping("/salle")
	public String indexSalle(Model model) {
		model.addAttribute("lstSalles", salleManager.getAll());
		return "salle";
	}
	//..................................

	@GetMapping("/detailsSalle/{id}")
	public String detailsSalle(Model model, @PathVariable("id") Integer id) {
		Salle salle = salleManager.getById(id);

		model.addAttribute("salle", salle);
		model.addAttribute("mode", "detailsSalle");
		return "detailsSalle";
	}
	//..................................


	@GetMapping("/addSalle")
	public String addSalle(Model model, Salle salle) {
		model.addAttribute("id", 0);
		model.addAttribute("mode", "addSalle");
		return "salleForm";
	}
	//..................................

	@GetMapping("/deleteSalle/{id}")
	public String deleteSalle(@PathVariable("id") Integer id) {
		salleManager.deleteById(id);
		return "redirect:/salle";
	}

	@PostMapping("/validSalle/{mode}/{id}")
	public String validSalle(Model model, @Valid Salle salle, BindingResult result, @PathVariable String mode, @PathVariable Integer id) {
		if(result.hasErrors()) {
			return "salleForm";
		}
		if("addSalle".equals(mode)) {
			salleManager.add(salle);
			
		}
		else if("modifySalle".equals(mode)) {
			salle.setIdSalle(id); 
			salleManager.modify(salle);
			
		}
		return "redirect:/salle";
	}

	
	@GetMapping("/modifySalle/{id}")
	public String modifySalle(Model model, @PathVariable("id") Integer id, Salle salle) {
		salle = salleManager.getById(id);
		model.addAttribute("mode", "modifySalle");
		model.addAttribute("salle", salle);
		model.addAttribute("id", id);
		return "salleForm";
	}

}
