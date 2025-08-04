import { useState } from "react";
import ClassComponent from "./components/demo/ClassComponent";
import Controlled from "./components/demo/Controlled";
import UseEffectDemo from "./components/demo/hooks/UseEffectDemo";
import JsxDemo from "./components/demo/JsxDemo";
import StateDemo from "./components/demo/StateDemo";
import Uncontrolled from "./components/demo/Uncontrolled";
import Button from "./components/ui/Button";
import AuthContext from "./context/auth-context";
import Parent from "./components/demo/hooks/Parent";
import Counter from "./components/demo/hooks/Counter";
import CompA from "./components/demo/hooks/memo/CompA";

function App() {
  // const operations = ["Add", "Edit", "Delete", "Warn"];

  // const childFunction = (value) => {
  //   console.log("Function called for " + value);
  // };

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div>
      <h1>App Works!</h1>

      <CompA />
      {/* <Counter /> */}

      {/* <AuthContext.Provider value={{ isLoggedIn, setIsLoggedIn }}>
        <Parent />
      </AuthContext.Provider> */}

      {/* <UseEffectDemo /> */}

      {/* <Uncontrolled /> */}

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
