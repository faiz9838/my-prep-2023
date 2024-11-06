// Default arrow function
const student = () => {
  let name = "Faiz Ahmad";
  let roll_no = 1;

  console.log("Name: " + name + " \nroll no: " + roll_no);
};

student();

// Parametrized arrow function
const addition = (num1, num2) => {
  return num1 + num2;
};

const ans = addition(20, 40);
console.log("Addition is: " + ans);

//Implicit type function

const addTwo = (num1, num2) => num1 + num2;

console.log("Addition of two number: " + addTwo(20, 80));

//Returning the object

const object = () => ({ name: "Faiz Ahmad" });
console.log(object());

//Using spread in arrow function
const Array = (...value) => {
  return value;
};

console.log([20, 30, 10, 50], [4, 4, 6, 3, 2]);
