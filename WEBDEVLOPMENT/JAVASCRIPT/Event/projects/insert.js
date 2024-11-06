const insert = document.getElementById("insert");

window.addEventListener("keydown", (e) => {
  insert.innerHTML = `<div class='color'>
        
    <h4>Key: ${e.key}</h4>
    <h4>KeyCode: ${e.keyCode}</h4>
    <h4>Code: ${e.code}</h4>
    </div>
    `;
});
