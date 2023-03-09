package com.stephenbrown.dojosAndNinjas.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stephenbrown.dojosAndNinjas.models.Ninja;
import com.stephenbrown.dojosAndNinjas.models.Dojo;
import com.stephenbrown.dojosAndNinjas.services.NinjaService;
import com.stephenbrown.dojosAndNinjas.services.DojoService;

@Controller

public class MainController {

	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/createDojo")
	public String createADojo(
			@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos",dojos);
			return "newDojo.jsp";
		}  		
		dojoService.createDojo(dojo);
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/{dojo_id}")
	public String showDojo(@PathVariable Long dojo_id, Model model) {
	    
	    Dojo someAwesomeDojo = dojoService.findDojo(dojo_id);
	    model.addAttribute("dojo", someAwesomeDojo);
	    List<Ninja> ninjas = ninjaService.allNinjas();
	    model.addAttribute("ninjas", ninjas);
	    return "showDojo.jsp";
	}
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja,Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String ninjas(@Valid @ModelAttribute("ninja") Ninja ninja) {
	    // error handling with binding result omitted    
	    ninjaService.createNinja(ninja); // Already has the dojo!
	    return "redirect:/ninjas/new";
	}
}
