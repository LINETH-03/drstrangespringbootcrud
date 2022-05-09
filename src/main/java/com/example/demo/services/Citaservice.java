package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Citas;
 

public interface Citaservice {
	
	public List<Citas> findAllC();
	public Citas findByIdC(Long IdC);
	public void deleteByIdC(Long IdC);
	public void modifycitaC(Long IdC,Citas cita);
	public void createcita(Citas cita);


}
