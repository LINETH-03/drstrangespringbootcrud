package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.pacientesdao;
import com.example.demo.entities.paciente;
@Service
public class pacienteserviceimpl implements pacienteservice {
	@Autowired
	pacientesdao Pacientedao;

	@Override
	public List<paciente> findAll() {
		// TODO Auto-generated method stub
		return (List<paciente>) Pacientedao.findAll();
	}

	@Override
	public paciente findById(Long Id) {
		// TODO Auto-generated method stub
		return Pacientedao.findById(Id).orElse(null);
	}

	@Override
	public void deleteById(Long Id) {
		// TODO Auto-generated method stub
		if(Pacientedao.existsById(Id)) {
		Pacientedao.deleteById(Id);
		}
		
	}

	@Override
	public void modifypaciente(Long Id, paciente Paciente) {
		// TODO Auto-generated method stub
		if(Pacientedao.existsById(Id)) {
			Paciente.setId(Id);
			Pacientedao.save(Paciente);
		}
	}
	

}
