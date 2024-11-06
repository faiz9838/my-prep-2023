const arr = [2, 4, 5, 7, 11];

for (let x in arr) {
  console.log(arr[x]);
}

const fruits = ["apple", "mango", "grapes"];
const fruits1 = [];
for (const fruit in fruits) {
  fruits1.push(fruit.toUpperCase());
}

console.log(fruits1);
