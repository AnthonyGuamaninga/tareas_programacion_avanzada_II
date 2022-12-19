package com.example.demo.seguro.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.seguro.modelo.CitaMedica;
import com.example.demo.seguro.modelo.Doctor;
import com.example.demo.seguro.modelo.Paciente;
import com.example.demo.seguro.repository.ICitaMedicaRepository;
import com.example.demo.seguro.repository.IDoctorRepository;
import com.example.demo.seguro.repository.IPacienteRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	@Autowired
	private IDoctorRepository doctorRepository;
	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void generar(String cedulaPaciente, String cedulaDoctor) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		Doctor doctor = this.doctorRepository.buscar(cedulaDoctor);
		citaMedica.setDoctor(doctor);
		Paciente paciente = this.iPacienteRepository.buscar(cedulaPaciente);
		citaMedica.setPaciente(paciente);
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setFechaCita(LocalDateTime.of(2023,01,29,15,00));
		citaMedica.setNumero("123466");
		//costo:
		BigDecimal costo = doctor.getCostoConsulta().multiply(new BigDecimal(0.15));
		if( costo.intValue()>200) {
			costo = costo.multiply(new BigDecimal(0.93));
		}
		citaMedica.setCosto(costo);
		this.citaMedicaRepository.crear(citaMedica);
	}

}
