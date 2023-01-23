package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class TareasPaU2AgApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired 
	private IEmpleadoService empleadoService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	public static void main(String[] args) {
		SpringApplication.run(TareasPaU2AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// INSERTAR --> ESTUDIANTE
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Torres");
		estudiante.setCedula("1133611347");
		estudiante.setCiudad("Loja");
		estudiante.setGenero("Femanino");
		estudiante.setNombre("Sandra");		
		//this.estudianteService.registrar(estudiante);
		
		// Ingresar --> CIUDADANO Y EMPLEADO
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Alfred");
		ciudadano.setApellido("Yaguache");
		
		Empleado empleado = new Empleado();
		empleado.setSalario(new BigDecimal(20));
		empleado.setFechaIngreso(LocalDateTime.now());
		empleado.setCiudadano(ciudadano);
		
		ciudadano.setEmpleado(empleado);
		this.empleadoService.ingresar(empleado); // Al ingresar un Empleado se ingresa un Ciudadano
		//this.ciudadanoService.guardar(ciudadano);
		
		
		
		
		// BUSCAR --> CIUDADANO Y EMPLEADO
		this.ciudadanoService.buscar(1);
		this.empleadoService.buscar(1);
		
		// ACTUALIZAR --> CIUDADANO Y EMPLEADO
		Ciudadano ciudModificado = this.ciudadanoService.buscar(1);
		ciudModificado.setNombre("Anghelo");
		this.ciudadanoService.modificar(ciudModificado);
		
		Empleado emplModificado = this.empleadoService.buscar(1);
		emplModificado.setSalario(new BigDecimal(3000));
		this.empleadoService.modificar(emplModificado);
		
		
		// ELIMINAR --> CIUDADANO Y EMPLEADO		
		this.ciudadanoService.eliminar(1);
		this.empleadoService.eliminar(1);
		
		
	}

}
