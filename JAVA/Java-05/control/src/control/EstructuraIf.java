package control;

import java.util.Scanner;


public class EstructuraIf {
	
	Scanner entrada = new Scanner (System.in);
	
	public void controlIf() {
		
		/*if (condition) {
			
		} else {
			
		}
		*/
		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobatoria " + nota);
		}
		
		System.out.println("Continua el control de flujo...");
		
		
		if (nota >= 5) {
			System.out.println("Nota aprobatoria " + nota);
		} else {
			System.out.println("Nota no aprobatoria " + nota);
		}
		
		
	}

	public void divisible() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un número: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introuzca otro número: ");
		int dato2 = entrada.nextInt();
		
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + " es divisible entre " + dato2);
		} else {
			System.out.println(dato1 + " no es divisible entre " + dato2);
		}
	}
	
	public void compara() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un número: ");
		int valor1 = entrada.nextInt();
		System.out.println("Introuzca otro número: ");
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			System.out.println(valor1 + " es mayor que " + valor2);
		} else if (valor2 > valor1) {
			System.out.println(valor2 + " es mayor que " + valor1);
		} else {
			System.out.println(valor1 + " es igual que " + valor2);
		}
		
	}
	
	public void anidado() {
		// TODO Auto-generated method stub
		/*
		if (condition) {
			
		} else if {
			
		} else {
			
		}
		*/
		
		System.out.println("Introduzca un número: ");
		int anidado1 = entrada.nextInt();
		
		
		if (anidado1 > 0) {
			System.out.println(anidado1 + " es  un valor positivo");
		} else if (anidado1 < 0) {
			System.out.println(anidado1 + " es un valor negativo");
		} else {
			System.out.println(anidado1 + " es igual a 0");
		}
		
	}
	
	
	
	
	
}
