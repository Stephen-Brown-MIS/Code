package com.stephenbrown.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.relationships.models.Person;
import com.stephenbrown.relationships.repositories.PersonRepository;
@Service
public class PersonService {
    // adding the person repository as a dependency
    private final PersonRepository personRepository;
    
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    // returns all the persons
    public List<Person> allPersons() {
        return personRepository.findAll();
    }
    // creates a person
    public Person createPerson(Person b) {
        return personRepository.save(b);
    }
    // retrieves a person
    public Person findPerson(Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else {
            return null;
        }
    }
    // updatePerson will take in a Person object and save it to our database
    // our repository will automatically update an existing Person object if their IDs match
    public Person updatePerson(Person Person) {
		return personRepository.save(Person);
	}
	
    // to delete a person, we simply pass in the person ID and if our repository finds it, the person will be deleted
	public void deletePerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			personRepository.deleteById(id);
		}
	}
}

