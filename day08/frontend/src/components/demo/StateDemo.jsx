import { useState } from "react";

function StateDemo() {
  const [counter, setCounter] = useState(101);
  const [toggle, setToggle] = useState(false);
  const [friends, setFriends] = useState(["Joey", "Ross"]);

  //   let counter = 0;

  const addFriends = () => {
    setFriends((prev) => [...prev, "Monica"]);
    // friends.push("Monica");
    console.log(friends);
  };

  return (
    <>
      <h1>State Demo</h1>
      <button onClick={() => setCounter(counter + 1)}>{counter}</button>

      <button onClick={() => setToggle(!toggle)}>Toggle</button>

      <button onClick={addFriends}>Add Friends</button>

      {toggle && <p>This paragraph will appear dynamically</p>}

      <ul>
        {friends.map((friend) => (
          <li>{friend}</li>
        ))}
      </ul>
    </>
  );
}

export default StateDemo;
