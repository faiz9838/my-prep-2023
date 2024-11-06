class vehicle {
  constructor(name, maker, engine) {
    this.name = name;
    this.maker = maker;
    this.engine = engine;
  }

  getDetails() {
    return `The name of the bike is ${this.name}`;
  }
}

const bike1 = new vehicle("Hayabusa", "suzuki", "1340cc");
const bike2 = new vehicle("Ninja", "Kawasaki", "989cc");

console.log(bike1.name);
console.log(bike2.name);
