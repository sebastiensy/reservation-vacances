package fr.uha.miage.reservac.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.uha.miage.reservac.model.Utilisateur;
import fr.uha.miage.reservac.repository.UtilisateurRepository;

@Controller
public class CreateController {
	
	@Autowired
	private UtilisateurRepository userRepository;
	
	/*@RequestMapping("/create")
	public String requestCreatePage(Model model) {
		
		model.addAttribute("utilisateur", new Utilisateur());
		return "create";
	}*/
	
	@RequestMapping(value="/create")
	public String showForm(HttpSession session, Utilisateur user) {
		return "create";
	}

}
