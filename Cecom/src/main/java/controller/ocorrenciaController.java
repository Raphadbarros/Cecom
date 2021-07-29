package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*@RequestMapping(value="/api")*/
@RestController
public class ocorrenciaController {

	
	@GetMapping("/oi")
	public String listar() {
		return "Lista ocorrencia";
	}
}
