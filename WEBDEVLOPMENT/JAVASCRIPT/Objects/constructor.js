function employee(name, Class, roll) {
  this.name = name;
  this.Class = Class;
  this.roll = roll;
}

//Accessing using constructor of this object

const employee_1 = new employee("Faiz", "Ty", 22);
console.log(employee_1.name + " " + employee_1.Class + " ");
