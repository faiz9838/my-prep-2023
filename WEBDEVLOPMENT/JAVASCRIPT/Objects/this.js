const employee = {
  id: 1,
  name: "Faiz Ahmad",
  Company: "Amazon",
  identity() {
    return "Name is : " + this.name;
  },
};

console.log(employee.identity());

//Another method to use This keyword

function student(name) {
  this.name = name;
  this.identity = function () {
    console.log(`Hi, I'm ${this.name}.`);
  };
}

//Creating object with new keyword and call the student() as a cunstructor
const salva = new student("Salva");
salva.name;
salva.identity();
