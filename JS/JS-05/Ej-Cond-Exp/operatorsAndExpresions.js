//EXCERCISE #1

let names = ['Maria', 'Antony', 'Joy', 'Juan'];
console.log('Lista de personas: ', names);
//Part 1
let names1= names.concat('Stephany');
console.log('Lista de personas actualizada: ', names1);
//Part 2
function checkName(names1) {
    return names1.includes('Stephany');
}
console.log('Incluye el nombre', names1)
//Part 3


//EXCERCISE #2
false || (true && false);
true || (11 + 12);
(31 + 22) || true;
true && (1 + 7);
false && (3 + 4);
(1 + 2) && true;
(32 * 4) >= 129;
false !== !true;
true === 4;
false === (847 === '847');
false === (887 == '887');
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false;