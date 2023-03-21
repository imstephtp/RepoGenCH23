//             Logica-programacion-3

//Crear un programa en Javascript que realice lo siguiente:

//Debe solicitar al usuario un número por prompt o por input y guardarlo.
var numero = prompt("Introduzca el numero a factorizar:")
var factorial = 1;


//Debe calcular el factorial del número recibido.
//Debe imprimir el resultado por consola o por el DOM.
//Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
if (isNaN(numero)) {
    alert("Esto no es un número")
} else {
    for (var index = numero; index >= 1; index--) {
        factorial = factorial * index;
    }
    alert("El resultado es " + factorial)
}




