package com.atividade.atividadedois.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AtividadedoisController {

	

	

	@RestController
	@RequestMapping("/Atividadeum")
	public class AtividadeumController {
		
		@RequestMapping(value="/ObjetivoDaSemana")
			@GetMapping
			public String  mentalidadeUsada() {
				return "DESEJOOO APRENDER O SPRING";
			
		}

	}

}
