package com.stephenbrown.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stephenbrown.relationships.models.Person;

    
@Repository
    public interface PersonRepository extends CrudRepository<Person, Long>{
    	// this method retrieves all the licenses from the database
        List<Person> findAll();    
}
