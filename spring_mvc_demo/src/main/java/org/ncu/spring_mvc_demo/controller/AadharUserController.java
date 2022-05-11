package org.ncu.spring_mvc_demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/verify")
public class AadharUserController {

	// creating bean
	@ModelAttribute("aduser")
	public AadharUser getUSer() {
		return new AadharUser();
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {

		return "form";
	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("aduser") AadharUser aduser, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "form";
		} else {

			System.out.println("User Name: " + aduser.getUserName() + " Aadhar Id: " + aduser.getAadharID() + " State: "
					+ aduser.getState() + " Gender: " + aduser.getGender() + " Other Options: " + aduser.getOthers());

			String[] list = aduser.getOthers();
			String others = "";
			for (String l : list) {
				others = others + " " + l + ", ";
				System.out.println(l);
			}

			if (others.endsWith(", ")) {
				others = others.substring(0, others.length() - 2) + ". ";
			}

			System.out.println("Address: " + aduser.getAddress());

			/* send the updated data using model attribute */
			model.addAttribute("list", others);

			return "display";
		}
	}
}
