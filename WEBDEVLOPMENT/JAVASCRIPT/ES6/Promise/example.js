const promise = new Promise((res, req) => {
  setTimeout(() => {
    res("promise is working");
  }, 2000);
});

promise.then((value) => {
  console.log(value);
});
