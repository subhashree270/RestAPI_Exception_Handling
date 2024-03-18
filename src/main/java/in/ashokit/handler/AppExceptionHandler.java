package in.ashokit.handler;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.bindings.ExInfo;

@RestControllerAdvice
public class AppExceptionHandler {
	//Global exception handler
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e){
		ExInfo info=new ExInfo("EX0005",e.getMessage(),LocalDate.now());
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ExInfo> handleUserNotFoundException(UserNotFoundException p){
		ExInfo info=new ExInfo("UNFEX0009",p.getMessage(),LocalDate.now());
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
	
	

}
