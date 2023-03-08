package com.stephenbrown.daikichiPathVariables;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping ("/daikichi")

public class HomeController {
	
	@RequestMapping("/travel/{destination}")
	public String showDestination(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination;
	}
		
	@RequestMapping("/lotto/{lottoNum}")
	public String showLottoPick(@PathVariable("lottoNum") String lottoNum) {
		int lottoNumber = Integer.parseInt(lottoNum);
		if (lottoNumber % 2 == 0) {
			return "You will take a grand journey in the near future, but be weaty of tempting offers."; 
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
			
	}
	@RequestMapping("")
	public String index() {
		return "Welcome";
	}
	@RequestMapping("/today")
	public String today() {
		return "Carpe Diem!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "...it's only a day away!";
	}
	
}
