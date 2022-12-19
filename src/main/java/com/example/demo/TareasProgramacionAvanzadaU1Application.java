package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.seguro.modelo.Doctor;
import com.example.demo.seguro.modelo.Paciente;
import com.example.demo.seguro.service.ICitaMedicaService;
import com.example.demo.seguro.service.IDoctorService;
import com.example.demo.seguro.service.IPacienteService;
import com.example.demo.spring.boot.EstudianteNoRegularSB;
import com.example.demo.spring.boot.EstudianteRegularSB;
import com.example.demo.spring.boot.MatriculaSB;
import com.example.demo.spring.boot.UniversidadSB;

@SpringBootApplication
public class TareasProgramacionAvanzadaU1Application implements CommandLineRunner{
	
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(TareasProgramacionAvanzadaU1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//OPCION 1: crear Doctor
		Doctor doctor = new Doctor();
		doctor.setCedula("12443535");
		doctor.setNombre("Maximiliano");
		doctor.setEspecialidad("Pediatra");
		doctor.setCostoConsulta(new BigDecimal(2000));
		this.doctorService.registrar(doctor);
		
		//OPCION 2: actualizar Doctor
		doctor.setNombre("Danilo");
		doctor.setEspecialidad("Cirujano");
		this.doctorService.actualizar(doctor);
		
		//OPCION 3: crear Paciente
		Paciente paciente = new Paciente();
		paciente.setNombre("Jhon");
		paciente.setCedula("1234655234");
		paciente.setFechaNacimiento(LocalDateTime.of(1950,03,13,8,30));
		paciente.setTipo("Tercera Edad");
		this.iPacienteService.ingresar(paciente);
		
		//OPCION 4: generear cita medica ingeresando la cedula de paciente y cedula del doctor
		this.citaMedicaService.generar(paciente.getCedula(), doctor.getCedula());
		
	}

}
