function employee(fname, lname) {
  this.fname = fname;
  this.lname = lname;
}

employee.prototype.fullname = function () {
  return this.fname + " " + this.lname;
};

const employee1 = new employee("Martin", "Roy");
console.log(employee1.fullname());
