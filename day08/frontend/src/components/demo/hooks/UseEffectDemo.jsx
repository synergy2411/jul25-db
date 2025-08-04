import { useEffect, useState } from "react";

function UseEffectDemo() {
  const [toggle, setToggle] = useState(false);
  const [counter, setCounter] = useState(0);
  const [username, setUsername] = useState("");

  useEffect(() => {
    let timer = setTimeout(() => {
      if (username.trim() !== "") {
        fetch(`https://api.github.com/users/${username}/repos`)
          .then((resp) => resp.json())
          .then(console.log)
          .catch(console.error);
      }
    }, 1000);
    return () => {
      clearTimeout(timer);
    };
  }, [username]); // syne

  //   useEffect(() => {
  //     console.log("Effect works!");
  //     return () => {
  //       console.log("Clean Up");
  //     };
  //   }, [counter]);

  return (
    <>
      <h1>Use Effect Hook Example</h1>

      <button onClick={() => setToggle(!toggle)}>Toggle</button>
      <button onClick={() => setCounter(counter + 1)}>{counter}</button>

      {toggle && <p>Toggle Effect</p>}

      <input
        type="text"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />
    </>
  );
}

export default UseEffectDemo;
