package com.example.demo.herencia;

public class Universidad {

	private String nombre;
	private String facultad;
	private boolean gratuidad;
	private int valorFinal;
	private double descuento;
		
	public void registraUni (String nombreUni, String facultad, double descuento) {
		this.nombre= nombreUni;
		this.facultad=facultad;
		this.descuento=descuento;
		
		this.valorFinal=obtenerValor(nombreUni,descuento);
		
	}
	
	public int obtenerValor(String nomUniversidad, double descuentoU) {
		gratuidad=true;
		int valorF=0;
		double valorInicial=0;
		if(nomUniversidad.equals("UCE") ) {
			this.gratuidad=true;
		}else if(nomUniversidad.equals("UTE")) {
			this.gratuidad=false;
		}else if(nomUniversidad.equals("ESPE")) {
			this.gratuidad=true;
		}else if(nomUniversidad.equals("PUCE")) {
			this.gratuidad=false;
		}
					
		if(gratuidad==false) {
			valorInicial= (Math.random() * ((2500 - 500) + 1)) + 500;
			valorF= (int) (valorInicial- (valorInicial*descuentoU));
			
		}		
		return valorF;
	}

	@Override
	public String toString() {
		if(gratuidad) {
			return "\t[Nombre: " + nombre 
					+ "\n\t\t Facultad: " + facultad 
					+ "\n\t\t Gratuidad: " + gratuidad 
					+ "\n\t\t Valor a pagar: " + valorFinal + "]";
		}else {
			return "\t[Nombre: " + nombre 
					+ "\n\t\t Facultad: " + facultad 
					+ "\n\t\t Gratuidad: " + gratuidad 
					+ "\n\t\t Descuento: " + descuento*10 +"%" 
					+ "\n\t\t Valor a pagar: " + valorFinal + "]";
		}
		
	}

	//GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public boolean isGratuidad() {
		return gratuidad;
	}

	public void setGratuidad(boolean gratuidad) {
		this.gratuidad = gratuidad;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(int valorFinal) {
		this.valorFinal = valorFinal;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
	
	
	
}
