const randNumber = parseInt(Math.random().toFixed(2) * 100 + 1);
const submit = document.querySelector("#subt");
const userInput = document.querySelector("#guessField");
const guessSlot = document.querySelector(".guesses");
const remaining = document.querySelector(".lastResult");
const lowOrHigh = document.querySelector(".lowOrHi");
const startOver = document.querySelector(".resultParas");

const p = document.createElement("p");
let prevGames = [];
let numGuess = 1;

let playGame = true;

if (playGame) {
  submit.addEventListener("click", function (e) {
    e.preventDefault();
    const guess = parseInt(userInput.value);
    console.log(guess);
    validateGuess(guess);
  });
}
function validateGuess(guess) {
  if (guess < 1 || isNaN(guess)) {
    alert("Please enter a valid number");
  } else if (guess > 100) {
    alert("Please enter a number less than 100");
  } else {
    prevGames.push(guess);
    if (numGames == 11) {
      displayGuess(guess);
      displayMessage(`Game Over. Random number was ${randNumber}`);
      endGame();
    } else {
      displayGuess(guess);
      checkGuess(guess);
    }
  }
}

function checkGuess(guess) {
  if (guess === randNumber) {
    displayMessage(`You guessed it right `);
    endGame();
  } else if (guess < randomNumber) {
    displayMessage(`Number is too low`);
  } else if (guess > randNumber) {
    displayMessage(`Number is too high`);
  }
}

function displayGuess(guess) {
  userInput.value = "";
  guessSlot.innerHTML += `${guess}`;
  numGuess++;
  remaining.innerHTML = `${11 - numGuess} `;
}

function displayMessage(guess) {
  lowOrHigh.innerHTML = `<h2>${message}</h2>`;
}

function newGame() {}

function endGame() {}
