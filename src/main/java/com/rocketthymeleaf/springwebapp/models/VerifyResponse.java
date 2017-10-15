package com.rocketthymeleaf.springwebapp.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class VerifyResponse {
	
	private String msisdn;
	private String verificationGuid;
	private String status;
	
	public VerifyResponse(){
		
	}
	
	public String getMsisdn() {
		return this.msisdn;
	}
	
	public String getVerificationGuid() {
		return this.verificationGuid;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setMsisdn(String input) {
		this.msisdn = input;
	}
	
	public void setVerificationGuid(String input) {
		this.verificationGuid = input;
	}

	public void setStatus(String input) {
		this.status = input;
	}

}