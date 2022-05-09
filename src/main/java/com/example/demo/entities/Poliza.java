package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Polizas")
@Entity

public class Poliza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Idpoliza;
	
	
	@Column(name = "idcliente")
	private Long IdCliente;
	@Column(name = "estado")
	private String Estado;
	@Column(name = "fechainicio")
	private String FechaInicio;
	@Column(name = "fechafin")
	private String FechaFin;
	public Long getIdpoliza() {
		return Idpoliza;
	}
	public void setIdpoliza(Long idpoliza) {
		Idpoliza = idpoliza;
	}
	public Long getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(Long idCliente) {
		IdCliente = idCliente;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}
	
	
	
	
	
	
	

}
