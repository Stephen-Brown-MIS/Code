package com.stephenbrown.bookClub.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stephenbrown.bookClub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	// this method retrieves all the books from the database
    List<Book> findAll();
}
