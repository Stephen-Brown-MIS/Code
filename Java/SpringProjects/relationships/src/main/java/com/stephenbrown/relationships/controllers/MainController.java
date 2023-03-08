package com.stephenbrown.relationships.controllers;

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

import com.stephenbrown.relationships.models.License;
import com.stephenbrown.relationships.models.Person;
import com.stephenbrown.relationships.services.LicenseService;
import com.stephenbrown.relationships.services.PersonService;

@Controller

public class MainController {

	@Autowired
	PersonService personService;
	
	@Autowired
	LicenseService licenseService;
	
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/createPerson")
	public String createAPerson(
			@Valid @ModelAttribute("person") Person person,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Person> persons = personService.allPersons();
			model.addAttribute("persons",persons);
			return "newPerson.jsp";
		}  		
		personService.createPerson(person);
		return "redirect:/persons/new";
	}
	
	@GetMapping("/persons/{person_id}")
	public String showPerson(@PathVariable Long person_id, Model model) {
	    
	    Person someAwesomePerson = personService.findPerson(person_id);
	    model.addAttribute("person", someAwesomePerson);
	    List<License> licenses = licenseService.allLicenses();
	    model.addAttribute("licenses", licenses);
	    return "showPerson.jsp";
	}
	@GetMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license,Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "newLicense.jsp";
	}
	
	@PostMapping("/createLicense")
	public String licenses(@Valid @ModelAttribute("license") License license) {
	    // error handling with binding result omitted    
	    licenseService.createLicense(license); // Already has the person!
	        
	    return "redirect:/licenses/new";
	}
}
