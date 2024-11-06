class person {
  constructor(name, id) {
    this.name = name;
    this.id = id;
  }

  address(add) {
    this.add = add;
  }

  getDetails() {
    console.log(`Name is: ${this.name} \nAddress is: ${this.add}`);
  }
}

let person1 = new person("Faiz Ahmad", 21);
person1.address("Mumbai");
person1.getDetails();
