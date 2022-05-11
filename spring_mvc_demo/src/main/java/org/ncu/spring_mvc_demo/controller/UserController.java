package org.ncu.spring_mvc_demo.controller;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//@RequestMapping("/verify")
public class UserController {

	@ModelAttribute("user")
	public User getUser() {
		
		return new User();
	}
	
	@RequestMapping(value="/showForm", method=RequestMethod.GET)
	public String showForm() {
		
		return "showForm";
	}
	
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("user") User user,BindingResult bindingResult, Model model) {
		
//		System.out.println("User Name: "+user.getUserName()+" User Password "+user.getUserPassword()+" User age "+user.getuserAge()+ " Gender: "+user.getUserGender()+" User's chosen language "+user.getOtherOptions());
		
	
		if(bindingResult.hasErrors())
		{
			return "showForm";
		}
		else {
		return "confirmation";
		}
	}
	
}