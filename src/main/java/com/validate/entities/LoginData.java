package com.validate.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class LoginData {
    
	
	@NotBlank(message = "User Name can not be empty !!")
	@Size(min = 3, max = 12, message = "user name must be between 3 - 12 character !!")
    private String userName;
	
	@Pattern(regexp = "^[A-Z0-9+_.-]+@[A-Z0-9.-]+$",message = "Invalid Email !!")
    private String email;
	
	@AssertTrue(message = "must agree terms and conditions")
	private boolean agreed;

    public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + "]";
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
