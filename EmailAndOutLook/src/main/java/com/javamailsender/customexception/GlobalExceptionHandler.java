package com.javamailsender.customexception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(CustomeException.class)
	public ResponseEntity<com.javamailsender.entity.Result>response(CustomeException ex)
	{
		
	//	Map<String,Object>response=new HashMap<>();
		
		com.javamailsender.entity.Result result=new com.javamailsender.entity.Result();
		result.setResponse(ex.getMessage());
		
		
		result.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));
		
		return ResponseEntity.ok(result);
		
	}

}
