package com.rocketthymeleaf.springwebapp.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OTPResponse {
	
	private String verificationStatus;
	private String verificationGuid;

	
	public OTPResponse(){
		
	}
	
	public void setVerificationStatus(String status) {
		this.verificationStatus = status;
	}
	
	public String getVerificationStatus() {
		return this.verificationStatus;
	}
	
	public void setVerificationGuid(String guid) {
		this.verificationGuid = guid;
	}
	
	public String getVerificationGuid() {
		return this.verificationGuid;
	}
	
}