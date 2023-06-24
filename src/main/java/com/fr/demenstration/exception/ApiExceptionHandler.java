package com.fr.demenstration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
	@ExceptionHandler(PreconditionFailedException.class)
	 public ResponseEntity<ApiErrorResponse> handleApiException(PreconditionFailedException ex){
		 ApiErrorResponse response = new ApiErrorResponse(ex.getErrorCode(),ex.getDetailsMsg());
	        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST); 
	 }
	
	
}
