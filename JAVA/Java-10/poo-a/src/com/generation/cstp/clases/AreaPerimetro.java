package com.generation.cstp.clases;

public class AreaPerimetro {

	//Cuadrado
	public double areaCuadrado(double lado) {
		double area = lado*lado;
		return area;
	}
	
	public double perimetroCuadrado(double lado) {
		double perimetro = lado*4;
		return perimetro;
	}

	//Triangulo
	
	public double areaTriangulo(int base, int altura) {
		return (base*altura)/2;

	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		return (ladoA + ladoB + ladoC);

	}
	
	//Circulo 
	
	public double areaCirculo(double radio) {
		return (Math.PI*(radio*radio));

	}
	
	public double perimetroCirculo(double radio) {
		return (2*(Math.PI*radio));

	}
	
}
