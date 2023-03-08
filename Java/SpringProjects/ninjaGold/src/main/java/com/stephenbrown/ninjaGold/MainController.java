package com.stephenbrown.ninjaGold;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class MainController {
    @RequestMapping("/activities")
    public String activities() {
    	return "activities.jsp";
    }
	
	@RequestMapping("/")
    public String index(HttpSession session,
    		@RequestParam(value="farm",required=false) String farm,
    		@RequestParam(value="house",required=false) String house,
    		@RequestParam(value="cave",required=false) String cave,
    		@RequestParam(value="quest",required=false) String quest
    		) {
    	int gold = 0;
    	session.setAttribute("gold", gold);
    	    	
    	ArrayList<String> activities = new ArrayList <String>();
    	
    	if(farm != null) {
    		activities.add("farm activity");
    		session.setAttribute("activities", activities);
    		return "redirect:/";
    	}
    	return "index.jsp";
	
}
 
}


