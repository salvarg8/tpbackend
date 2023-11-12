package com.bda.TrabajoPractico.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.servicios.AlquilerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("(api/client/company")
public class AlquilerController {
	
	private AlquilerService alquilerService;
	
	public AlquilerController(AlquilerService alquilerService) {
		this.alquilerService = alquilerService;
	}
	
	 @GetMapping
	public ResponseEntity<List<Alquiler>> getAll(){
		List<Alquiler> values = this.alquilerService.getAll();
		return ResponseEntity.ok(values);
	}
	 
	@PostMapping
	public ResponseEntity<Void> add(@RequestBody Alquiler alquiler){
		this.alquilerService.add(alquiler);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
