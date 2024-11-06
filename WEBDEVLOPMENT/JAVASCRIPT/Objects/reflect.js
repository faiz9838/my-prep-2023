const car = {
  name: "Audi",
  model: "Q6",
  price: 7000000,
};

//get value
const prop = "model";
const model = Reflect.get(car, prop);
console.log("Model is: ", model);

//check property exists or not
console.log(Reflect.has(car, "name"));

//Set object property

const models = Reflect.set(car, "door", 4);
console.log(car.door);
