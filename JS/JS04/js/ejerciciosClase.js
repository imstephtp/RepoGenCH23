//Ejercicio # 1

let personas = ['Sofia', 'David', 'Juan'];
personas.push('Sara', 'Augustin');
let primerPersona = personas.shift();
console.log('Persona llamada: ', primerPersona);
console.log('PErsonas en la fila: ', personas);
//Insertar un elemnto en la segunda posición
personas.splice(1, 0, 'Renata');
personas.push('Elena');
console.log('Personas en la fila:', personas);

//Ejercicios # 2

let asterisco = '*';
for (let i = 0; i < 5; i++){
    console.log(asterisco);
    asterisco += '*';
}


//Ejercicio # 3