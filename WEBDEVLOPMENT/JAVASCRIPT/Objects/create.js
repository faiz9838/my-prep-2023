const mysm = Symbol("key1");

const employee = {
  id: 1,
  name: "Faiz Ahmad",
  [mysm]: "myKey1",
  Company: "Amazon",
  location: "Mumbai",
  email: "afaiz8720@gmail.com",
};

const newObj = Object.create(employee);

newObj.name = "Shaikh Tahoora";
console.log(newObj.name);
