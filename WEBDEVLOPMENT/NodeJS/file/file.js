const fs = require("fs")
const obj = require("../hello")

const result = fs.readFileSync("./test.txt",[obj])
console.log(result);