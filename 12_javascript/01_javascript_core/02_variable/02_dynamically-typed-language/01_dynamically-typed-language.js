/* 01. dynamically-typed-language */

console.log('1');
var test;
console.log(typeof test);

console.log('2');
test = 1;
console.log(typeof test);

console.log('3');
test = "JavaScript"
console.log(typeof test);

console.log('4');
test = true;
console.log(typeof test);

console.log('5');
test = null;
console.log(typeof test);
console.log(test);

console.log('6');
test = Symbol();
console.log(typeof test);

console.log('7');
test = {};
console.log(typeof test);

console.log('8');
test = [];
console.log(typeof test);

console.log('9');
test = function() {};
console.log(typeof test);