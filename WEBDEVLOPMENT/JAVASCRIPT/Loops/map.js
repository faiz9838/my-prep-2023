const map = new Map();
map.set("55", "Siddharth Nagar");
map.set("56", "Basti");

for (const [key, value] of map) {
  console.log(key, ":", value);
}

const num = [1, 2, 3, 5, 6, 7, 8];

const number = num.map((item) => item * 10).filter((item) => item < 50);
console.log(number);

const arr = [1, 2, 3, 4, 5, 6];

const newArr = arr.map((value) => value * 10);
console.log(newArr);

const ans = arr.map((data) => {
  return data + 5;
});

console.log(ans);
