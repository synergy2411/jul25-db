import { useRef } from "react";

function Uncontrolled() {
  const inputRef = useRef();

  const fetchHandler = () => {
    console.log("VALUE : ", inputRef.current.value);
  };

  return (
    <>
      <h1>Uncontrolled Component</h1>

      <input type="text" ref={inputRef} />

      <button onClick={fetchHandler}>Fetch</button>
    </>
  );
}

export default Uncontrolled;
