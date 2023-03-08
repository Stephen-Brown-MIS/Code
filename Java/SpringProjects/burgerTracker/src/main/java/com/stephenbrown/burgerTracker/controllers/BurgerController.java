package com.stephenbrown.burgerTracker.controllers;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stephenbrown.burgerTracker.models.Burger;
import com.stephenbrown.burgerTracker.services.BurgerService;

@Controller

public class BurgerController {
	@Autowired
	BurgerService burgerService;

	@RequestMapping("/burgers")
	public String index(Model model,@ModelAttribute("burger") Burger burger) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers",burgers);
		return "index.jsp";
	}

    @RequestMapping("/burgers/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerService.findBurger(id);
        model.addAttribute("burger", burger);
        return "edit.jsp";
    }
    
	@RequestMapping(value="/burgers/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result,@PathVariable("id") Long 	id) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		burgerService.updateBurger(burger);
		return "redirect:/burgers";
	} 
	
	@GetMapping("/burgers/new")
	public String newBurger(@ModelAttribute("burger") Burger burger) {
		return "new.jsp";
	}
	
	@PostMapping("/createBurger")
	public String create(
			@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurgers();
			model.addAttribute("burgers",burgers);
			return "index.jsp";
		}  		
		burgerService.createBurger(burger);
		return "redirect:/burgers";
	}
}


