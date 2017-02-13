var fs = require("fs");
var Q = require("q");

var x, y = 3;

var p = 5;

var code = [];

const input = require('fs').readFileSync('02.txt', 'utf8');

const lines = input.split("\n");

Q.fcall(function() {

}).then(function() {

});

var p = 5;
for(var i in lines) {
  console.log("\n");
  console.log("LINE: " + lines[i]);
  code.push(executeLine(lines[i]));
  console.log("RESULT: " + code[i]);
  console.log("\n");
}
console.log("CODE: " + code.join("-"));


function move(pos, way) {
  switch(way) {
    case "U":
      return pos <= 3 ? pos : pos - 3;
      break;
    case "R":
      return pos % 3 === 0 ? pos : pos + 1;
      break;
    case "L":
      return pos % 3 === 1 ? pos : pos - 1;
      break;
    case "D":
      return pos >= 7 ? pos : pos + 3;
      break;
  }
}

function executeLine(line) {
  var directions = line.split('');
  console.log("# of instructions: " + directions.length);
  for(var i = 0; i < directions.length; i++) {
    p = move(p, directions[i]);
  }
  return p;
}