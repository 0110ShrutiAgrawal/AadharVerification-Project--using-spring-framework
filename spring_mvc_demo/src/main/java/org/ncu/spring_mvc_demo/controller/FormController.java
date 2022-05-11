package org.ncu.spring_mvc_demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {
	@RequestMapping("/inputForm")
	public String inputForm() {
		return "input-form";
	}

	@RequestMapping("/processForm")
//using http servlet
// public String formHandler(HttpServletRequest request,Model model) {
// String name=request.getParameter("userName");
// String upper=name.toUpperCase();
// model.addAttribute("manipulatedName", upper);
// return "process-form";

//using controller annotations

	public String formHandler(@RequestParam("userName") String name, @RequestParam("userPass") String pass,
			@RequestParam("userGender") String gender,@RequestParam("lang")ArrayList<String> language,Model model) {
        String newgen=null;
		String upper = name.toUpperCase();
		model.addAttribute("manipulatedName", upper);
		String newpass = pass.toUpperCase();
		model.addAttribute("manipulatedPass", newpass);
		if (gender.equals("male")) {
			 newgen = "Mr " + upper;
		} else {
			 newgen = "Mrs " + upper;
		}
		model.addAttribute("manipulatedGender",newgen);
		model.addAttribute("manipulatedarray", language);
		return "process-form";
	}
}