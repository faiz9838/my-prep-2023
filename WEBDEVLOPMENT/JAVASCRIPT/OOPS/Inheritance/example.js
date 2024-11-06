class person {
  constructor(name) {
    this.name = name;
  }

  toString() {
    return `Name of person: ${this.name}`;
  }
}

class student extends person {
  constructor(name, id) {
    super(name);
    this.id = id;
  }

  toString() {
    return `${super.toString()} Student id: ${this.id}`;
  }
}

let student1 = new student("FAIZ AHMAD", 22);

console.log(student1.toString());
