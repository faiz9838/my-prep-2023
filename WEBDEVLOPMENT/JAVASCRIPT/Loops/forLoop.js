//For loop
let num = 10;
for (let i = 1; i <= num; i++) {
  console.log(i + "");
}

// summation using for loop

let sum = 0;
let num1;
for (let i = 0; i < num1; i++) {
  sum += i;
}
console.log("Summation is: " + sum);

//Printing table using for loop
let num2 = 10;
for (let i = 1; i <= num2; i++) {
  console.log(num + " * " + i + " = " + num * i);
}

//PUSHING ARRARY INTO NEW ARRAY USING LOOP
const countries = ["India", "Japan", "Nepal"];
const newArr = [];
for (let i = 0; i < countries.length; i++) {
  newArr.push(countries[i].toUpperCase());
}
console.log(newArr);
