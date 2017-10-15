package com.rocketthymeleaf.springwebapp.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.rocketthymeleaf.springwebapp.models.*;
import com.rocketthymeleaf.springwebapp.dao.*;
import org.springframework.ui.Model;


@Controller
public class RegisterController {
	@Autowired
	private RegisterDAO registerDAO;
	
	// inject via application.properties
	@Value("${welcome.message}")
	private String message = "";

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("registernow", new RegisterFormModel());
		return "register";
	}
	@RequestMapping(value="/register",method = RequestMethod.POST,params="action=Register")
	public String register(Model model, @ModelAttribute RegisterFormModel registernow) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("username",registernow.getUsername());
		params.put("msisdn",registernow.getMsisdn());
		params.put("operator",registernow.getOperator());
		params.put("password",registernow.getPassword());
		
		RegisterResponse regResponse = registerDAO.registerAPI(params);
		if(regResponse.getOtpGenerated() == null) {
			return "error";
		}
		OTPResponse otpresponse = regResponse.getOtpGenerated();
		model.addAttribute("operator", regResponse.getOperator());
		model.addAttribute("verificationGuid", otpresponse.getVerificationGuid());
		model.addAttribute("verifynow", new VerifyFormModel());
		return "verify";
	}
	@RequestMapping(value="/register",method = RequestMethod.POST,params="action=Verify")
	public String result(Model model, @ModelAttribute RegisterFormModel registernow) {
		model.addAttribute("verifynow", new VerifyFormModel());
		return "verify";
	}

}