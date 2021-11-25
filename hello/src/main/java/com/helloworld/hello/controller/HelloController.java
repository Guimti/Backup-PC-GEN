package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "</br>Mentalidades:</br>1-Mentalidade de Crescimento.</br>2-Persistência."
				+"</br>3-Orientação ao Futuro."+"</br>Habilidades:</br>1-Atenção aos detalhes."
				+"</br>2-Trabalho em equipe."+
				"</br>"+
		"</br>Meus objetivos de aprendizagem para está semana:"+
		 "</br>1-Conseguir dominar o conceito de Spring Boot.</br>2-Aprender a criar meu próprio\"Maven\", sem auxilio de ferramentas online.";
		
	}
	
	
	
	
	
	
	
	
	
}
