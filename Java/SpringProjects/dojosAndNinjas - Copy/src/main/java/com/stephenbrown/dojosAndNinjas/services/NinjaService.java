package com.stephenbrown.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.dojosAndNinjas.models.Ninja;
import com.stephenbrown.dojosAndNinjas.repositories.NinjaRepository;
@Service
public class NinjaService {
    // adding the ninja repository as a dependency
    private final NinjaRepository ninjaRepository;
    
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    // returns all the ninjas
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // creates a ninja
    public Ninja createNinja(Ninja b) {
        return ninjaRepository.save(b);
    }
    // retrieves a ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    // updateNinja will take in a Ninja object and save it to our database
    // our repository will automatically update an existing Ninja object if their IDs match
    public Ninja updateNinja(Ninja Ninja) {
		return ninjaRepository.save(Ninja);
	}
	
    // to delete a ninja, we simply pass in the ninja ID and if our repository finds it, the ninja will be deleted
	public void deleteNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			ninjaRepository.deleteById(id);
		}
	}
}

