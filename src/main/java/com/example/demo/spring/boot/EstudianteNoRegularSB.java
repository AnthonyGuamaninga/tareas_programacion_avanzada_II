package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class EstudianteNoRegularSB extends EstudianteSB {
	
	private int numMateriasRecursadas;
	
	public Double calculaDescuento() {
		//System.out.println("El estudiante no cuenta con descuento");
		return 0.00;
	}

	public int getNumMateriasRecursadas() {
		return numMateriasRecursadas;
	}

	public void setNumMateriasRecursadas(int numMateriasRecursadas) {
		this.numMateriasRecursadas = numMateriasRecursadas;
	}
	
	

}
