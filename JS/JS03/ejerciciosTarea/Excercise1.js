



let yearDayNumber = (prompt("Numéro de día a verificar: "));

let janFirstDayNumber = (prompt("Número de día que fue 1ro de enero: "));

function fix (){
    let weekDayNumberFixed = (yearDayNumber + janFirstDayNumber);
    console.log("El día corregido por inicio de año es: ", weekDayNumberFixed);
    return weekDayNumberFixed;
}

    function remainer (){
    let DayOfTheWeek = (weekDayNumberFixed%7);
    console.log("El número de día semana es: ", DayOfTheWeek);
    return DayOfTheWeek;
}

if (DayofTheWeek === 0 || DayofTheWeek === 6){
    console.log( )
} 
