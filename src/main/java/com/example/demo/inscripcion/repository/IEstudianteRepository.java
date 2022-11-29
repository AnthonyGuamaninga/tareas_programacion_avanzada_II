package com.example.demo.inscripcion.repository;

import com.example.demo.inscripcion.modelo.Estudiante;

public interface IEstudianteRepository {
	
	public Estudiante buscarEstudiante(String Cedula);
	
	// CRUD
	public Estudiante buscar(Integer id);
	public void actualizar(Estudiante estudiante);
	public void insertar(Estudiante estudiante);
	public void borrar(Integer id);

}
