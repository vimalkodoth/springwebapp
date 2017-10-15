package com.rocketthymeleaf.springwebapp.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultController {

	// inject via application.properties
	@Value("${welcome.message}")
	private String message = "";

	@RequestMapping(value= {"/result"},method = RequestMethod.POST)
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "result";
	}

}