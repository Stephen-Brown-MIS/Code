package com.stephenbrown.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
		@RequestMapping("/")
		public String index() {
			return "Hello World";
		}
		@RequestMapping("/world")
		public String world() {
			return "Class level annotation are cool too!";
		}
}
