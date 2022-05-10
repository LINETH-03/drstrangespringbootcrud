package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Citas;

import com.example.demo.services.Citaservice;

@RestController
@RequestMapping("/Citas")
public class CitasController {
	@Autowired
	Citaservice citaservice;
	@GetMapping
	public List<Citas> listacitas(){
		return citaservice.findAllC();
	
		
	}
	@GetMapping(value = "/{Id}")

	public Citas obtenercita(@PathVariable Long Id) {
		return citaservice.findByIdC(Id);
	}
	@DeleteMapping (value = "/{Id}")
	public String eliminarcita(@PathVariable Long Id) {
		String Messag = "Se ha  eliminado la CITA exitosamente";
		
		citaservice.deleteByIdC(Id);
		return Messag;
	}
	
	@PutMapping(value = "/{Id}")
	public String modificarCITA(@PathVariable Long Id, @RequestBody Citas cita) {
		String Messag = "Se ha modificado exitosamente";
		citaservice.modifycitaC(Id, cita);
		return Messag;
	}
	
	@PostMapping
	public String crearcita(@RequestBody Citas cita) {
		String Messag = "Se ha creado exitosamente";
		citaservice.createcita(cita);
		return Messag;
	}
	
	

}
