class person {
  getfullName() {
    return this.fname + " " + this.lname;
  }

  setName(fname, lname) {
    this.fname = fname;
    this.lname = lname;
  }
}

var person1 = new person();
person1.setName("Faiz", "Ahmad");
console.log(person1.getfullName());
