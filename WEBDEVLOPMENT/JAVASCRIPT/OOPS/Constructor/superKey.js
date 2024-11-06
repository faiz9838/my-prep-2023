class car {
  constructor() {
    this.company = "BMW";
  }
}

class person extends car {
  constructor(id, name) {
    super();
    this.id = id;
    this.name = name;
  }
}

const person1 = new person(1, "Faiz Ahmad");
console.log(person1.name);
