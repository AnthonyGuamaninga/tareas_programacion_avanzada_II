package com.example.demo.seguro.modelo;

import java.math.BigDecimal;

public class Doctor {
	
	private String nombre;
	private String cedula;
	private String especialidad;
	private BigDecimal costoConsulta;
	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", cedula=" + cedula + ", especialidad=" + especialidad + ", costoConsulta="
				+ costoConsulta + "]";
	}
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public BigDecimal getCostoConsulta() {
		return costoConsulta;
	}
	public void setCostoConsulta(BigDecimal costoConsulta) {
		this.costoConsulta = costoConsulta;
	}
	
	

}
