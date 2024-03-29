package com.smartcontact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartcontact.dao.UserRepository;
import com.smartcontact.entities.Contact;
import com.smartcontact.entities.User;

@Controller
public class HomeController {
	
//	@Autowired
//	private UserRepository userRepository;
	
	//just for checking code is running or not
//	@GetMapping("/test")
//	@ResponseBody
//	public String test() {
//		
//		User user = new User();
//		user.setName("Harshal Sapkale 2");
//		user.setEmail("harshalsapkalee321@gmail.com");
//		
//		Contact contact = new Contact();
//		user.getContacts().add(contact);
//		userRepository.save(user);
//		
//		return "working";
//	}
	
	@RequestMapping("/")
	public String home(Model model) 
	{
		model.addAttribute("title","Home-Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) 
	{
		model.addAttribute("title","About-Smart Contact Manager");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) 
	{
		model.addAttribute("title","registration-Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";
		
	}
	
	
}
