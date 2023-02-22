
//EJERCICIO
/* 
Crea un traductor para un día de la semana.
Tu programa debe leer una variable llamada "díaNumero" e imprimir (con console.log) el día correspondiente de la semana, donde 0 es domingo y 6 es sábado. 
Para cualerquiera de otros valores, tu programa debe imprimir "Número de día inválido".
*/

//Ejericio impreso//

let díaNumero = parseInt(prompt("Escribe un número del 0 al 6"));

if (díaNumero === 1){
    document.write("</h2>Lunes</h2>")
}
else if (díaNumero === 2){
    document.write("<h2>Martes</h2>")
}
else if (díaNumero === 3){
    document.write("<h2>Miércoles</h2>")
}
else if (díaNumero === 4){
    document.write("<h2>Jueves</h2>")
}
else if (díaNumero === 5){
    document.write("<h2>Viernes</h2>")
}
else if (díaNumero === 6){
    document.write("<h2>Sábado</h2>")
}
else if (díaNumero === 0){
    document.write("<h2>Domingo</h2>")
}
else {
    document.write("<h2>Número de día inválido.</h2>")
}


/*
let 1 = Lunes = 1
let 2 = Martes = 2
let 3 = Miercoles = 3
let 4 = Jueves = 4
let 5 = Viernes = 5
let 6 = Sábado = 6 
let 0 = Domingo = 0 
*/

//Ejercicio en consola//
/*
let díaNumero = parseInt(prompt("Escribe un número del 0 al 6"));

if (díaNumero === 1){
    console.log("</h2>Lunes</h2>")
}
else if (díaNumero === 2){
    console.log("<h2>Martes</h2>")
}
else if (díaNumero === 3){
    console.log("<h2>Miércoles</h2>")
}
else if (díaNumero === 4){
    console.log("<h2>Jueves</h2>")
}
else if (díaNumero === 5){
    console.log("<h2>Viernes</h2>")
}
else if (díaNumero === 6){
    console.log("<h2>Sábado</h2>")
}
else if (díaNumero === 0){
    console.log("<h2>Domingo</h2>")
}
else {
    console.log("<h2>Número de día inválido.</h2>")
}
*/


//OPERADORES LÓGICOS BÁSICOS
/*
and &&
or  ||
not ¡
*/
