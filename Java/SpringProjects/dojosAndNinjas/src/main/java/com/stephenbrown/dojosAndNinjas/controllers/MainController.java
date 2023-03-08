package com.stephenbrown.dojosAndNinjas.controllers;

import java.util.List;

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

import com.stephenbrown.dojosAndNinjas.models.Expense;
import com.stephenbrown.dojosAndNinjas.services.ExpenseService;

@Controller

public class MainController {
	@Autowired
	ExpenseService expenseService;

	@RequestMapping("/expenses")
	public String index(Model model,@ModelAttribute("expense") Expense expense) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses",expenses);
		return "index.jsp";
	}

    @RequestMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }
    
	@RequestMapping(value="/expenses/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result,@PathVariable("id") Long 	id) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		expenseService.updateExpense(expense);
		return "redirect:/expenses";
	} 

	@RequestMapping("/expenses/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id); 
		model.addAttribute("expense",expense); 
		return "show.jsp";
	} 
	
	@GetMapping("/expenses/new")
	public String newExpense(@ModelAttribute("expense") Expense expense) {
		return "new.jsp";
	}
	
	@PostMapping("/createExpense")
	public String create(
			@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses",expenses);
			return "index.jsp";
		}  		
		expenseService.createExpense(expense);
		return "redirect:/expenses";
	}
	
	@DeleteMapping("/expenses/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	} 
	 
}

