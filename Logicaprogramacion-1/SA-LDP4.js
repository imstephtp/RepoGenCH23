//             Logica-programacion-4

//Crear un programa en Javascript que realice lo siguiente:

//Debe solicitar al usuario un número por prompt o por input y guardarlo.
//Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
var numero;

while (isNaN(numero)) {
    numero = parseInt(
    prompt("Ingrese un número para generar la serie de Fibonacci:")
    );
    if (isNaN(numero)) {
    console.error("El valor ingresado no es un número.");
    }
}

//Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
var fibonacci = [0, 1];
for (var i = 2; i < numero; i++) {
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
}

//Debe imprimir el resultado por consola o por el DOM.
alert(
    "La serie de Fibonacci con " + numero + " números es: " + fibonacci.join(", ")
);
