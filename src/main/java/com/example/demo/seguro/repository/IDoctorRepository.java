package com.example.demo.seguro.repository;

import com.example.demo.seguro.modelo.Doctor;

public interface IDoctorRepository {
	
	public void crear(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(String cedula);
	public void eliminar(String cedula);
}
