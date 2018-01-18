package com.lp.blog.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

import com.lp.blog.pojo.User;
import com.lp.blog.service.intf.IUserSerivce;

@RequestMapping("/hello")
@Controller
public class HelloSSMController {
	
	@Resource
	private IUserSerivce UserService;
	
	@RequestMapping("/show")
	public String show(Model model) {
		User user=UserService.getUserById(1);
		model.addAttribute("user", user);		 
		return "hellossm";
	}
}
