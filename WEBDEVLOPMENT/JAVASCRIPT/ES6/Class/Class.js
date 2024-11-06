class student {
  constructor(name) {
    this.name = name;
  }
}

class car {
  constructor(brand) {
    this.brand = brand;
  }

  show() {
    return `Car brand is ${this.brand}`;
  }
}

const obj1 = new student("Faiz Ahmad");
console.log(obj1.name);

const c1 = new car("BMW");
console.log(c1.show());
