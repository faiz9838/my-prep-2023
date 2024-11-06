const form = document.querySelector("form");
form.addEventListener("submit", function (e) {
  e.preventDefault();
  const height = parseInt(document.querySelector("#height").value);
  const weight = parseInt(document.querySelector("#weight").value);
  const stats = document.querySelector("#stats");
  const result = document.querySelector("#result");

  if (height === "" || height < 0 || isNaN(height)) {
    result.innerHTML = `Please give valid height: ${height}`;
  } else if (weight === "" || weight < 0 || isNaN(weight)) {
    result.innerHTML = `Please give valid weight: ${weight}`;
  } else {
    const bmi = (weight / ((height * height) / 10000)).toFixed(2);
    result.innerHTML = `<span>your bmi: ${bmi}</span>`;
    if (bmi <= 18) {
      stats.innerHTML = `you are underwieght: ${bmi}`;
    } else if (bmi >= 18 && bmi <= 24) {
      stats.innerHTML = `you are normal: ${bmi}`;
    } else {
      stats.innerHTML = `you are overweight: ${bmi}`;
    }
  }
});
