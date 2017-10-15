package com.rocketthymeleaf.springwebapp.dao;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.rocketthymeleaf.springwebapp.models.*;

@Component
public class RegisterDAO {

	public RegisterResponse registerAPI(Map<String, String> params) {
		 RegisterResponse registerResponse = null;
		 RestTemplate restTemplate = new RestTemplate();
		 RegisterUserRequest req = new RegisterUserRequest();
		 req.setMsisdn(params.get("msisdn"));
		 req.setPassword(params.get("password"));
		 req.setUserName(params.get("username"));
		 req.setOperator(params.get("operator"));
		 
		 try {
			 registerResponse = restTemplate.postForObject("http://stg-api.intigral-ott.net/RC7-popcorn-api-rs-5.0/v1/users?apikey=cG0sVDlZUUMzNDdUSF", req, RegisterResponse.class);
		 }
		 catch(Exception e) {
			 System.out.println(e);
			 e.printStackTrace();
		 }
		 
		 return registerResponse;
	}
	
	public VerifyResponse verifyAPI(VerifyUserRequest req, String verificationGuid) {
		 VerifyResponse verifyResponse = null;
		 RestTemplate restTemplate = new RestTemplate();
		 
		 try {
			 verifyResponse = restTemplate.postForObject("http://stg-api.intigral-ott.net/RC7-popcorn-api-rs-5.0/v1/msisdn/verifications/"+verificationGuid+"?apikey=cG0sVDlZUUMzNDdUSF", req, VerifyResponse.class);
		 }
		 catch(Exception e) {
			 System.out.println(e);
			 e.printStackTrace();
		 }
		 
		 return verifyResponse;
	}
	
}