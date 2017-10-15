package com.rocketthymeleaf.springwebapp.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RegisterResponse {
	
	private String userName;
	private String msisdn;
	private String operator;
	private Boolean verifyEnabled;
	private OTPResponse otpGenerated;
	
	public RegisterResponse(){
		
	}
	
	public void setUserName(String username) {
		this.userName = username;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
	public String getMsisdn() {
		return this.msisdn;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public Boolean getVerifyEnabled() {
		return this.verifyEnabled;
	}
	
	public void setVerifyEnabled(Boolean enabled) {
		this.verifyEnabled = enabled;
	}
	
	public OTPResponse getOtpGenerated() {
		return this.otpGenerated;
	}
	
	public void setOtpGenerated(OTPResponse otpGenerated) {
		this.otpGenerated = otpGenerated;
	}
}