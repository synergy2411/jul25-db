import { useContext, useRef } from "react";
import { userLogin } from "../../http/auth";
import AuthContext from "../../context/auth-context";
import { useNavigate } from "react-router";

function LoginForm() {
  const usernameRef = useRef();
  const passwordRef = useRef();
  const context = useContext(AuthContext);
  const navigate = useNavigate();

  const submitHandler = (e) => {
    e.preventDefault();
    userLogin({
      username: usernameRef.current.value,
      password: passwordRef.current.value,
    })
      .then((user) => {
        console.log(user);
        context.setUsername(user.name);
        context.setRoles(user.authorities.map((role) => role.authority));
        localStorage.setItem("username", user.name);
        localStorage.setItem("password", passwordRef.current.value);
        navigate("/protected");
      })
      .catch(console.error);
  };

  return (
    <>
      <div className="row">
        <div className="col-6 offset-3">
          <form onSubmit={submitHandler}>
            <div className="form-floating mb-3">
              <input
                type="text"
                className="form-control"
                name="username"
                id="username"
                placeholder=""
                ref={usernameRef}
              />
              <label htmlFor="username">Username</label>
            </div>

            <div className="form-floating mb-3">
              <input
                type="password"
                className="form-control"
                name="password"
                id="password"
                placeholder=""
                ref={passwordRef}
              />
              <label htmlFor="password">Password</label>
            </div>
            <div className="row">
              <div className="col">
                <div className="d-grid">
                  <button className="btn btn-primary" type="submit">
                    Submit
                  </button>
                </div>
              </div>
              <div className="col">
                <div className="d-grid">
                  <button disabled className="btn btn-secondary" type="submit">
                    Sign Up
                  </button>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
    </>
  );
}

export default LoginForm;
