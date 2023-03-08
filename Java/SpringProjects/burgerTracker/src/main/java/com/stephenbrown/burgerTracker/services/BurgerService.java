package com.stephenbrown.burgerTracker.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.burgerTracker.models.Burger;
import com.stephenbrown.burgerTracker.repositories.BurgerRepository;
@Service
public class BurgerService {
    // adding the burger repository as a dependency
    private final BurgerRepository burgerRepository;
    
    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    // returns all the burgers
    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
    // creates a burger
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a burger
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
    // updateBurger will take in a Burger object and save it to our database
    // our repository will automatically update an existing Burger object if their IDs match
    public Burger updateBurger(Burger Burger) {
		return burgerRepository.save(Burger);
	}
	
    // to delete a burger, we simply pass in the burger ID and if our repository finds it, the burger will be deleted
	public void deleteBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if(optionalBurger.isPresent()) {
			burgerRepository.deleteById(id);
		}
	}
}

