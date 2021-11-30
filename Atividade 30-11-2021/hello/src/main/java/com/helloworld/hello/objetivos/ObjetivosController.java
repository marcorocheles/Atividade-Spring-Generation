package com.helloworld.hello.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")

public class ObjetivosController {
	@GetMapping
	
	public String objetivos () {
		return "Essa semana busco compreender a matéria de Spring.";
	}

}
