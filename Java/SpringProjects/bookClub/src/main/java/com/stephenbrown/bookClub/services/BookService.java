package com.stephenbrown.bookClub.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.bookClub.models.Book;
import com.stephenbrown.bookClub.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepo;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepo = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // updateBook will take in a Book object and save it to our database
    // our repository will automatically update an existing Book object if their IDs match
    public Book updateBook(Book Book) {
		return bookRepo.save(Book);
	}
	
    // to delete a book, we simply pass in the book ID and if our repository finds it, the book will be deleted
	public void deleteBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			bookRepo.deleteById(id);
		}
	}
}

