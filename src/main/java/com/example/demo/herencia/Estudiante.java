package com.example.demo.herencia;

public class Estudiante {
	
	private String nombre;
	private String cedula;
	private String tipo;
		
	public void generaEstudiante(String nombre, String cedula, String tipo) {		
		this.nombre=nombre;
		this.cedula=cedula;
		this.tipo=tipo;
	}
	
	@Override
	public String toString() {
		return "[Nombre: " + nombre + ", Cédula: " + cedula + ", Estudiante: " + tipo +"]";
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
