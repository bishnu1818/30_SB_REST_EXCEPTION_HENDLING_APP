package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

@RestController
public class GreetRestController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg(){
		String s=null;
		s.length();
		String msg="Good night All of you";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
/*	@ExceptionHandler(value=NullPointerException.class)
	public ResponseEntity<String> getMsgNpn(NullPointerException npe){
		String msg="Null Operations Not allowed heare";
		return new ResponseEntity<>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
	}*/

}
