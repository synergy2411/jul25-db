import { useContext } from "react";
import { NavLink } from "react-router";
import AuthContext from "../../context/auth-context";

function MainNavigation() {
  const context = useContext(AuthContext);
  return (
    <>
      <header>
        <nav>
          <ul className="nav nav-tabs">
            {context.username.trim() === "" && (
              <li className="nav-item">
                <NavLink className="nav-link" to="login">
                  Login
                </NavLink>
              </li>
            )}
            {context.username.trim() !== "" && (
              <li className="nav-item">
                <NavLink className="nav-link" to="logout">
                  Logout
                </NavLink>
              </li>
            )}
            <li className="nav-item">
              <NavLink className="nav-link" to="/greet">
                Greet
              </NavLink>
            </li>
          </ul>
        </nav>
      </header>
    </>
  );
}

export default MainNavigation;
