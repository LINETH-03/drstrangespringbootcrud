package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.polizadao;
import com.example.demo.entities.Poliza;

@Service
public class polizaserviceimpl implements polizaservice {
	@Autowired
	polizadao Polizadao;

	@Override
	public List<Poliza> findAllP() {
		// TODO Auto-generated method stub
		return (List<Poliza>) Polizadao.findAll() ;
	}

	@Override
	public Poliza findByIdP(Long IdPoliza) {
		// TODO Auto-generated method stub
		return Polizadao.findById(IdPoliza).orElse(null);
	}

	@Override
	public void deleteByIdP(Long IdPoliza) {
		// TODO Auto-generated method stub
		if(Polizadao.existsById(IdPoliza)) {
			Polizadao.deleteById(IdPoliza);
			}
		
	}

	@Override
	public void modifypoliza(Long IdPoliza, Poliza poliza) {
		// TODO Auto-generated method stub
		if(Polizadao.existsById(IdPoliza)) {
			poliza.setIdpoliza(IdPoliza);;
			Polizadao.save(poliza);
		}

		
	}

}
