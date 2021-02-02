package com.app.custom_excs;

public class UserNotFound extends RuntimeException {
	
	public UserNotFound(String mesg) {
		
		   super(mesg);

}
}