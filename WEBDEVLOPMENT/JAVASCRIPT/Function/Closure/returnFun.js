function outer() {
  console.log("Outer function invoked");
  return function inner() {
    console.log("Inner function invoked");
  };
}

const returnFun = outer();
returnFun.call();
returnFun.apply(); // only return the inner function argumentS
