//CALL() METHOD
const employee = {
  id: 1,
  name: "Faiz Ahmad",
  Company: "Amazon",
  fullname: function () {
    return this.fullname;
  },
};

const employee1 = {
  fullname: "Faiz Ahmad Samanee",
};
console.log(employee.fullname.call(employee1));

//APPLY() METHOD
const employee2 = {
  id: 1,
  name: "Faiz Ahmad",
  Company: "Amazon",
  fullname: function () {
    return this.fullname;
  },
};

const employee3 = {
  fullname: "Faiz Ahmad Samanee",
};
console.log(employee2.fullname.apply(employee3));

// Freeze method
// Object.freeze(employee1);
// console.log(employee1);

// Assign() method => // Object.assign({}, obj1,obj2)
const obj3 = Object.assign({}, employee1, employee3);
console.log(obj3);

// Key() => use for finding the key
console.log(Object.keys(employee1));

//Value() => use for finding value of object

console.log(Object.values(employee1));
