package com.stephenbrown.bx.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.bx.models.Show;
import com.stephenbrown.bx.repositories.ShowRepository;
@Service
public class ShowService {
    // adding the show repository as a dependency
    private final ShowRepository showRepo;
    
    public ShowService(ShowRepository showRepository) {
        this.showRepo = showRepository;
    }
    // returns all the shows
    public List<Show> allShows() {
        return showRepo.findAll();
    }
    // creates a show
    public Show createShow(Show b) {
        return showRepo.save(b);
    }
    // retrieves a show
    public Show findShow(Long id) {
        Optional<Show> optionalShow = showRepo.findById(id);
        if(optionalShow.isPresent()) {
            return optionalShow.get();
        } else {
            return null;
        }
    }
    // updateShow will take in a Show object and save it to our database
    // our repository will automatically update an existing Show object if their IDs match
    public Show updateShow(Show Show) {
		return showRepo.save(Show);
	}
	
    // to delete a show, we simply pass in the show ID and if our repository finds it, the show will be deleted
	public void deleteShow(Long id) {
		Optional<Show> optionalShow = showRepo.findById(id);
		if(optionalShow.isPresent()) {
			showRepo.deleteById(id);
		}
	}
}

