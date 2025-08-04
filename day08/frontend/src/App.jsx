import ClassComponent from "./components/demo/ClassComponent";
import Controlled from "./components/demo/Controlled";
import JsxDemo from "./components/demo/JsxDemo";
import StateDemo from "./components/demo/StateDemo";
import Uncontrolled from "./components/demo/Uncontrolled";
import Button from "./components/ui/Button";

function App() {
  const operations = ["Add", "Edit", "Delete", "Warn"];

  const childFunction = (value) => {
    console.log("Function called for " + value);
  };

  return (
    <div>
      <h1>App Works!</h1>

      <Uncontrolled />

      {/* <Controlled /> */}

      {/* <ClassComponent /> */}

      {/* <StateDemo /> */}

      {/* <JsxDemo />
      {operations.map((operation) => (
        <Button text={operation} childFunction={childFunction} />
      ))} */}
      {/* <Button text="Add" childFunction={childFunction} />
      <Button text="Edit" childFunction={childFunction} />
      <Button text="Delete" childFunction={childFunction} /> */}
    </div>
  );
}

export default App;
