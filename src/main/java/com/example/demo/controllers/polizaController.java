package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Poliza;

import com.example.demo.services.polizaservice;

@RestController
@RequestMapping("/poliza")
public class polizaController {
	@Autowired
	polizaservice Polizaservice;
	@GetMapping
	public List<Poliza> listapolizas(){
		return Polizaservice.findAllP();
		
	}
	@GetMapping(value = "/{Id}")

	public Poliza obtenerpoliza(@PathVariable Long Id) {
		return Polizaservice.findByIdP(Id);
	}
	@DeleteMapping (value = "/{Id}")
	public String eliminarpoliza(@PathVariable Long Id) {
		String Messag = "Se ha  eliminado la póliza exitosamente";
		
		Polizaservice.deleteByIdP(Id);
		return Messag;
	}
	
	@PutMapping(value = "/{Id}")
	public String modificarPoliza(@PathVariable Long Id, @RequestBody Poliza poliza) {
		String Messag = "Se ha modificado exitosamente";
		
		Polizaservice.modifypoliza(Id, poliza);
		return Messag;
		
	}


}
