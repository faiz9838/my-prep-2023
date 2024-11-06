class student {
  constructor(id, name, roll, course) {
    this.name = name;
    this.course = course;
    this.roll = roll;
    this.id = id;
  }

  getStudentDetails() {
    return `id: ${this.id}, Name: ${this.name}, Roll: ${this.roll}, Course: ${this.course} `;
  }
}

const student1 = new student(1, "Faiz Ahmad", 1, "BSC IT");
console.log(student1.getStudentDetails());
