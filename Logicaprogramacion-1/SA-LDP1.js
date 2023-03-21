//             Logica-programacion-1

//Crear un programa en Javascript que realice lo siguiente:

// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables
let numero1 = parseInt(prompt("Introduzca un numero: "));
let numero2 = parseInt(prompt("Introduzca un numero: "));
let numero3 = parseInt(prompt("Introduzca un numero: "));

//Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.

let UnOrderedNumbers = [numero1, numero2, numero3];

let OrderedNumbersAsc = UnOrderedNumbers.sort(function(a, b){return a-b});

console.log("Los números en orden ascendente son: "+ OrderedNumbersAsc);

let OrderedNumbersDesc = UnOrderedNumbers.sort(function(a, b){return b-a});
console.log("Los números en orden descendente son: "+OrderedNumbersDesc);

// Identificar si los números son iguales
if (numero1 === numero2 && numero2 === numero3) {
  console.log("Los números ingresados son iguales.");
}

