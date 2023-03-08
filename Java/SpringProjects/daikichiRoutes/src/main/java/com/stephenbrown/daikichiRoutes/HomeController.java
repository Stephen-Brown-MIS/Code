package com.stephenbrown.daikichiRoutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/daikichi")

public class HomeController {
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
