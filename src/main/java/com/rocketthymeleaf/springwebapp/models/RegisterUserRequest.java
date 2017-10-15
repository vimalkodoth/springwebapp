package com.rocketthymeleaf.springwebapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterUserRequest {

    @NotBlank
    @JsonProperty("username")
    private String userName;

    @NotBlank
    @JsonProperty("msisdn")
    private String msisdn;

    @NotBlank
    @JsonProperty("password")
    private String password;

    @JsonProperty("operator")
    private String operator;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String toString() {
	    return ("{"
	    + "\"username\":"+this.userName+ ","
	    	    + "\"password\":"+this.password+ ","
	    	    	    + "\"msisdn\":"+this.msisdn+ ","
	    	    	    	    + "\"operator\":"+this.operator
	    + "}");
    }
    
}


