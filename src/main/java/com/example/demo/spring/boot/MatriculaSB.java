package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class MatriculaSB {

	private LocalDateTime fechaRegistro;
	private LocalDateTime fechaInicio;
	private UniversidadSB universidad;
	private EstudianteSB estudiante;
	private String carrera;
	private String nivel;

	public void generaMatricula(String carrera, String nivel, LocalDateTime fechaInicio,
			UniversidadSB universidad, EstudianteSB estudiante) {
		this.carrera=carrera;
		this.nivel=nivel;
		this.fechaInicio=fechaInicio;
		this.fechaRegistro=LocalDateTime.now();		
		
		this.estudiante=estudiante;
		this.universidad=universidad;
		
		imprimeMatricula(this);
		
	}

	private void imprimeMatricula(MatriculaSB matricula) {
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
