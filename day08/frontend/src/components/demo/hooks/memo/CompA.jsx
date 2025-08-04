import { useCallback, useMemo, useState } from "react";
import CompB from "./CompB";

function CompA() {
  const [toggle, setToggle] = useState(false);

  console.log("Comp A");

  const demoFn = useCallback(() => console.log("Demo Function"), []);

  const marks = useMemo(() => [99, 97, 93, 89], []);

  return (
    <>
      <h1>Component A</h1>

      <button onClick={() => setToggle(!toggle)}>Toggle</button>
      {toggle && <p>Toggle Paragraph</p>}

      <hr />

      <CompB toggle={true} demoFn={demoFn} marks={marks} />
    </>
  );
}

export default CompA;
