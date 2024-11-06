const buttons = document.querySelectorAll(".button");
const body = document.querySelector("body");

buttons.forEach(function (element) {
  console.log(element);

  element.addEventListener("click", function (e) {
    if (e.target.id === "grey") {
      body.style.backgroundColor = e.target.id;
    } else if (e.target.id === "red") {
      body.style.backgroundColor = e.target.id;
    } else if (e.target.id === "blue") {
      body.style.backgroundColor = e.target.id;
    }
  });
});
