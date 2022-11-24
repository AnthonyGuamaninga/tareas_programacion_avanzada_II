package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matricula matricula = new Matricula();
		EstudianteRegular estudianteR= new EstudianteRegular();
		EstudianteNoRegular estudianteNR = new EstudianteNoRegular();
		Universidad universidad = new Universidad();
		Universidad universidad1 = new Universidad();
		
		universidad.registraUni("UCE", "Ingerieria y Ciencias Aplicadas", estudianteR.calculaDescuento());
		universidad1.registraUni("UTE", "Medicina", estudianteNR.calculaDescuento());
		
		//estudiante regular
		estudianteR.setNombre("Anthony");
		estudianteR.setCedula("1745294990");
		estudianteR.setTipo("Regular");
		estudianteR.setMiembroClub(false);
		
		//estudiante irregular
		estudianteNR.setNombre("Julian Beltran");
		estudianteNR.setCedula("1254366893");
		estudianteNR.setTipo("Irregular");
		estudianteNR.setNumMateriasRecursadas(2);
		
		
		matricula.generaMatricula("Computacion", "nivelacion", LocalDateTime.of(2023, 1, 22, 8, 30), universidad,
				estudianteR);

		matricula.generaMatricula("Computacion", "nivelacion", LocalDateTime.of(2023, 1, 22, 8, 30), universidad1,
				estudianteNR);
		
	}

}
