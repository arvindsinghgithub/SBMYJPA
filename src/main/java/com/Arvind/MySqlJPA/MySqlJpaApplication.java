package com.Arvind.MySqlJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySqlJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlJpaApplication.class, args);
		System.out.println("hi this first -> spring+jpa+mysql+web+MVC");
	}

}
