function counter() {
  let count = 100;
  return function decreament() {
    count -= 1;
    console.log(count);
  };
}

const returnFun = counter();
returnFun();
returnFun();
