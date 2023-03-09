package com.stephenbrown.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.dojosAndNinjas.models.Dojo;
import com.stephenbrown.dojosAndNinjas.repositories.DojoRepository;
@Service
public class DojoService {
    // adding the dojo repository as a dependency
    private final DojoRepository dojoRepository;
    
    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }
    // returns all the dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    // creates a dojo
    public Dojo createDojo(Dojo b) {
        return dojoRepository.save(b);
    }
    // retrieves a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    // updateDojo will take in a Dojo object and save it to our database
    // our repository will automatically update an existing Dojo object if their IDs match
    public Dojo updateDojo(Dojo Dojo) {
		return dojoRepository.save(Dojo);
	}
	
    // to delete a dojo, we simply pass in the dojo ID and if our repository finds it, the dojo will be deleted
	public void deleteDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			dojoRepository.deleteById(id);
		}
	}
}

