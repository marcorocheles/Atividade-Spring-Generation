package com.helloworld.hello.mentalidades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/mentalidades") //é o endpoint
public class MentalidadesController {
	@GetMapping
	
	public String mentalidades () {
		return "Essa semana creio que preciso ter persistência e atenção ao detalhe pois estou desesperado.";
	}
	
}
