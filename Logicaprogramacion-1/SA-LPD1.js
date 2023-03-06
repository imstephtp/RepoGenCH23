

// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables
let numero1 = parseInt(prompt("Introduzca un numero: "));
let numero2 = parseInt(prompt("Introduzca un numero: "));
let numero3 = parseInt(prompt("Introduzca un numero: "));

//Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.

let UnOrderedNumbers = [numero1, numero2, numero3];

let OrderedNumbers = UnOrderedNumbers.sort(function(a, b){return a-b});

console.log(OrderedNumbers1);

let OrderedNumbers = UnOrderedNumbers.sort(function(a, b){return a-b});


/*function SortArray(numero1, numero2, numero3) {
    let OrderedNumbers = (UnOrderedNumbers.sort())
    alert(OrderedNumbers);
    return OrderedNumbers;
}
*/

