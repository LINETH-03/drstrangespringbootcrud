package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Poliza;


public interface polizaservice {
	public List<Poliza> findAllP();
	public Poliza findByIdP(Long IdPoliza);
	public void deleteByIdP(Long IdPoliza);
	public void modifypoliza(Long IdPoliza, Poliza poliza);


}
