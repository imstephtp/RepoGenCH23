package oop.clases;

public class Persona {	
	
	public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiaco = zodiaco;
	}
	
	public Persona() {
		super();
	}

	private String nombre="Brandon Moreles";
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getZodiaco() {
		return zodiaco;
	}
	public void setZodiaco(String zodiaco) {
		this.zodiaco = zodiaco;
	}
	private int edad=21;
	private double altura=1.72;
	private double peso=75;
	private String zodiaco="Que rayos es eso";
	public void impreso(){
		
	}
	
}
