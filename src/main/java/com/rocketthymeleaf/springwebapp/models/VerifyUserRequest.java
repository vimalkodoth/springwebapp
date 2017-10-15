package com.rocketthymeleaf.springwebapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerifyUserRequest {

    @NotBlank
    @JsonProperty("pinCode")
    private String pinCode;

    @NotBlank
    @JsonProperty("operator")
    private String operator;


    public String getPinCode() {
        return pinCode;
    }
    
    public void setPinCode(String pincode) {
        this.pinCode = pincode;
    }
    
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String toString() {
	    return ("{"
	    + "\"operator\":"+this.operator+ ","
	    	    + "\"pinCode\":"+this.pinCode
	    + "}");
    }
}


