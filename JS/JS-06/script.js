/*

Que encontramos en el arbol del DOM?

- Node: Es la unidad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc. 

    <title> NODO
        Manipualacion DOM //Es un nodo, pero es hijo del title
    </title>


- Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

- Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

- Attributes: Nodos que dan informacion asociada al tipo de elemento

- Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.


*/

/*Como leer nodos de mi Document Object Model (DOM)


Metodos tradicionales (que se usan en versiones antiguas de JS)

    - document.getElementById (botonSuma)
    - document.getElementByTagName (<button>)
    - document.getElementByClassName (botones)
*/

//
/*
var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);
console.log("Este es el primer elemento de mi colección de botones", elementoEtiqueta[0]);

var elementoClassName = document.getElementsByClassName("botones");
console.log(elementoClassName);

/*
Métodos reciente

    - document.querySelector(#botones)
    - doument.querySelectorALL(.botones)
*/
/*
var unElemento = document.querySelector("#input1");
console.log(unElemento);

var variosElementos = document.querySelectorAll(".botones");
console.log(variosElementos);
*/

/**

Creación de Nodos

- document.createElement(tipoNodo) */

/*
//Creación de una etiqueta del tipo de imagen
var imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2016/06/perritos-tiernos.jpg";
imagenPerrito.alt = "Foto de perrito tierno";
imagenPerrito.style.width = "150px";

//Poner elementos o nodos en el html
document.body.append(imagenPerrito);
*/

//Actualizar nodos
//1er paso: Identificar el nodo que quiero cambiar (outer)
//2do paso: Modificar el nodo (inner)

/**
- Manipulación del DOM

    -Métodos para actualizar elementos


    -Métodos para crear elementos 
    -document.createElement(etiqueta)
    -document.createTextNode(texto) - Investigar

- Métodos para insertar elementos

    -parentElement.append
    -parentElement.insertBefore
    -parentElement.insertAdjacentElement

- Metodos para modificar elementos

    -node.outerHTML
    -node.innerHTML
 */

    /*
var resultadoQueCambia = document.getElementById("resultado");

resultadoQueCambia.innerHTML = "Saludos, cambién el texto" 
*/


//Construir la calculadora

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");


//Construimos las funciones de nuestra calculadora

function suma (){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let suma = valor1 + valor2;
    resultado.innerHTML = suma;
}

function resta (){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let resta = valor1 - valor2;
    resultado.innerHTML = resta;
}

function multiplicacion (){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let multiplicacion = valor1 * valor2;
    resultado.innerHTML = multiplicacion;
}

function division (){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let division = valor1 / valor2;
    resultado.innerHTML = division;
}

/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar", lo que quiero que haga)

        -node (nodo donde aterrizo el evento)
        -addEventListener (parabra reservada para usar el evento)
        -evento a escuchar (click, mouseover, etc)
        -Lo que quiero que haga (la llamada de la función)

*/
botonSuma.addEventListener("click", suma);

botonResta.addEventListener("click", resta);

botonMultiplicacion.addEventListener("click", multiplicacion);

botonDivision.addEventListener("click", division);


//Primer paso: Definir con que voy a interactuar (almaceno una variable)
const textoAModificar = document.querySelector("h1")

//Creo una función que cambia el color, según el color 
function cambiarColor(color){
    textoAModificar.style.color = color;
}