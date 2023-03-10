package com.cstp.testers;

import com.cstp.clases.*;

public class TestFigurasGeometricas {

	public static void main(String[] args) {

		FigurasGeometricas rectangulo = new Rectangulo(10, 2);
		FigurasGeometricas circulo = new Circulo (7);
		FigurasGeometricas triangulo = new Triangulo(5, 8);
		FigurasGeometricas cuadrado = new Cuadrado(9);
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(triangulo.areas());
		System.out.println(cuadrado.areas());
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(cuadrado.toString());
		
		rectangulo.pedirDatos();

		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
	}

}
