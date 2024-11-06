(function chai() {
  //Named IIFE
  console.log("DB Connected");
})();

((name) => {
  //DEFAULT IIFE
  console.log("DB CCONNECTED" + name);
})(" MONGODB SERVER");
