package com.test.mainmod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainmodApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainmodApplication.class, args);
		ShowInput show = new ShowInput();
		show.showEnv();
	}

}
