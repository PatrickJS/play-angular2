// var Reflect = null;
var zone = null;
var ng = null;
try {
  // var Reflect = require('./Reflect');
  require('./angular2');
} catch(e) {

  console.log('<pre>', e, '</pre>');
}
// console.log('system', System)
// take data from parameters
var data = JSON.parse(process.argv[2]);
// console.log('data', data)

console.log('<h1>hello angular 2 from play</h1><pre>'+JSON.stringify(data, null, 2)+'</pre>');
