package com.aws;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello learning AWSCICD -v1";
	}

}
