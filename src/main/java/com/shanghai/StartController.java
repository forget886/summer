package com.shanghai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class StartController {

	@RequestMapping("/")
	public String index(){
		return "hello 上海";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(StartController.class, args);
	}
}
