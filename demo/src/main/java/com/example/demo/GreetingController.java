package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/hi")
    public String sayHi() {
        return "Hi";
    }
	
	@GetMapping("/message")
	public Integer sumOff(){
		int a = 2;
		int b = 4;
		int sum = a+b;
		return sum;
	}
	
	

}
