package com.rocketthymeleaf.springwebapp.models;

public class VerifyFormModel {

  private String inputone;
  private String inputtwo;
  private String inputthree;
  private String inputfour;
  private String inputfive;
  private String inputsix;
  private String operator;
  private String verificationGuid;

  public String getInputone() {
	 return this.inputone;
  }
  public void setInputone(String input) {
	   this.inputone = input;
  }
  public String getInputtwo() {
	 return this.inputtwo;
  }
  public void setInputtwo(String input) {
	   this.inputtwo = input;
  }
  public String getInputthree() {
	 return this.inputthree;
  }
  public void setInputthree(String input) {
	   this.inputthree = input;
  }
  public String getInputfour() {
	 return this.inputone;
  }
  public void setInputfour(String input) {
	   this.inputfour = input;
  }
  public String getInputfive() {
	 return this.inputfive;
  }
  public void setInputfive(String input) {
	   this.inputfive = input;
  }
  public String getInputsix() {
	 return this.inputsix;
  }
  public void setInputsix(String input) {
	   this.inputsix = input;
  }
  public String getOperator() {
	 return this.operator;
  }
  public void setOperator(String input) {
	   this.operator = input;
  }

  public String getVerificationGuid() {
	 return this.verificationGuid;
  }
  public void setVerificationGuid(String input) {
	   this.verificationGuid = input;
  }

  public String getString() {
	return (this.inputone+this.inputtwo+this.inputthree+this.inputfour+this.inputfive+this.inputsix).toString();
  }
}