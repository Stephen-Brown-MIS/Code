package com.stephenbrown.bookClub.controllers;
import java.util.List;

import javax.servlet.http.HttpSession;
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

	//@RequestMapping("/books")
	//public String index(Model model,@ModelAttribute("book") Book book,HttpSession session) {
	//	List<Book> books = bookService.allBooks();
	//	model.addAttribute("books",books);
	//	return "dashboard.jsp";
	//	//return "redirect:/dashboard";
	//}
	
	@GetMapping("/books")
	public String dashboard(Model model,@ModelAttribute("book") Book book,HttpSession session) {
		if (session.getAttribute("userId") == null) {
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
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookServ.findBook(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result,@PathVariable("id") Long 	id) {
    	if(result.hasErrors()) {
    		return "edit.jsp";
    	}
    	bookServ.updateBook(book);
    	return "redirect:/books";
    } 
	@RequestMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Book book = bookServ.findBook(id); 
		model.addAttribute("book",book); 
		return "show.jsp";
	}  
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "add.jsp";
	}
	
	@PostMapping("/createBook")
	public String create(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Book> books = bookServ.allBooks();
			model.addAttribute("books",books);
			return "add.jsp";
		}  		
		bookServ.createBook(book);
		return "redirect:/books";
	}
}


