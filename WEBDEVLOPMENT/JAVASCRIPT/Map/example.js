let map = new Map([
  [1, "Shaikh Tahoora"],
  ["Khan Talha", "Gulafsha Ansari"],
]);

console.log(map);

//using set() method

let map1 = new Map();

map1.set("Faiz", "Tahoora");
map1.set("Khan talha", "Gul afsha");

map1.forEach((value, index, map1) => {
  console.log(value, index, map1);
});
