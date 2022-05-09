package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Table(name = "Pacientes")
@Entity

public class paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "primernombre")
	private String PrimerNombre;
	@Column(name = "segundonombre")
	private String SegundoNombre;
	@Column(name = "primerapellido")
	private String PrimerApellido;
	@Column(name = "segundoapellido")
	private String SegundoApellido;
	@Column(name = "edad")
	private Long edad;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getPrimerNombre() {
		return PrimerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return SegundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return PrimerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}
	public Long getEdad() {
		return edad;
	}
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	
	
	
	
}
