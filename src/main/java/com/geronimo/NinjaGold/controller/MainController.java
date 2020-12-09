package com.geronimo.NinjaGold.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("")
	public String index() {
		return "redirect:/gold";
	}
	
	@RequestMapping("/gold")
	public String gold(HttpSession session) {
		
		if(session.getAttribute("pouch") == null) {
			session.setAttribute("pouch", 0);	
		}
		
		
		return "index.jsp";
	}
	
//	@RequestMapping(value="/process_money", method=RequestMethod.POST)
	@PostMapping("/process_money")
	public String process(@RequestParam(value="place") String place, HttpSession session) {
		
		int currentGold = (int) session.getAttribute("pouch");
		
		if(place.equals("farm")) {
				int random_int = (int) ((Math.random() * (21-10)) + 10);
				currentGold += random_int;
				
	}
		if(place.equals("cave")) {
			int random_int = (int) ((Math.random() * (11-5)) + 5);
			currentGold += random_int;
}
		if(place.equals("house")) {
			int random_int = (int) ((Math.random() * (6-2)) + 2);
			currentGold += random_int;
}
		if(place.equals("casino")) {
			int random_int = (int) ((Math.random() * (51- -50)) + -50);
			currentGold += random_int;
}
		session.setAttribute("pouch", currentGold);
		return "redirect:/gold";
		
	
}
