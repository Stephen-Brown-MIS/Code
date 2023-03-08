package com.stephenbrown.books.controllers;

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

import com.stephenbrown.books.models.Book;
import com.stephenbrown.books.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;

	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books",books);
		return "index.jsp";
	}

	@RequestMapping("/books/{bookId}")
	public String show(@PathVariable("bookId") Long bookId, Model model) {
		System.out.println(bookId);
		Book book = bookService.findBook(bookId); 
		
		model.addAttribute("book",book); 
		
		return "show.jsp";
	} 
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	@PostMapping("/books")
	public String create(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result) {
		bookService.createBook(book);
		return "redirect:/books";
	}
}


	