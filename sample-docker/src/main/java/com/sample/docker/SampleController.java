package com.sample.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/say")
	public String sayHello() {
		return "Welcome to docker!!!! Siva";
	}
}
