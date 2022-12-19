package com.example.demo.seguro.service;

import com.example.demo.seguro.modelo.Paciente;

public interface IPacienteService {
	
	public void ingresar (Paciente paciente);
	public Paciente buscar(String cedula);
	

}
