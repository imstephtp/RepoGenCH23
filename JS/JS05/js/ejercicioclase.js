let GPAacumulativo = 2.1
let Unidadestotales = 120

if (GPAacumulativo > 2.0 && Unidadestotales >= 120) {
    console.log("Puede graduarse")
}




let texto = "Hola mundo";
let texto2 = "";
for (let i = 0; i < texto.length; i++) {
    if (texto[i] != " ") {
        texto2 += texto[i] + ".";
    } else {
        texto2 += " ";
    }
}
texto2 = texto2.trim();
console.log(texto2.trim());