package com.example.myapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	private TemperaturaRespository repository;

	@RequestMapping("/")
	@ResponseBody
	public Iterable<Temperatura> home() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(10000l);
			System.out.println("insertando" + new Date());
			repository.save(new Temperatura(i));
		}
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}
