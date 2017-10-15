package com.rocketthymeleaf.springwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rocketthymeleaf.springwebapp.dao.RegisterDAO;
import com.rocketthymeleaf.springwebapp.models.RegisterFormModel;
import com.rocketthymeleaf.springwebapp.models.RegisterResponse;
import com.rocketthymeleaf.springwebapp.models.VerifyFormModel;
import com.rocketthymeleaf.springwebapp.models.VerifyResponse;
import com.rocketthymeleaf.springwebapp.models.VerifyUserRequest;

@Controller
public class VerifyController {

	// inject via application.properties
	@Value("${welcome.message2}")
	private String message = "";
	@Autowired
	private RegisterDAO verifyDAO;
	@RequestMapping(value= {"/verify"},method = RequestMethod.POST)
	public String welcome(Model model, @ModelAttribute VerifyFormModel verifynow) {
		VerifyUserRequest vReq = new VerifyUserRequest();
		vReq.setPinCode(verifynow.toString());
		vReq.setOperator(verifynow.getOperator());
		VerifyResponse verifyResponse = verifyDAO.verifyAPI(vReq, verifynow.getVerificationGuid());
		model.addAttribute("status",verifyResponse.getStatus());
		return "result";
	}
}