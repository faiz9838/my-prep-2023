function User(name) {
  this.name = name;
  this.isAdmin = true;
}

const user = new User("Faiz Ahmad");
console.log(user.name + " " + user.isAdmin);
