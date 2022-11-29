package com.example.demo.inscripcion.repository;

import com.example.demo.inscripcion.modelo.Universidad;

public interface IUniversidadRepository {
	
	public Universidad buscarUniversidad(String nombre);
	
	// CRUD
	public Universidad buscar(Integer id);
	public void actualizar(Universidad universisdad);
	public void insertar(Universidad universidad);
	public void borrar(Integer id);

}
