class car {
  constructor(brand) {
    this.brand = brand;
  }

  show() {
    return `I have a ${this.brand}`;
  }
}

class model extends car {
  constructor(brand, model) {
    super(brand);
    this.model = model;
  }

  show() {
    return `I have a ${this.brand}, and model is ${this.models}`;
  }
}

const car1 = new model("BMW", "AMG3");
console.log(car1);
