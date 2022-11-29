package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MatriculaH {

	private LocalDateTime fechaRegistro;
	private LocalDateTime fechaInicio;
	private UniversidadH universidad;
	private EstudianteH estudiante;
	private String carrera;
	private String nivel;

	public void generaMatricula(String carrera, String nivel, LocalDateTime fechaInicio,
			UniversidadH universidad, EstudianteH estudiante) {
		this.carrera=carrera;
		this.nivel=nivel;
		this.fechaInicio=fechaInicio;
		this.fechaRegistro=LocalDateTime.now();		
		
		this.estudiante=estudiante;
		this.universidad=universidad;
		
		imprimeMatricula(this);
		
	}

	private void imprimeMatricula(MatriculaH matricula) {
		System.out.println(matricula);
	}

	@Override
	public String toString() {
		return ">>> MATRICULA GENERADA <<<"
				+ "\n[Fecha de Registro: " + fechaRegistro 
				+ "\nInicio de clases: " + fechaInicio 
				+ "\nUniversidad: " + universidad 
				+ "\nEstudiante: " + estudiante 
				+ "\nCarrera: " + carrera 
				+ "\nNivel: " + nivel + "]\n\n";
	}
	
	

}
