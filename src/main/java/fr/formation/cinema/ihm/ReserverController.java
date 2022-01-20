package fr.formation.cinema.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.cinema.bll.ReserverManager;
import fr.formation.cinema.bo.Reserver;

@Controller
public class ReserverController {

	@Autowired
	ReserverManager reserverManager;

	@GetMapping("/reserver")
	public String indexReserver(Model model) {
		model.addAttribute("lstReservers", reserverManager.getAll());
		return "reserver";
	}

	@GetMapping("/detailsReserver/{id}")
	public String detailsReserver(Model model, @PathVariable("id") Integer id) {
		Reserver reserver = reserverManager.getById(id);

		model.addAttribute("reserver", reserver);
		model.addAttribute("mode", "detailsReserver");
		return "detailsReserver";
	}

	@GetMapping("/addReserver")
	public String addReservation(Model model, Reserver reserver) {
		model.addAttribute("id", 0);
		model.addAttribute("mode", "addReserver");
		return "reserverForm";
	}

	@GetMapping("/deleteReserver/{id}")
	public String deleteReserver(@PathVariable("id") Integer id) {
		reserverManager.deleteById(id);
		return "redirect:/reserver";
	}

	@PostMapping("/validReserver/{mode}/{id}")
	public String valid(Model model, @Valid Reserver reserver, BindingResult result, @PathVariable String mode,
			@PathVariable Integer id) {
		if (result.hasErrors()) {
			return "reserverForm";
		}
		if ("addReserver".equals(mode)) {
			reserverManager.add(reserver);

		} else if ("modifyReservation".equals(mode)) {
			reserver.setIdReserver(id);
			reserverManager.modify(reserver);

		}
		return "redirect:/reserver";
	}

	@GetMapping("/modifyReserver/{id}")
	public String modifyReserver(Model model, @PathVariable("id") Integer id, Reserver reserver) {
		reserver = reserverManager.getById(id);
		model.addAttribute("mode", "modifyReserver");
		model.addAttribute("reserver", reserver);
		model.addAttribute("id", id);
		return "reserverForm";
	}

}
