package control;

import java.util.Scanner;

public class OrdenTres {

	Scanner dato = new Scanner(System.in);
	
	public void ternario() {
		// TODO Auto-generated method stub
		
		        System.out.println("Introduzca un numero: ");
		        int entrada1 = dato.nextInt();
		        
		        System.out.println("Introduzca un segundo valor numerico: ");
		        int entrada2 = dato.nextInt();
		        
		        System.out.println("Introduzca un tercer valor numerico: ");
		        int entrada3 = dato.nextInt();
		        
		        if (entrada1 >= entrada2 && entrada2 >= entrada3) {
		            System.out.println("El orden es: " + entrada1 + ", " + entrada2 + ", " + entrada3);
		        } else if (entrada2 >= entrada3 && entrada3 >= entrada1){
		            System.out.println("El orden es: " + entrada2 + ", " + entrada3 + ", " + entrada1);
		        } else if (entrada3 >= entrada1 && entrada1 >= entrada2){
		            System.out.println("El orden es: " + entrada3 + ", " + entrada1 + ", " + entrada2);
		        } else if (entrada1 >= entrada3 && entrada3 >= entrada2){
		            System.out.println("El orden es: " + entrada1 + ", " + entrada3 + ", " + entrada2);
		        } else if (entrada2 >= entrada1 && entrada1 >= entrada3) {
		            System.out.println("El orden es: " + entrada2 + ", " + entrada1 + ", " + entrada3);
		        } else if (entrada3 >= entrada2 && entrada2 >= entrada1) {
		            System.out.println("El orden es: " + entrada3 + ", " + entrada2 + ", " + entrada1);
		        } else {
		            System.out.print("Introduce otro set de numeros");
		        }
		        dato.close();
		    }
		}
	

