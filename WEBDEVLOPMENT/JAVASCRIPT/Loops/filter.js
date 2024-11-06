const num = [1, 2, 2, 3, 4, 5, 6, 7, 8, 11, 12, 4, 5];

const myNums = num.filter((item) => {
  return item < 8;
});

console.log(myNums);
