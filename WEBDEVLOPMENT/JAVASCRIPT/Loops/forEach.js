const coding = ["js", "ruby", "java"];

coding.forEach((element) => {
  console.log(element);
});

function printMe(item, index, arr) {
  console.log(item, index, arr);
}
coding.forEach(printMe);

const arr = [1, 2, 3, 400, 5, 6];

arr.forEach((value, index, array) => {
  console.log(index, " => ", value);
});
