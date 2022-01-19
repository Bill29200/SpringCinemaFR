package fr.formation.cinema.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.cinema.bll.FilmManager;
import fr.formation.cinema.bo.Film;


@Controller
public class FilmController {
	
	@Autowired
	FilmManager filmManager;
	
	@GetMapping("/film")
	public String index(Model model) {
		model.addAttribute("lstFilms",filmManager.getAll());
		return "film";
	}
	
	@GetMapping("/detailsFilm/{id}")
	public String detailsFilm(Model model,@PathVariable("id") Integer id) {
		Film film = filmManager.getById(id);
				
		model.addAttribute("film",film);
		model.addAttribute("mode","detailsFilm");
		return "detailsFilm";
	}
	
	@GetMapping("/addFilm")
	public String addFilm(Model model,Film film) {
		model.addAttribute("id",0); // j'envoie un attribut id à 0 pour que l'url de retour du formulaire soit conforme à celle du modify
		model.addAttribute("mode","addFilm");
		return "filmForm";
	}
	
	@GetMapping("/deleteFilm/{id}")
	public String deleteFilm(@PathVariable("id") Integer id) {
		filmManager.deleteById(id);
		return "redirect:/film";
	}
	@PostMapping("/valid/{mode}/{id}")
	public String valid(Model model, @Valid Film film, BindingResult result, @PathVariable String mode, @PathVariable Integer id) {
		if(result.hasErrors()) {
			return "filmForm";
		}
		if("addFilm".equals(mode)) {
			filmManager.add(film);
			
		}
		else if("modifyFilm".equals(mode)) {
			film.setIdFilm(id); 
			filmManager.modify(film);
			
		}
		return "redirect:/film";
	}
	
	@GetMapping("/modifyFilm/{id}")
	public String modifyFilm(Model model,@PathVariable("id") Integer id, Film film) {
		film = filmManager.getById(id); 
		model.addAttribute("mode","modifyFilm");
		model.addAttribute("film",film); 
		model.addAttribute("id",id);
		return "filmForm";
	}

}
