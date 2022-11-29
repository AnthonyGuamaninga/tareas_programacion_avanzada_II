package com.example.demo.herencia;

public class EstudianteRegularH extends EstudianteH {
	
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
