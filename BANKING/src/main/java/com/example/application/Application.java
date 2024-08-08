package com.example.application;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {


		public static void main(String[]	args) {
		try {
			Dotenv dotenv = Dotenv.load();
			System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
			System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
