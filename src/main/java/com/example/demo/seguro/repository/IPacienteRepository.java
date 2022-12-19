package com.example.demo.seguro.repository;

import com.example.demo.seguro.modelo.Paciente;

public interface IPacienteRepository {
	
	public void registrar(Paciente paciente);
	public Paciente buscar(String cedula);
	public void eliminar(String cedula);
	public void actualizar(Paciente paciente);
	
}
