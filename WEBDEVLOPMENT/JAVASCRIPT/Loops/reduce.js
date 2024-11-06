const arr = [1, 2, 3, 4, 5];

const sum = 0;

const summation = arr.reduce((dummyValue, currentValue) => {
  return dummyValue + currentValue;
}, 0);

console.log(summation);
