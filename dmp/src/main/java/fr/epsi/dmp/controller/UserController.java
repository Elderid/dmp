package fr.epsi.dmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.epsi.dmp.services.UserService;



@Controller
@SessionAttributes("userSession")
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView userLogin(@ModelAttribute("email") String identifiant, @ModelAttribute("password") String password) {
		ModelAndView model = new ModelAndView("Home");
		if(userService.identifiantExists(identifiant)){
			if(userService.passwordMatchWithIdentifiant(identifiant, password)){
				model.setViewName("User");
				model.addObject("userSession", userService.getUserByIdentifiant(identifiant));
			} else {
				model.addObject("loginError", "Le mot de passe est érroné");
			}
		} else {
			model.addObject("loginError", "L'identifiant saisi n'existe pas.");
		}
		return model;
	}
}