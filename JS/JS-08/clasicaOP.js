class OperacionesAritmeticas{
numero0 = 0;
numero1 = 0;

constructor (valor0, valor1){
    this.numero0 = valor0;
    this.numero1 = valor1;
}


sumar(a, b){
    return a+b;
}
}


let obj4 = new OperacionesAritmeticas();





let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 9;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));



let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5, 6));



let obj1;
obj1 = new OperacionesAritmeticas();
let a = obj1.numero0;
console.log(obj1.numero0);