import { useReducer } from "react";

function reducer(state, action) {
  if (action.type === "INCREMENT") {
    return {
      ...state,
      counter: state.counter + 1,
    };
  }
  if (action.type === "DECREMENT") {
    return {
      ...state,
      counter: state.counter - 1,
    };
  }
  if (action.type === "ADD_COUNTER") {
    return {
      ...state,
      counter: state.counter + action.payload,
    };
  }
  if (action.type === "STORE_RESULT") {
    return {
      ...state,
      result: [state.counter, ...state.result],
    };
  }

  return state;
}

function Counter() {
  const [state, dispatch] = useReducer(reducer, { counter: 0, result: [] });

  return (
    <>
      <h1>The Use Reducer Hook Demo</h1>

      <h2>Counter : {state.counter}</h2>

      <button onClick={() => dispatch({ type: "INCREMENT" })}>Increase</button>
      <button onClick={() => dispatch({ type: "DECREMENT" })}>Decrease</button>
      <button onClick={() => dispatch({ type: "ADD_COUNTER", payload: 10 })}>
        Add (10)
      </button>
      <hr />

      <button onClick={() => dispatch({ type: "STORE_RESULT" })}>
        Store Result
      </button>
      <ul>
        {state.result.map((r) => (
          <li>{r}</li>
        ))}
      </ul>
    </>
  );
}

export default Counter;
