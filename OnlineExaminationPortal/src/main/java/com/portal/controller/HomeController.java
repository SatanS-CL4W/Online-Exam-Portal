package com.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.portal.Repository.UserRepository;
import com.portal.entities.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/login") 
	public String formHandler(Model m){
		m.addAttribute("title", "Login: Online Exam Portal");
		return "login";
	}
	
	
	@GetMapping("/about") 
	public String aboutHandler(Model m){
		m.addAttribute("title", "About us: Online Exam Portal");

		return "about";
	}
	
	@GetMapping("/home") 
	public String homeHandler(Model m){
		m.addAttribute("title", "Home: Online Exam Portal");

		return "home";
	}
	
	@PostMapping("/doLogin")
	public String requestHandler(@ModelAttribute("user") User user, Model m) {
		
		m.addAttribute("user", new User());
		this.userRepository.save(user);
		
		System.out.println(user);
		return "exam-instructions-dashboard";
	}
	
	@PostMapping("/start-exam")
	public String startExamHandler(Model m) {
		
		return "start-exam";
	}
	
	@PostMapping("/submit-exam")
	public String submitExamHandler(Model m) {
		
		return "submit-exam";
	}
	
	

}
