package com.ashokit.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalRestController {
	@ExceptionHandler(value=NullPointerException.class)
	public ResponseEntity<String> getMsgNpn(NullPointerException npe){
		String msg="Null Operations Not allowed heare";
		return new ResponseEntity<>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> getMsgNpn(ArithmeticException ae){
		String msg="Ten Can NOt Be Devided by Zero";
		return new ResponseEntity<>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
	}
 


}
