import { useState } from "react";

function Controlled() {
  const [inputEl, setInputEl] = useState("");

  const inputChangeHandler = (event) => {
    console.log("EVENT : ", event); // Supplied by Browser to every event

    setInputEl(event.target.value);
  };

  return (
    <>
      <h1>Controlled Component</h1>
      <input type="text" value={inputEl} onChange={inputChangeHandler} />

      <p>{inputEl}</p>
    </>
  );
}

export default Controlled;
