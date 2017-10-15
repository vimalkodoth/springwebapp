package com.rocketthymeleaf.springwebapp.models;

public class RegisterFormModel {

  private String username;
  private String password;
  private String msisdn;
  private String operator;

  public void setUsername(String name) {
        this.username = name;
  }
  public void setPassword(String password) {
	   this.password = password;
  }
  public void setMsisdn(String msisdn) {
	  this.msisdn = msisdn;
  }
  public String getUsername() {
      return this.username;
  }
  public String getPassword() {
	  return this.password;
  }
  public String getMsisdn() {
	  return this.msisdn;
  }
  public String getOperator() {
	  return this.operator;
  }
  public void setOperator(String operator) {
	  this.operator = operator;
  }
  
}