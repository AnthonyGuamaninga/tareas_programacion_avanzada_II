package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.boot.EstudianteNoRegularSB;
import com.example.demo.spring.boot.EstudianteRegularSB;
import com.example.demo.spring.boot.MatriculaSB;
import com.example.demo.spring.boot.UniversidadSB;

@SpringBootApplication
public class TareasProgramacionAvanzadaU1Application implements CommandLineRunner{
	
	@Autowired
	private EstudianteNoRegularSB estudianteNR;
	@Autowired
	private EstudianteRegularSB estudianteR;
	@Autowired
	private UniversidadSB universidad;
	@Autowired
	private MatriculaSB matricula;

	public static void main(String[] args) {
		SpringApplication.run(TareasProgramacionAvanzadaU1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		estudianteR.generaEstudiante("Maximiliano Jacome", "1293200472", "Regular");
		universidad.registraUni("UTE", "Ciencias de la Salud", estudianteR.calculaDescuento());
		System.out.println(estudianteR.calculaDescuento());
		
		matricula.generaMatricula("Medicina", "Segundo", LocalDateTime.of(10, 11,22,8,11), universidad, estudianteR);
		
	}

}
