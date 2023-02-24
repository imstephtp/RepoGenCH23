//prueba efectiva
//const indexTest = require ("../Calculadora");
import { indexTest } from "../Calculadora"; //ecma6
test('test suma', () => { 
    const r = indexTest.suma(1,2);
    expect(r).toBe(3);

})