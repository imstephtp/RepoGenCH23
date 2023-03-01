package control;

import java.util.Scanner;

public class EstructuraMultiple {
	
	Scanner dato = new Scanner(System.in);
	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca una letra: ");
		char letra = dato.next().charAt(0);
		
		switch (letra) {
		case 'a': case 'A':
		case 'e': case 'E':
		case 'i': case 'I':
		case 'o': case 'O':
		case 'u': case 'U':
			System.out.println("El carácter es una vocal");
			break;
		
		default:
			System.out.println("El caracter " + letra + " no es vocal");
			break;
		}
	}
	
	
	public void notas() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca su calificación: ");
		int nota = dato.nextInt();
		switch (nota) {
		case 10:System.out.println("Excelente");
		break;
		case 9:System.out.println("Muy bien");
		break;
		case 8:System.out.println("Bien");
		break;
		case 7:System.out.println("Regular");
		break;
		case 6:System.out.println("Deficiente");
		break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:System.out.println("Reprobado");
		break;
			
			default:
				System.out.println("Fuera de rango");
				break;
		}
		
	}
	
	
	/* 
	 * ?: Operador Elvis u operador ternario
	 * 
	 * variable = (PL) ? entrada verdad : entrada falso
	 * 
	 * */
	
	public void ternario() {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un primer valor numérico: ");
		int entradaV = dato.nextInt ();
		System.out.println("Introduzca un segundo valor numérico: ");
		int entradaF = dato.nextInt ();
		int menor = (entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("---->" + menor);
		
	}
	
}
