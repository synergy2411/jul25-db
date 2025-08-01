// window.addEventListener("onload", function(){})

window.onload = function () {
  const inputEl = document.getElementById("txtInput");
  const buttonEl = document.querySelector("#btnAdd");
  const todoContainer = document.getElementById("todoContainer");

  buttonEl.addEventListener("click", function () {
    if (inputEl.value.trim() === "") {
      alert("Please note down your todo.");
      inputEl.focus();
      return;
    }

    if (inputEl.value.length <= 6) {
      alert("Todo length is too short.");
      inputEl.focus();
      return;
    }

    const liElement = document.createElement("li");
    liElement.innerHTML = inputEl.value.toUpperCase();
    todoContainer.appendChild(liElement);
    inputEl.value = "";
    inputEl.focus();
  });
};
