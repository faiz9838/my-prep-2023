let myApp = new Map();
myApp.set(0, "Faiz Ahmad");
myApp.set(1, "Shaikh Tahoora");
for (let index = 0; index < myApp.size; index++) {
  const element = myApp.get(index);
  console.log(element);
}

//Map entries() method

let app = new Map();

app.set(0, "Faiz Ahmad");
app.set(1, "Shaikh Tahoora");
app.set(2, "Khan Talha");

let iterator = app.entries();

for (let index = 0; index < app.size; index++) {
  console.log(app.get(index));
}

//MAP value
