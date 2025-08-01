import "./Button.css";

function Button({ text, childFunction }) {
  //   text = "Changed";
  return (
    <>
      <button className="styled-button" onClick={() => childFunction(text)}>
        {text}
      </button>
    </>
  );
}

export default Button;
