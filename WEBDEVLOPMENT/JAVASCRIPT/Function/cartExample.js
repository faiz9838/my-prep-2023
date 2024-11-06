function calculateCartPrice(...num1) {
  return num1;
}

console.log(calculateCartPrice(200, 300, 400));

const user = {
  username: "Faiz Ahmad",
  salary: 90000,
};

//Pssing object into array parameter
function userData(userObject) {
  console.log(
    `Username is ${userObject.username} and salary is ${userObject.salary}`
  );
}

userData(user);

//Passing array into the function parameter
const array = [2, 3, 4, 5, 6, 7];
function returnArrayValue(array) {
  return array;
}

const arr = returnArrayValue(array);

console.log(arr);
