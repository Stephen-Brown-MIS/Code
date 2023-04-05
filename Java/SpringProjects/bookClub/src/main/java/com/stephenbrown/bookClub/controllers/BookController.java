package com.stephenbrown.bookClub.controllers;
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

import com.stephenbrown.bookClub.models.Book;
import com.stephenbrown.bookClub.models.User;
import com.stephenbrown.bookClub.services.BookService;
import com.stephenbrown.bookClub.services.UserService;

@Controller

public class BookController {
	@Autowired
	BookService bookServ;

	@Autowired
	UserService userServ;
	
	@GetMapping("/books")
	public String dashboard(Model model,@ModelAttribute("book") Book book,HttpSession session, RedirectAttributes redirect) {
		if (session.getAttribute("userId") == null) {
			redirect.addFlashAttribute("error","Please login");
			return "redirect:/";
		}
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findbyId(id);
		model.addAttribute("loggedUser",loggedUser);
		List<Book> books = bookServ.allBooks();
		model.addAttribute("books",books);
		return "dashboard.jsp";
	}

    @RequestMapping("/books/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model,HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
    	Book book = bookServ.findBook(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result,@PathVariable("id") Long id,HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}   	
    	
    	if(result.hasErrors()) {
    		return "edit.jsp";
    	}
		Long userId = (Long) session.getAttribute("userId");
		book.setPostedBy(userServ.findbyId(userId));
    	bookServ.updateBook(book);
    	return "redirect:/books";
    } 

    @RequestMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model,HttpSession session ) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Book book = bookServ.findBook(id); 
		model.addAttribute("book",book); 
		Long idSess = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findbyId(idSess);
		model.addAttribute("loggedUser",loggedUser);

		return "show.jsp";
	}  
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "add.jsp";
	}
	
	@PostMapping("/createBook")
	public String create(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model,
			HttpSession session) {
		if(result.hasErrors()) {
			List<Book> books = bookServ.allBooks();
			model.addAttribute("books",books);
			return "add.jsp";
		}  		
		Long userId = (Long) session.getAttribute("userId");
		book.setPostedBy(userServ.findbyId(userId));
		bookServ.createBook(book);
		return "redirect:/books";
	}
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookServ.deleteBook(id);
		return "redirect:/books";
	}
}


