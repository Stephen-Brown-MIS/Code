package com.stephenbrown.bx.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stephenbrown.bx.models.Show;

@Repository
public interface ShowRepository extends CrudRepository<Show, Long>{
	// this method retrieves all the shows from the database
    List<Show> findAll();
}
