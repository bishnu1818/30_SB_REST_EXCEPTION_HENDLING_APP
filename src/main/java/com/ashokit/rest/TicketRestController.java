package com.ashokit.rest;

//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.custom.NoDataFoundException;

@RestController
public class TicketRestController {
	@GetMapping("/ticket/status/{pnr}")
	public ResponseEntity<String> getStatus(@PathVariable String pnr){
		
	//	String msg="";
	//	return new ResponseEntity<>(msg,HttpStatus.OK);
		throw new NoDataFoundException("No Data Found");
	}

}
