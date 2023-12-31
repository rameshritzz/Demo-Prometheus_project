package com.maersk.spring.ws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcdDemoPrometheusApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "working fine...!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GcdDemoPrometheusApplication.class, args);
	}

}
