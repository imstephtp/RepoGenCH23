package tiposDeDatosYVariables;

public class Java04 {

	public static void main(String[] args) {
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) { //siempre tiene que ser verdadero
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) { //Con que una de las dos se cumpla es Juan Pérez.
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		
		
		
		//Ejericio 1: Verificar si un número es par y positivo:
		int numPP = 6;
		
		if ((numPP % 2 == 0) && (numPP > 0)) {
			System.out.println("Si es positivo y par");
		} else {
			System.out.println("No es positivo y par");
		}
		
	
		

	//Ejercicio 2: Verificar si un número está dentro de un rango específico
		int numR = 10;
		
		if ((numR >0) && (numR <= 50)) {
			System.out.println("Tu número está dentro de rango");
		}
		else {System.out.println("Tu número está dentro de rango");
		}
		
		

	// Ejercicio 3: Verificar si una cadena es igual a otra o no o nada
		String cadena1 = "Hola";
		String cadena2 = "hola";{
		
		if (cadena1 == cadena2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son iguales");
		}
		
	}
}
}
