package com.chikuwa_latte.game_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.chikuwa_latte")
@RestController
public class GameApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(GameApiApplication.class, args);
	}

}
