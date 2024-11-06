function data(value) {
  this.value = value;

  setTimeout(function () {
    console.log("Regular function: ", this.value);
  }, 100);
  setTimeout(() => {
    console.log("Arrow function: ", this.value);
  }, 300);
}

const datas = new data(1000);

console.log(datas);
