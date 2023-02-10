//Funciones


/*
Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)
*/

/*
Cosas importantes a tener en cuenta para crear funciones

-Nombre que sea descriptivo y evoque al funcionamiento de ese bloque de código
-Datos de entrada (parámetros)
-Procesos o instrucciones a ejecutar
-Salida

*/

//Función directa
function agregarCarritoCompra(){
    //lo que hace mi función
}

//Invocar función
agregarCarritoCompra();

//Función anónima
//necesita depender de una variable, porque no tiene un nombre al lado de la función
let x = function(){
    let valor1 = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log("Esta función anónima: ", suma);
}

x()

//Funcion

function division (parametro1, parametro2){
    let resultado = parametro1 / parametro2;
    console.log(resultado);
}

division(88, 10)

/*
-Funsiones directas - nombre (Comunes)
-Funciones anónimas - viven pegadas a una variable o constante
-Funciones como métodos (para especificar qué hace mi objeto)
-Funciones como constructores (Para construir o crear un objeto)
*/

//Funciones flecha

//Sintaxis de una función flecha

//Función directa o normal
function suma(a,b){
    let sum1 = a + b
    console.log(sum1)
}

//Función flecha
const suma = (a, b) => a + b;

console.log(suma);

//Funcion flecha con más línea de cógico
var sumaryMultiplicar = (a, b) => {
    const sum = a + b;
    const result = sum * 2;
    console.log(result);
}


/*

Return

La sentencia return finaliza la ejecucion de la funcion, y especifica un valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar y tambien para poder asignar el resultado a una variable.


*/

function areaCuadrado(){
    let lado = 5;
    let area = lado * lado;
    console.log("El área de mi cuadrado es: ", area);
    return area;
}

areaCuadrado();

let resultadoDeMiFuncion = areaCuadrado();

console.log("El resultado de mi función cuadrado es: ", resultadoDeMiFuncion);