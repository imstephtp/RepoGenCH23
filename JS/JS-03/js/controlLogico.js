let hora = Number(prompt("Indica la hora: "))

if (hora >= 6 && hora <= 11){
    document.write("Buenos días, ya yepeté");
}
else if (hora >= 12 && hora <= 18){
    document.write("Buenos días... tardes ya");
}
else if (hora >= 19 && hora <=23){
    document.write("Gus nai");
}
else if (hora >= 0 && hora <= 5){
    document.write("¿Por qué no estás durmiendo?");
}
else {
    document.write("Hora no válida");
}