function runCode() {
  const language = document.getElementById("language").value;
  const code = document.getElementById("code").value;

  fetch("/execute", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ language, code }),
  })
    .then((response) => response.json())
    .then((data) => {
      document.getElementById("output").textContent = data.output;
    })
    .catch((error) => {
      console.error("Error:", error);
    });
}
