package com.example.demo.seguro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.seguro.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository {

	private static List<Paciente> baseDatos = new ArrayList<>();
	@Override
	public void registrar(Paciente paciente) {
		// TODO Auto-generated method stub
		baseDatos.add(paciente);
		System.out.println("\nIngresando paciente...\n"+paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente=null;
		for(Paciente p: baseDatos) {
			if(p.getCedula().equals(cedula)) {
				paciente = p;
			}
		}
		return paciente;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("\nEliminando Paciente...\n"+this.buscar(cedula));
		baseDatos.remove(this.buscar(cedula));
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		baseDatos.remove(this.buscar(paciente.getCedula()));
		baseDatos.add(paciente);
		System.out.println("\nActualizando Paciente...\n"+paciente);
	}

}
