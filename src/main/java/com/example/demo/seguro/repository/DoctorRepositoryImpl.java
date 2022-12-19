package com.example.demo.seguro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.seguro.modelo.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {

	private static List<Doctor> baseDatos = new ArrayList<>();
	@Override
	public void crear(Doctor doctor) {
		// TODO Auto-generated method stub
		baseDatos.add(doctor);
		System.out.println("\nRegistrando Doctor...\n"+doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		for(Doctor d: baseDatos) {
			if(doctor.getCedula().equals(d.getCedula())) {
				baseDatos.remove(d);
				baseDatos.add(doctor);
			}
		}
		System.out.println("\nActualizando Doctor...\n"+ doctor);
	}

	@Override
	public Doctor buscar(String cedula) {
		// TODO Auto-generated method stub
		Doctor doctor=null;
		for(Doctor d: baseDatos) {
			if(cedula.equals(d.getCedula())) {
				doctor = d;
			}
		}
		return doctor;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("\nEliminando... "+this.buscar(cedula));
		baseDatos.remove(this.buscar(cedula));
	}

}
