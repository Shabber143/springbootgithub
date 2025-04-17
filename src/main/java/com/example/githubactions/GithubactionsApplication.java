package com.example.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubactionsApplication {

	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
	}

}
