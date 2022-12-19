package com.example.demo.seguro.modelo;

import java.time.LocalDateTime;

public class Paciente {
	
	private String nombre;
	private String cedula;
	private String tipo;
	private LocalDateTime fechaNacimiento;
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	// SET Y GET
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
