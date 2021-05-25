package com.atividade.atividadeum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atividadeum")
public class AtividadeumController {
	
	@RequestMapping(value="/mentalidadesUsadas")
		@GetMapping
		public String  mentalidadeUsada() {
			return "Habilidades: Persistência, Atenção e ajuda.";
		
	}

}
