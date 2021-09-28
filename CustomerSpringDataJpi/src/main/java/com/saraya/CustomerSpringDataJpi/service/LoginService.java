package com.saraya.CustomerSpringDataJpi.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isValid(String username, String password) {
		// TODO Auto-generated method stub
		
		if (username.equalsIgnoreCase("sanokho")&& password.equalsIgnoreCase("snkh")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

}
