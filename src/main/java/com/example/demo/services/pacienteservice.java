package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.paciente;

public interface pacienteservice {
	
	public List<paciente> findAll();
	public paciente findById(Long Id);
	public void deleteById(Long Id);
	public void modifypaciente(Long Id, paciente Paciente);
	
}
