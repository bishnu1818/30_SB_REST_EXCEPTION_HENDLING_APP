package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		int i=10/0;
		String msg="Good Morning All of you";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	/*
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> getMsgNpn(ArithmeticException ae){
		String msg="Ten Can NOt Be Devided by Zero";
		return new ResponseEntity<>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
 

}
