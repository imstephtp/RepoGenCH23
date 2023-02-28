package tiposDeDatosYVariables;

public class tiposDeDatos {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es " + fahrenheit);

        System.out.println("1 centigrado a kelvin es " + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
   
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacionb = horasTrabajadas * pago;
        System.out.println(multiplicacionb);
        
        double num = 1.61;
        int numInt = (int)num;
        //Aquí estamos diciendole que lo cambie a entero
        long numLong = (long)num;
        //Aquí le decimos que lo cambie a long
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        /*
        * datos primitivos
        * Los unicos que llevan letra al final son long, float y double
         
        byte: Sirve para representar un valor numerico de 8 bits (-128 al 127) 
        short:Sirve para representar un valor numerico de 16 bits (-32,768 al 32767)
        int: de tipo entero (sirve para representar un valor numerico de 32 bits (-(-2147483648 al 2147483647)
        )
        long: Sirve para representar un valor numerico ((-9223372036854775808 al 9223372036854775807)
        )y se le agrega una l al final
        float: Sirve para representar un valor numerico de 23 bits (numeros decimales)al final lleva una f
        double: Sirve para representar un valor numerico de 64 bits (numeros decimales) al final lleva una letra d
        boolean:Sirve para representar valores booleanos (0 y  1 o true or false)1 bit
        char: Sirve para representar un caracter de 16 bits, entre comillas simples.*/
        
        
      //string

        String cantidad = "15";
        String precio = "115.20";


        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);


        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

         

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); // y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

        System.out.println("Edad: " + edadString);
        System.out.println("Estatura: " + estaturaString);

        //conversiones
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        
        
                
                //Float
                
                float num1 = 3;
                float num2 = 2;
                float num3 = 2;
                float num4 = 5;
                float sumaf = num1 + num2;
                float multiplicaciónf = num3 * num4;
                float divisiónf = sumaf / multiplicaciónf;

                System.out.println(sumaf);
                System.out.println(multiplicaciónf);
                System.out.println(divisiónf);
                
                
                //Ejercicio 1
                //Declara 3 variables de tipo entero y utiliza el operador * y %
                
                int var1 = 9;
                int var2 = 20;
                int var3 = 2;
                
                int multiplicacion2 = (var1 * var2);
                int modulo2 = multiplicacion2 % var3;
                
                if (modulo2 == 0) {
                	System.out.println("El valor es par");}
                	
                	else {System.out.println("El valor es impar");
                }
                
                
                
                //Ejercicio 2
                //Declara dos variables de tipo boolean y utiliza el operador ==
                
                boolean b1 = true;
                boolean b2 = false;
                 
                if(b1 == b2) {
                	System.out.println("Son iguales");
                }
                else {
                	System.out.println("Son diferentes");
                }
                            
                
                
                
                //Ejercicio 3
                //Declara dos variables de tipo double y utiliza el operador <
                
                double precio1 = 77.98;
                double precio2 = 58.23;
                
                if (precio2 < precio1) {
                	System.out.println("En oferta");
                }
                else {
                	System.out.println("No está en oferta");
                }
                
                
                //Ejercicio 4 
                //Convertir farenheit a kelvin y a centigrados
                
                double fahr = 50;
                double kel = ((fahr - 32) * 5/9) + 273.15;

                System.out.println("° fahrenheit a kelvin es " + kel);
                
                double cen = (kel - 273.15);
                System.out.println("El resultado es " + cen);


                /*
                 * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
                 * ºC + 273.15
                 * °K =(°F − 32) × 5/9 + 273.15 = 273.15 K
                 */
                
                //Ejercicio 5
                //Hacer que nos diga si un numero es par e impar
                
                int varA = 99;
                int varB = 2;
                
              
                
                if ((varA % varB) == 0) {
                	System.out.println("El valor es par");}
                	
                	else {System.out.println("El valor es impar");
                }
    }
    

}

