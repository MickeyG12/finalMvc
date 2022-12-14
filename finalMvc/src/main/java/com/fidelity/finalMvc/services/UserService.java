package com.fidelity.finalMvc.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fidelity.finalMvc.controller.LoginRequest;

@Service
public class UserService {

	/**
	 * 
	 */
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	
	public HttpStatus doLogin(LoginRequest request) {
		
		if ((request.getUsername().equals("Admin")) 
			&& (request.getPassword().equals("1234"))) {
			return HttpStatus.OK;
		} else {
			return HttpStatus.FORBIDDEN;
		}
		
		
	}

}