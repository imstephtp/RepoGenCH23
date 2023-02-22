let miVariable = 5;
let miArray = [2, 3, 4, 5, 6, 7];

console.log("MiArray" +miArray [0])
console.log("MiArray" +miArray [1])

let miArray1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

console.log("MiArray" +miArray1 [0][1])
console.log("MiArray" +miArray1 [0][2])
console.log("MiArray" +miArray1 [2][1])
console.log("MiArray" +miArray1 [1][2])
console.log("MiArray" +miArray1 [1][0])

//Primero lee fila y depués columna. 
console.log("todo el índice" +miArray1 [0]);
console.log("todo el índice" +miArray1 [1]);
console.log("todo el índice" +miArray1 [2]);

/************************** Cilco For ************************************* */

let miArray2 = [2, 3, 4, 5, 6, 7];

for (let i = 0; i <= 5; i++) {
    console.log("imprimiendo miArray -> " + miArray2);
}

let miArray3 = [ 
    [1, 2, 3],    
    [4, 5, 6],     
    [7, 8, 9]
];
let matrizR= [
    [],[],[]
]

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray3[i][j] * miArray3[i][j];
    }
    
}
console.log("MatrizR->"+matrizR);






for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("matrizR -> " + miArray3[i][j]);
    }
}