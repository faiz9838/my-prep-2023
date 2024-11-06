const tinderUser = {};

tinderUser.id = "1234";
tinderUser.name = "Faiz";
tinderUser.isLoggIn = true;

console.log(tinderUser);

const regularUser = {
  email: "afaiz8720@gmail.com",
  fullname: {
    userFullname: {
      firstname: "Faiz",
      secondname: "Ahmad",
    },
  },
};

//Printing first and last name
console.log(
  regularUser.fullname.userFullname.firstname +
    " " +
    regularUser.fullname.userFullname.secondname
);
