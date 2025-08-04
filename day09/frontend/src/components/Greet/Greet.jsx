import { useContext } from "react";
import AuthContext from "../../context/auth-context";

function Greet() {
  const context = useContext(AuthContext);
  return (
    <>
      <h1>Hello {context.username.toUpperCase()}!</h1>
    </>
  );
}

export default Greet;
