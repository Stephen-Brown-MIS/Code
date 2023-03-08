package com.stephenbrown.omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/omikuji")
@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
    	
    	return "index.jsp";
    } 
    
    @RequestMapping("/show")
    public String show() {
    	return "show.jsp";
    }  
    
    @RequestMapping("/collect")
    public String collect(
    	@RequestParam(value="points") String points,
    	@RequestParam(value="city") String city,
    	@RequestParam(value="name") String name,
    	@RequestParam(value="hobby") String hobby,
    	@RequestParam(value="thing") String thing,
    	@RequestParam(value="message") String message,
    	HttpSession session
    		) {
    	session.setAttribute("points", points);
    	session.setAttribute("city", city);
    	session.setAttribute("name", name);
    	session.setAttribute("hobby", hobby);
    	session.setAttribute("thing", thing);
    	session.setAttribute("message", message);
    	return "redirect:/omikuji/show";
    }
}
