const arr = [1, 2, 3, 4, 5, 6];

// Length method => Giving length of array
console.log(arr.length);

// isArray() Method => Checking array is an array or not
console.log(Array.isArray(arr)); // give boolean value

// Concat() method => concat method concat two array
console.log(arr.concat(arr));

//indexOf() method => Find the index of value
console.log("Index value is: ", arr.indexOf(4));

// Slice() Method
//Covert array into small piece
console.log(arr.slice(0, 3));
console.log(arr);

//Splice() => Convert that also into small peices but arr can be change after doing this operation

console.log("Splice arr: ", arr.splice(0, 4));
console.log("Arr changed after doing splice method use: ", arr);

// Join() method => After use join arr will be convert into string

console.log("Join arr is: ", arr.join());

// toString() => convert array into a string
console.log("This is arr string: ", arr.toString());

// fill() => fill method use to fill all the array index value into specific value

console.log("All index filled: ", arr.fill(1));

// of() method => convert elements into array
let a = 100;
let b = 200;
console.log(Array.of(a, b));

const ans = arr.reduce();
