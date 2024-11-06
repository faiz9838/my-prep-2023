const { log } = require("console");

const promiseOne = new Promise(function (resolve, reject) {
  setTimeout(function () {
    console.log("Async task is complete");
    //resolve() connect with then() directly
    resolve();
  }, 5000);
});

promiseOne.then(function () {
  console.log("Promise consume");
});

new Promise(function (resolve, reject) {
  setTimeout(function () {
    console.log("Async task 2");
    resolve();
  }, 1000);
}).then(function () {
  console.log("Async 2 resolved");
});

//Promise 3 pass the user data and consumption

// const promiseThree = new Promise(function (resolve, reject) {
//   setTimeout(function () {
//     resolve({ username: "chai", email: "afaiz8720@gmail.com" });
//   }, 1000);
// });

// promiseThree.then(function (user) {
//   console.log(user);
// });

// const PromiseFour = new Promise(function (resolve, reject) {
//   setTimeout(function () {
//     let error = false;
//     if (!error) {
//       resolve({ username: "afaiz8720", email: "afaiz8720@gmil.com" });
//     } else {
//       reject("ERROR: Something went wrong");
//     }
//   }, 1000);
// });

// PromiseFour.then((user) => {
//   console.log(user);
//   return user.username;

//   //chaining
// })
//   //then method use for invoking the promise for resolve or rejection
//   .then((username) => {
//     console.log("username: ", username);
//   })

//   //catch() for catching occur error
//   .catch((error) => {
//     console.log(error);
//   })
//   .finally(() => {
//     console.log("Finally promise is rejected or either resolved");
//   });

// const promiseFive = new Promise((resolve, reject) => {
//   setTimeout(() => {
//     let error = true;

//     if (!error) {
//       resolve({ username: "javascript", password: "123" });
//     } else {
//       reject("ERROR: Something went wrong");
//     }
//   }, 1000);
// });

// // promiseFive
// //   .then((user) => {
// //     console.log(user);
// //   })
// //   .catch((error) => {
// //     console.log(error);
// //   })
// //   .finally(() => {
// //     console.log("ERROR: resolved or reject");
// //   });

// async function consumePromiseFive() {
//   try {
//     const response = await promiseFive;
//     console.log(response);
//   } catch (error) {
//     console.log(error);
//   }
// }

// consumePromiseFive();

// // async function getAllUsers() {
// //   try {
// //     const response = await fetch(
// //       "https://api.github.com/users/hiteshchoudhary"
// //     );

// //     const data = await response.json();
// //     console.log(data);
// //   } catch (error) {
// //     console.log(error);
// //   }
// // }

// // getAllUsers();

// fetch("https://api.github.com/users/hiteshchoudhary")
//   .then((response, reject) => {
//     return response.json();
//   })
//   .then((data) => {
//     console.log(data);
//   })
//   .catch((error) => {
//     console.log(error);
//   });
