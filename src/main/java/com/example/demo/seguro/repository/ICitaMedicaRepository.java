package com.example.demo.seguro.repository;

import com.example.demo.seguro.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	public void crear(CitaMedica citaMedica);
	public void eliminar(String numero);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica buscar(String numero);
}
