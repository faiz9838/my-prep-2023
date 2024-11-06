class person {
  static data() {
    return "This is static method print by using non static method ";
  }

  show() {
    console.log(person.data());
  }
}

const obj = new person();
obj.show();
