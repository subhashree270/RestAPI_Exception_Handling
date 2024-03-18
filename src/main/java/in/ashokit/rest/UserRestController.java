package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.handler.UserNotFoundException;

@RestController
public class UserRestController {
	@GetMapping("/user/{userId}")
	public String getUserInfo(@PathVariable Integer userId) {
		if(userId>100) {
			throw new UserNotFoundException("Invalid user id...");
		}
		return "User is applied for Health Insurance Card...";
	}

}
