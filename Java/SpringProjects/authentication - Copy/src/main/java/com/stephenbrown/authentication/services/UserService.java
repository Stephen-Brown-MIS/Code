package com.stephenbrown.authentication.services;

import java.util.Optional;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.stephenbrown.authentication.models.LoginUser;
import com.stephenbrown.authentication.models.User;
import com.stephenbrown.authentication.repositories.UserRepository;
@Service
public class UserService {
    // adding the user repository as a dependency
    @Autowired
	private UserRepository userRepository;

    public User register(User u, BindingResult result) {
    	//check to see email is already in table
       	Optional<User> potentialUser = userRepository.findByEmail(u.getEmail());
    	if(potentialUser.isPresent()) {
    		System.out.println("Potential user is already in system");
    	//	result.rejectValue("email", null,"Email address already exisits");
    	}

    	
    	if(!u.getConfirm().equals(u.getPassword())) {
    		System.out.println("pass and confirm don't match");
    		result.rejectValue("confirm", null,"Passwords don't match");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
    	// if no errors, write to DB 
    	return userRepository.save(u); 
    }
    	
    	public User login(LoginUser l, BindingResult result) {
    		// call new repo feature findByEmail
    		Optional<User> optionalUser = userRepository.findByEmail(l.getEmail());
    		if(optionalUser.isEmpty()) {
    			return null;
    		}
    		User user = optionalUser.get();
    		if (!user.getPassword().equals(l.getPassword())) {
    			return null;
    		}
    		return user;
  	}
    	public User findbyId(Long id) {
    		Optional<User> optionalUser = userRepository.findById(id);
    		if (optionalUser.isEmpty()) {
    			return null;
    		}
    		return optionalUser.get();
    	}
}
