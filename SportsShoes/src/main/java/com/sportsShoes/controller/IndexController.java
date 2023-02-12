package com.sportsShoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/userlogin")
	public String userLogin()
	{
		return "userlogin";
	}
	
	@RequestMapping("/usersingup")
	public String userSignup()
	{
		return "usersingup";
	}
}
