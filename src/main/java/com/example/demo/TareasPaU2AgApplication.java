package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class TareasPaU2AgApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IProfesorService iProfesorService;

	public static void main(String[] args) {
		SpringApplication.run(TareasPaU2AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// >>> PROFESOR
		// Insertar
		Profesor profesor = new Profesor();
		//profesor.setId(1);
		profesor.setNombre("Ramiro");
		profesor.setApellido("Carvajal");
		profesor.setCedula("1742250437");
		profesor.setCiudad("Guayaquil");
		profesor.setGenero("M");
		profesor.setTitulo("Ingenieria Quimica");
		this.iProfesorService.registrar(profesor);
		
		// Buscar
		Profesor profesor2 = this.iProfesorService.buscar(1);
		System.out.println("Buscando profesor...\n"+profesor2);
		
		// Actualizar
		Profesor profesor3 = this.iProfesorService.buscar(2);
		profesor3.setCedula("142355953");
		this.iProfesorService.modificar(profesor3);
		
		// Eliminar
		this.iProfesorService.eliminar(3);
		
		// >>> ESTUDINATE
		// INSERTAR
		Estudiante estudiante = new Estudiante();
		//estudiante.setId(1);
		estudiante.setNombre("Anthony");
		estudiante.setApellido("Guamaninga");
		estudiante.setCedula("1753100724");
		estudiante.setGenero("M");
		estudiante.setCiudad("Quito");		
		//this.estudianteService.registrar(estudiante);
		
		
		// ACTUALIZAR
		Estudiante estudiante2 = this.estudianteService.buscar(3);
		estudiante2.setNombre("Alfredo");
		estudiante2.setApellido("Yaguache");
		estudiante2.setCedula("1103388752");
		//this.estudianteService.modificar(estudiante2);
		
		// BUSCAR
		//Estudiante estudiante3 = this.estudianteService.buscar(2);
		//System.out.println("Buscando Estudiante...\n"+estudiante3);
		
		
		// ELIMINAR
		//this.estudianteService.eliminar(4);
		
	}

}
