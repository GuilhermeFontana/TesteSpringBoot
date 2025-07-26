package com.teste.springboot.projeto.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.teste.springboot.projeto.springboot.Controller",
		"com.teste.springboot.projeto.springboot.Service",
		"com.teste.springboot.projeto.springboot.Repository",
		"com.teste.springboot.projeto.springboot.Model"
})
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}