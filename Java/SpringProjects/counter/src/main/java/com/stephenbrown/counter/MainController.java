package com.stephenbrown.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/your_server")

@Controller
public class MainController{
	@RequestMapping("")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count",0);
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			session.setAttribute ("count",currentCount + 1);
			System.out.println("current count:" + currentCount);
		}
		
		return "index.jsp";
	} 
	
	@RequestMapping("/counter")
	public String counter(HttpSession session,Model model) {
		
//		if (session.getAttribute("count") == null) {
//			Integer showCount = (Integer) session.getAttribute("count");
//			session.setAttribute("count",0);
//		}else {
			Integer showCount = (Integer) session.getAttribute("count");
			System.out.println("show count:" + showCount);

		
		return "counter.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		System.out.println("reset");
		session.setAttribute("count",0);
		return "counter.jsp";
	}
}