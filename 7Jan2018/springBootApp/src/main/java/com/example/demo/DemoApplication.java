package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String ENV_PORT = System.getenv().get("PORT");
		if(ENV_PORT != null) {
			System.getProperties().put("server.port", ENV_PORT);
		}

		SpringApplication.run(DemoApplication.class, args);
	}
}
