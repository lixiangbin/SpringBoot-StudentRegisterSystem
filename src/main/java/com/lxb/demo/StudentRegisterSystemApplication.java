package com.lxb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRegisterSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegisterSystemApplication.class, args);
		System.out.println("---服务已启动---");
	}

}
