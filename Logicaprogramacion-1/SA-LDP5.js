//             Logica-programacion-5

//Crear un programa en Javascript que realice lo siguiente:

let numeroSecreto = Math.floor(Math.random() * 100) + 1; // Generar número aleatorio del 1 al 100
let numerosIngresados = []; // Array para almacenar los números ingresados por el usuario

//Pedir al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
function adivinarNumero() {
  let numeroIngresado = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:");

  if (isNaN(numeroIngresado)) { // Comprobar si el dato ingresado es un número
    console.log("Error: Debes ingresar un número válido.");
    adivinarNumero(); // Volver a solicitar el dato
  } else {
    numeroIngresado = parseInt(numeroIngresado); // Convertir el dato ingresado a un número entero

    if (numeroIngresado < 1 || numeroIngresado > 100) { // Comprobar si el número está dentro del rango válido
      console.log("Error: Debes ingresar un número del 1 al 100.");
      adivinarNumero(); // Volver a solicitar el dato
    } else {
      numerosIngresados.push(numeroIngresado); // Agregar el número ingresado al array de números ingresados

      if (numeroIngresado === numeroSecreto) { // Comprobar si el número ingresado es igual al número secreto
        console.log("Felicidades, adivinaste el número secreto.");
        console.log("Lista de números ingresados: " + numerosIngresados.join(", "));
      } else {
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
        adivinarNumero(); // Volver a solicitar el dato
      }
    }
  }
}

adivinarNumero(); // Llamar a la función para iniciar el juego
