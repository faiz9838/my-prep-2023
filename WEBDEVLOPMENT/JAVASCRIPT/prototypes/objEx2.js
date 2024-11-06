function employee(fname, lname) {
  this.fname = fname;
  this.lname = lname;
}

employee.prototype.company = () => {
  return "Samanee Global";
};

const emp1 = new employee("Faiz", "Ahmad");
console.log(emp1.company());
