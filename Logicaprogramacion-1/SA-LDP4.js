//Crear un programa en Javascript que realice lo siguiente:

    //Debe solicitar al usuario un número por prompt o por input y guardarlo.
    var Darla = 0;
    var a = prompt("Introduzca un número: ");

if (a === Darla) {
    alert("El número de la serie Fibonacci es 0")
} 

else {
    //LOOP

    for (let index = 1; index < a; index++) {
        a = a + index;
    
        let ArregloFibo =  [0]
    
        ArregloFibo.push(a)
    }

alert("Los números de la serie Fibonacci es " + ArregloFibo)

}



    //Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.


    //Debe imprimir el resultado por consola o por el DOM.
    
    
    //Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.