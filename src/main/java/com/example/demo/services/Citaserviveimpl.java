package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Citadao;
import com.example.demo.entities.Citas;

@Service
public class Citaserviveimpl implements Citaservice {
	@Autowired
	Citadao CitaDao;
	

	@Override
	public List<Citas> findAllC() {
		// TODO Auto-generated method stub
		return (List<Citas>) CitaDao.findAll();
	}

	@Override
	public Citas findByIdC(Long IdC) {
		// TODO Auto-generated method stub
		return CitaDao.findById(IdC).orElse(null);
	}

	@Override
	public void deleteByIdC(Long IdC) {
		// TODO Auto-generated method stub
		if(CitaDao.existsById(IdC)) {
			CitaDao.deleteById(IdC);
			}
		
	}

	@Override
	public void modifycitaC(Long IdC, Citas cita) {
		// TODO Auto-generated method stub
		if(CitaDao.existsById(IdC)) {
			cita.setIdcita(IdC);
			CitaDao.save(cita);
		}
	}

	@Override
	public void createcita(Citas cita) {
		// TODO Auto-generated method stub
		CitaDao.save(cita);
		
	}

}
