let miVariable = 34;

let miArreglo = []; //declaración literal
let miArreglo01 = new Array(); //por instancia

let miArreglo02 = [31,32,33,34]
console.log("dato de miArreglo en el indice 0 - "+ miArreglo02[0]);
console.log("dato de miArreglo en el indice 1 - "+ miArreglo02[1]);
console.log("dato de miArreglo en el indice 2 - "+ miArreglo02[2]);
console.log("dato de miArreglo en el indice 3 - "+ miArreglo02[3]);
console.log("El tamaño o número de elementos del arreglo02 es: " + miArreglo02.length)

let miArreglo03 = ["Hola", "qué", "tal"];
console.log (miArreglo03[0]);
console.log (miArreglo03[1]);
console.log (miArreglo03[2]);
console.log ("El tamaño de miArreglo03 es: "+ miArreglo03.length); // me da cúantos elementos tiene el arreglo

let miArreglo04 = [{nombre: "Hugo"}, {apellido: "Fernandez"}, {edad: 23}];
console.log ("Elemento de arreglo de tipo objeto miArreglo04 " + miArreglo04[0].nombre);
console.log ("Elemento de arreglo de tipo objeto miArreglo04 " + miArreglo04[1].apellido);
console.log ("Elemento de arreglo de tipo objeto miArreglo04 " + miArreglo04[2].edad);
console.log ("El tamaño de miAarreglo04 es " + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arregloNuevo con sort: " + nuevoArreglo00.sort()); //me entrga el arreglo ordenado de menor a mayor
console.log("Orden de mi arregloNuevo método pop: " + nuevoArreglo00.pop());  // me entregar el último elemento del arreglo
console.log("Orden de mi arregloNuevo método push: " + nuevoArreglo00.push(10));  // me entregar el último elemento del arreglo
console.log("Orden de mi arregloNuevo con reverse: " + nuevoArreglo00.reverse()); //me entrga el arreglo ordenado de mayor a menor

let matriz = [[1,2,3],[4,5,6],[7,8,9]];
console.log("tamaño" + matriz.length);
console.log(matriz[1][1]);
console.log(matriz[2][1]);
console.log(matriz[0][2])