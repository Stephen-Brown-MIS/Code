package com.stephenbrown.helloHuman;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false)String name,
//						@RequestParam(value="times", required=false)String times,
						@RequestParam(value="last_name", required=false)String last_name) {
		
//		if (times!=null) {
//			int numtimes = Integer.parseInt(times);
//		}else {
//			int numtimes = 1;
//		}
//		
//		ArrayList<String> nameList = new Arraylist<String>();
//		for (int i=0; i < numtimes; i++) {  
//			nameList.add("Hello " + name + " " + last_name+ " ");
//		}
		
		
		if (name == null) {
			return "Hello Human";
		}else if (last_name == null){
			return "Hello " + name;
		}else {
			return "Hello " + name + " " + last_name;
		}
	}
	


}
