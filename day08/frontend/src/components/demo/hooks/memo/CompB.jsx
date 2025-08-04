import { memo } from "react";

function CompB(props) {
  console.log("Comp B");
  console.log(props);
  return (
    <>
      <h2>Component B</h2>
    </>
  );
}

export default memo(CompB);

// prevProps === currProps > don't re-render the child component
// prevProps !== currProps > re-render the child component
