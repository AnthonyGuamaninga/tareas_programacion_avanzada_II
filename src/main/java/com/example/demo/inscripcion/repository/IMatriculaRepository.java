package com.example.demo.inscripcion.repository;

import com.example.demo.inscripcion.modelo.Estudiante;
import com.example.demo.inscripcion.modelo.Matricula;

public interface IMatriculaRepository {
	
	// CRUD
	public Matricula buscar(Integer id);
	public void actualizar(Matricula matricula);
	public void insertar(Matricula matricula);
	public void borrar(Integer id);

}
