package in.ashokit.handler;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException() {
		
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
