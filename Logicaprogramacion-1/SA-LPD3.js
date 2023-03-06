
var numero = prompt("Introduzca el numero a factorizar:")
var factorial = 1;

if (isNaN(numero)) {
    alert("Esto no es un número")
} else {
    for (var index = numero; index >= 1; index--) {
        factorial = factorial * index;
    }
    alert("El resultado es " + factorial)
}





