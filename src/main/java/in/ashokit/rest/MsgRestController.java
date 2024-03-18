package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/msg")
	public String getMsg() {
		int i=10/0;
		return "Welcome To Spring Tool Suite...";
	}

}
