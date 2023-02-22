console.log("Hola desde NPM...");

const parrotSay = require('parrotsay-api')
 
parrotSay('Soy un perico')
  .then(console.log)
  .catch(console.error)