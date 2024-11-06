let number = 10;
const value = 300;

if (true) {
  let number = 100;
  const value = 900;
  //Accessing local scope variables
  console.log("Loacal let: ", number);
  console.log("local const: ", value);
}

//Accessing global scope variables

console.log("Global let: ", number);
console.log("Global const: ", value);

function sayName(name) {
  function welcome() {
    console.log(`Welcome to JS World`);
  }
  welcome();
  return name;
}
console.log(`${sayName("Faiz Ahmad")}`);
