package com.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.bean.CredentialsBean;
import com.test.service.User;

@Controller
public class CredentialsController {

	@Autowired
	User user;
	@RequestMapping(value = "loginUser", method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("credentialsBean") CredentialsBean credentialsBean, BindingResult br,Model model)
	{
	
			String result=user.login(credentialsBean);
			System.out.println("MyResult "+result);
			if(result.equalsIgnoreCase("A"))
			{
				return "adminhome";
			}
			else if(result.equalsIgnoreCase("C"))
			{
				return "customerhome";
			}
			else
			{
				model.addAttribute("msg", "Please Enter Valid Credentials");
				return "loginform";
			}
	
	}
	
	@RequestMapping("login")
	public String logina(Model m) {
		
		m.addAttribute("credentialsBean",new CredentialsBean());
		return "loginform";
	}
}
