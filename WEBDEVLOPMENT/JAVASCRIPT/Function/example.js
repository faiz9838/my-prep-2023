function addition(a, b, c) {
  return a + b + c;
}

const ans1 = addition(20, 10, 20);
console.log(ans1);
const ans2 = addition(20, 10, null);
console.log(ans2);

//example loginUser

function loginUserMessage(username) {
  if (!username) {
    console.log("Please enter a username");
    return;
  }
  return `${username} just logged in`;
}

console.log(loginUserMessage("Faiz Ahmad"));
