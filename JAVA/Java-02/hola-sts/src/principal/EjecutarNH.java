package principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH {

	public static void main (String [] args) {
		
		Scanner sn = new Scanner(System.in);
		
		NuevoHola nh = new NuevoHola("Stephany");
		nh.saludo();
		
		String nombre; 
		System.out.println("Cual es tu nombre: ");
		nombre = sn.nextLine();
		
		NuevoHola nh1 = new NuevoHola (nombre);
		nh1.saludoConNombre();
	}
	
}
