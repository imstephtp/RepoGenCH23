let lista = [12,5,80,34,7];


//Sort

lista.sort(
    function(valor1,valor2){
        return valor1 > valor2;
    }
);
console.log(lista);



//Reverse

lista.reverse();
console.log(lista);



//Splice

let remover = lista.splice(1,2);
console.log(remover);
console.log(lista);
lista.splice(2, 0, 100, 200, 300);
console.log(lista);



//Shift

lista.shift();
console.log(lista);



//Pop

lista.pop();
console.log(lista);



//Concat

let masE = lista.concat(100,200,300);
console.log(masE);



//Push

lista.push(100);
console.log(lista);



//Join

let msj = lista.join("-");
console.log(msj);


//Slice

let listaNueva = lista.slice(1, 3)
console.log(listaNueva);



//Length

for (let i = 0; i< lista. length; i++){
    console.log("-->"+lista[i]);
}
console.log(lista);