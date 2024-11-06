function employee(fname, lname) {
  this.fname = fname;
  this.lname = lname;
}

employee.prototype.fullname = function () {
  return this.fname + " " + this.lname;
};

var employee1 = new employee("Faiz", "Ahmad");

console.log(employee1.fullname());
