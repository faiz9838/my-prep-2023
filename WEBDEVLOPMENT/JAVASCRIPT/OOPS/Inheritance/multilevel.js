class person {
  print() {
    console.log("I am a person");
  }
}
class teacher extends person {
  print() {
    console.log("I am a teacher");
  }
}

class doctor extends person {}

const p1 = new doctor();
p1.print();
