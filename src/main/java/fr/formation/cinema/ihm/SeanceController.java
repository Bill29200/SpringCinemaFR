package fr.formation.cinema.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.cinema.bll.SeanceManager;
import fr.formation.cinema.bo.Seance;

@Controller
public class SeanceController {
	
	@Autowired
	SeanceManager seanceManager;
	
	@GetMapping("/seance")
	public String indexSeance(Model model) {
		model.addAttribute("lstSeances",seanceManager.getAll());
		return "seance";
	}
	
	@GetMapping("/detailsSeance/{id}")
	public String detailsSeance(Model model,@PathVariable("id") Integer id) {
		Seance seance = seanceManager.getById(id);
				
		model.addAttribute("seance", seance);
		model.addAttribute("mode","detailsSeance");
		return "detailsSeance";
	}
	
	@GetMapping("/addSeance")
	public String addSeance(Model model,Seance seance) {
		model.addAttribute("id",0); 
		model.addAttribute("mode","addSeance");
		return "seanceForm";
	}
	
	@GetMapping("/deleteSeance/{id}")
	public String deleteSeance(@PathVariable("id") Integer id) {
		seanceManager.deleteById(id);
		return "redirect:/seance";
	}
	@PostMapping("/validSeance/{mode}/{id}")
	public String valid(Model model, @Valid Seance seance, BindingResult result, @PathVariable String mode, @PathVariable Integer id) {
		if(result.hasErrors()) {
			return "seanceForm";
		}
		if("addSeance".equals(mode)) {
			seanceManager.add(seance);
			
		}
		else if("modifySeance".equals(mode)) {
			seance.setIdSeance(id); 
			seanceManager.modify(seance);
			
		}
		
		return "redirect:/seance";
	}
	
	@GetMapping("/modifySeance/{id}")
	public String modifySeance(Model model,@PathVariable("id") Integer id, Seance seance) {
		seance = seanceManager.getById(id); 
		model.addAttribute("mode","modifySeance");
		model.addAttribute("seance", seance); 
		model.addAttribute("id",id);
		return "seanceForm";
	}
}
