package com.example.demo.seguro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.seguro.modelo.Paciente;
import com.example.demo.seguro.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Override
	public void ingresar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.registrar(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscar(cedula);
	}

}
