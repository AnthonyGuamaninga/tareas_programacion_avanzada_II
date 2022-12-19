package com.example.demo.seguro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.seguro.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	private static List<CitaMedica> baseDatos = new ArrayList<>();
	@Override
	public void crear(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		System.out.println("\nAgendando cita medica...\n"+citaMedica);
		baseDatos.add(citaMedica);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("\nEliminando cita medica...\n"+this.buscar(numero));
		baseDatos.remove(this.buscar(numero));
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		baseDatos.remove(this.buscar(citaMedica.getNumero()));
		System.out.println("\nActualizando cita medica...\n"+citaMedica);
		baseDatos.add(citaMedica);
	}

	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = null;
		for(CitaMedica c: baseDatos) {
			if(numero.equals(c.getNumero())) {
				citaMedica = c;
			}
		}
		return citaMedica;
	}

}
