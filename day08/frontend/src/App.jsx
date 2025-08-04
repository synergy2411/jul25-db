import CompA from "./components/demo/hooks/memo/CompA";

function App() {
  // const operations = ["Add", "Edit", "Delete", "Warn"];

  // const childFunction = (value) => {
  //   console.log("Function called for " + value);
  // };

  // const [isLoggedIn, setIsLoggedIn] = useState(false);

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
