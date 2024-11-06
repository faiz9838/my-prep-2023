const car = {
  name: "mustang",
  brand: "ferrari",
  cc: "880cc",
};

const details = { ...car };
console.log(details, { ...car });
