import { useContext, useEffect } from "react";
import { userLogout } from "../../http/crud";
import AuthContext from "../../context/auth-context";
import { useNavigate } from "react-router";

function LogoutPage() {
  const navigate = useNavigate();
  const context = useContext(AuthContext);

  useEffect(() => {
    userLogout()
      .then(() => {
        context.setRoles([]);
        context.setUsername("");
        navigate("/login");
      })
      .catch(console.error);
  }, [context, navigate]);
  return (
    <>
      <h1>Logging out....</h1>
    </>
  );
}

export default LogoutPage;
