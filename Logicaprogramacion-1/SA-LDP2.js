//             Logica-programacion-2

//Crear un programa en Javascript que realice lo siguiente:

//Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
let gradosCelsius = (prompt("Introduzca la temperatura en grados Celsius: "));


//Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin.
//Debe imprimir ambos resultados por consola o por el DOM.
//Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
if (isNaN(gradosCelsius)) {
    alert("Esto no es un número, introduzca un valor válido")
} else {
    let conversorCaF = (gradosCelsius * (9/5)) + 32
    let conversorCaK = gradosCelsius + 273.15
    
    alert("Grados Fahrenheit: "+ conversorCaF+" "+"Grados Kalvin: "+ conversorCaK)
}
