// foreach()

let arr = [, 2, 3, 4, 61, 4, 5, 7, 76];
arr.forEach((value) => {
  console.log(value);
});

//reduce method

let sum = arr.reduce((total, elements) => {
  return total + elements;
});

console.log("Sum:", sum);

//filter()

const filter = arr.filter((element) => {
  return element < 22;
});
console.log("Filter elements: ", filter);
