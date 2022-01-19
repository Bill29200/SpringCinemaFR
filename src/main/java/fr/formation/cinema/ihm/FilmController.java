package fr.formation.cinema.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.cinema.bll.FilmManager;
import fr.formation.cinema.bo.Film;


@Controller
public class FilmController {
	
	@Autowired
	FilmManager filmManager;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("lstFilm",filmManager.getAll());
		return "index";
	}
	

}
