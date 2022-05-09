package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "Cita")
@Entity
public class Citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Idcita;
	@Column(name = "fechacita")
	private String FechaCita;
	@Column(name = "hora")
	private String Horacita;
	@Column(name = "poliza")
	private Long IPoliza;
	@Column(name = "estado")
	private String Estado;
	@Column(name = "observaciones")
	private String Observaciones;
	
	
	public Long getIdcita() {
		return Idcita;
	}
	public void setIdcita(Long idcita) {
		Idcita = idcita;
	}
	public String getFechaCita() {
		return FechaCita;
	}
	public void setFechaCita(String fechaCita) {
		FechaCita = fechaCita;
	}
	public String getHoracita() {
		return Horacita;
	}
	public void setHoracita(String horacita) {
		Horacita = horacita;
	}
	public Long getIPoliza() {
		return IPoliza;
	}
	public void setIPoliza(Long iPoliza) {
		IPoliza = iPoliza;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	
	

}
