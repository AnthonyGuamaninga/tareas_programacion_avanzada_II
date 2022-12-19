package com.example.demo.seguro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.seguro.modelo.Doctor;
import com.example.demo.seguro.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepository doctorRepository;
	@Override
	public void registrar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.crear(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

}
