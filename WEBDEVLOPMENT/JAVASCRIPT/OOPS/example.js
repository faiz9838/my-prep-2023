const { get } = require("http");

const user = {
  id: 1,
  name: "Faiz Ahmad",

  getData: () => {
    return user;
  },
};

//CONSTRUCTOR
function User(username, loginCount, isLoggedIn) {
  this.username = username;
  this.loginCount = loginCount;
  this.isLoggedIn = isLoggedIn;
  return this;
}

const userOne = new User("Faiz Ahmad", 10, true);
console.log(userOne);
