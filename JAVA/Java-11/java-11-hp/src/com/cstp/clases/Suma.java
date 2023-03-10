package com.cstp.clases;

public class Suma implements OperacionesAritmeticas, Mensajes {
private double a;
private double b;



	public Suma(double a, double b) {
	this.a = a;
	this.b = b;
}

	@Override
	public double sumar() {
		return this.a+this.b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return this.a - this.b;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		System.out.println("Hey, wake up!");
	}

	public Suma() {
		
	}
}
