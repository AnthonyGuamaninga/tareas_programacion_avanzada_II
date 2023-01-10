package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorService {
	
	public void registrar(Profesor profesor);
	public void modificar(Profesor profesor);
	public Profesor buscar(Integer id);
	public void eliminar(Integer id);

}
