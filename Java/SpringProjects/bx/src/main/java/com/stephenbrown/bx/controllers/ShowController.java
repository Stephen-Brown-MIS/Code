package com.stephenbrown.bx.controllers;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.stephenbrown.bx.models.Show;
import com.stephenbrown.bx.models.User;
import com.stephenbrown.bx.services.ShowService;
import com.stephenbrown.bx.services.UserService;

@Controller

public class ShowController {
	@Autowired
	ShowService showServ;

	@Autowired
	UserService userServ;
	
	@GetMapping("/shows")
	public String dashboard(Model model,@ModelAttribute("show") Show show,HttpSession session, RedirectAttributes redirect) {
		if (session.getAttribute("userId") == null) {
			redirect.addFlashAttribute("error","Please login");
			return "redirect:/";
		}
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findbyId(id);
		model.addAttribute("loggedUser",loggedUser);
		List<Show> shows = showServ.allShows();
		model.addAttribute("shows",shows);
		return "dashboard.jsp";
	}

    @RequestMapping("/shows/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model,HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
    	Show show = showServ.findShow(id);
        model.addAttribute("show", show);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/shows/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("show") Show show, BindingResult result,@PathVariable("id") Long id,HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}   	
    	
    	if(result.hasErrors()) {
    		return "edit.jsp";
    	}
		Long userId = (Long) session.getAttribute("userId");
		show.setPostedBy(userServ.findbyId(userId));
    	showServ.updateShow(show);
    	return "redirect:/shows";
    } 

    @RequestMapping("/shows/{id}")
	public String display(@PathVariable("id") Long id, Model model,HttpSession session ) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Show show = showServ.findShow(id); 
		model.addAttribute("show",show); 
		Long idSess = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findbyId(idSess);
		model.addAttribute("loggedUser",loggedUser);

		return "display.jsp";
	}  
	
	@GetMapping("/shows/new")
	public String newShow(@ModelAttribute("show") Show show, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "add.jsp";
	}
	
	@PostMapping("/createShow")
	public String create(
			@Valid @ModelAttribute("show") Show show,
			BindingResult result,
			Model model,
			HttpSession session) {
		if(result.hasErrors()) {
			List<Show> shows = showServ.allShows();
			model.addAttribute("shows",shows);
			return "add.jsp";
		}  		
		Long userId = (Long) session.getAttribute("userId");
		show.setPostedBy(userServ.findbyId(userId));
		showServ.createShow(show);
		return "redirect:/shows";
	}
	@DeleteMapping("/shows/{id}")
	public String deleteShow(@PathVariable("id") Long id) {
		showServ.deleteShow(id);
		return "redirect:/shows";
	}
}


