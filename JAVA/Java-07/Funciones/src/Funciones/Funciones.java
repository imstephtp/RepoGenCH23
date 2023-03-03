package Funciones;

public class Funciones {

	//Las funciones se puden declarar en cualquier lugar de la clase
    public static int sumar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }//cierre sumar
    
    public static int restar (int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }//cierre restar
    
    public static int multiplicar (int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }//cierre mutiplicar
    
    public static int dividir (int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }//cierre dividir
	
	
	//Funcion para imprimir asteriscos
	public static void imprimirAsteriscos() {
		System.out.println("********************************");
	}//cierre imprimir asteriscos
	
	//Funcion que combina distintos tipos de valores
	public static float sumaDecimal (float valor1, int valor2) {
		int resultadoDecimal = (int) valor1 + valor2;
		return resultadoDecimal;
	}
	
	//funcion que usa Strigs como argumentos 
	public static String awitaDeLimon (String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	
	//Este metodo tiene como funcion, ejecutar cosas
	public static void main(String[] args) {
		// Las invocaciones de la funciónn se hacen generalmente dentro del métodoprincipal o main
		System.out.println("El resultado de la suma es: " + sumar (5,8));
		
		imprimirAsteriscos();
		
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f,5));
		
		imprimirAsteriscos();
		
		System.out.println("Estos son los pasos para preparar agüita de limon: " + awitaDeLimon("agua", "limon", "Azucar"));
		
	}//cierre de metodo main
	

}//cierre de clase Funciones


/*
 * FUNCIONES
  
  	-No retornan valores: No devuelven nada, no se especifica nada y no usamos la palabra return.
  
  	- Si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y se usa para esto.
 
 	- Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }

 * 
 * */

