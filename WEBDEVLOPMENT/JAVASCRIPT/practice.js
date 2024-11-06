// OBJECT

const { log } = require("console");

// const user = {
//     name:"Faiz Ahmad",
//     degree:"MCA",
// }
// console.log(user)

// Using create.Object()
// const person = {
//     fullname:"Faiz Ahmad",
//     roll:"41"
// }
// const person1 = Object.create(person)
// console.log(person)

// Using new Keyword

// const obj = new Object()
// obj.name = "Faiz Ahmad"
// obj.sayname = function(){
//     return this.name
// }
// console.log(obj)



// function User(isLoggedIn){
//     this.isLoggedIn = isLoggedIn
// }
// const user1 = new User(true)

// const Login = user1.isLoggedIn ? "Login successfull": "Please login"
// console.log(Login);


// ARRAY Method

// let arr = [1,2,3,4,5]

//Array.splice()
// console.log(arr.splice(0,3)) //Last index dosent considered

//Array.slice()
// console.log(arr.slice(0,2));

//Array.ForEach() 
// arr.forEach((ele, index, array) => {
//     console.log(ele);
// })

//Array.find()
// arr.find((item, index, array) =>{
//     console.log(item)
// })

//Array.filter()
// arr.filter((item, index, array) => {
//     if(item > 2){
//         console.log(item)
//     }
// })

//Array.map() 
// arr.map((item) => console.log(item))

// Destructing Array
// const [a,b,c] = arr
// console.log(a,b,c);

// Class 
// class student {
//     name = "Faiz Ahmad"
// }

// const std = new student() //Default constructor
// console.log(std.name);

// Constructor
// class person {
//     constructor(name, salary){
//         this.name = name,
//         this.salary = salary
//     }
// }
// const person1 = new person("Faiz Ahmad", 30000)
// console.log(person1.name)

// "use strict"
// function test() {
//     num = 10
//     console.log(num)
// }
// test()

// Fetch Api
// fetch("path")
// .then(response => response.json())
// .then(data => console.log(data))
// .catc((error) => console.log(error))

// const arr ='{"name":"faiz Ahmad"}';
// const str = JSON.parse(arr);
// const jsonStr = JSON.stringify(str)
// console.log(jsonStr)

// SetTimeOut

// setTimeout(() => {
//    let interval = setInterval(() =>{
//         for (let index = 0; index < 5; index++) {
//             console.log("hello")
//         }
//    }, 1000)
//    clearInterval(interval)
// }, 2000)


// shallow copy and deep copy 

// const original = { a: 1, b: { c: 2 } };

// const shallowCopy = {...original}
// shallowCopy.b.c = 10
// console.log(original.b.c);

// const deepCopy = JSON.parse(JSON.stringify(original))
// console.log(deepCopy);


// Higher order function

// function operation(add){
//     return function(a,b){
//         return add(a, b);
//     }
// }

// const add = operation((a,b) => a + b)
// console.log(add(10,20));

// function sayHello(greet){
//     greet()
// }

// function greet(){
//     console.log("Hello world")
// }

// sayHello(greet)

