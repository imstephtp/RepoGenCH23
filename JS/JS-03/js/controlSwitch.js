// SWITCH 
/* 
switch (expresión) {
    case valor1:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor1
        [break;]
    case valor2:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
        [break;]
    ...
    case valorN:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
        [break;]
    default:
      //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
        [break;]
}
  */

let día = Number(prompt("Intrduzca un número de día de semana"));
switch (día) {
  case 1:
    document.write("Lunes");
    break;
  case 2:
    document.write("Martes");
    break;
  case 3:
    document.write("Miércoles");
    break;
  case 4:
    document.write("Jueves");
    break;
  case 5:
    document.write("Viernes");
    break;
  case 6:
    document.write("Sábado");
    break;
  case 7:
    document.write("Domingo");
    break;
  default:
    //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión case.
    document.write("No es un día válido");
    break;
}