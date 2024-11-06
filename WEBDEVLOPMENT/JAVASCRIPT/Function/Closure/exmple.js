let x = 10;
function outer() {
  let y = 20;
  console.log("Outer function ", x);
  function inner() {
    console.log("Inner function ", y);
  }
  inner();
}

outer();
