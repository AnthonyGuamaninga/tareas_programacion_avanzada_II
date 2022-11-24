package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class EstudianteRegularSB extends EstudianteSB {
	
	private boolean miembroClub;
	
	public Double calculaDescuento() {
		//System.out.println("El estudiante cuenta con descuento del 5%");
		return 0.05;
	}

	public boolean getMiembroClub() {
		return miembroClub;
	}

	public void setMiembroClub(boolean miembroClub) {
		this.miembroClub = miembroClub;
	}

	
	
	
	

}
