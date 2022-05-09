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

import com.example.demo.entities.paciente;
import com.example.demo.services.pacienteservice;

@RestController
@RequestMapping("/pacientes")
public class pacientecontroller {
	@Autowired
	pacienteservice Pacienteservice;
	@GetMapping
	public List<paciente> listapacientes(){
		return Pacienteservice.findAll();
		
	}
	@GetMapping(value = "/{Id}")

	public paciente obtenerpaciente(@PathVariable Long Id) {
		return Pacienteservice.findById(Id);
	}
	@DeleteMapping (value = "/{Id}")
	public String eliminarpaciente(@PathVariable Long Id) {
		String Messag = "Se ha eliminado exitosamente";
		
		Pacienteservice.deleteById(Id);
		return Messag;
	}
	
	@PutMapping(value = "/{Id}")
	public String modificarpaciente(@PathVariable Long Id, @RequestBody paciente Paciente) {
		String Messag = "Se ha modificado exitosamente";
		
		Pacienteservice.modifypaciente(Id, Paciente);
		return Messag;
	}

}
