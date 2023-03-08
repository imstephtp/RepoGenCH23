package com.generation.cstp.mains;

import com.generation.cstp.clases.AreaPerimetro;
import com.generation.cstp.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
AreaPerimetro ap= new AreaPerimetro();
FigurasGeometricas fg = new FigurasGeometricas();

fg.setArea(ap.areaCuadrado(0));
System.out.println("--->" + ap.area(5));

fg.setPerimetro(ap.perimetroCuadrado(0));
System.out.println("--->" + ap.area(5));



	}

}
