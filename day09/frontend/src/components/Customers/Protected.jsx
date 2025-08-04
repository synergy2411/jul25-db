import { useContext, useEffect, useState } from "react";
import AuthContext from "../../context/auth-context";
import { Outlet, useNavigate } from "react-router";
import SearchCustomer from "./SearchCustomer/SearchCustomer";

function ProtectedRoute() {
  const [isAdmin, setIsAdmin] = useState(false);
  const [isManager, setIsManager] = useState(false);
  const context = useContext(AuthContext);
  const navigate = useNavigate();

  useEffect(() => {
    if (context.username !== "") {
      if (context.roles.includes("ROLE_ADMIN")) {
        setIsAdmin(true);
      }
      if (context.roles.includes("ROLE_MANAGER")) {
        setIsManager(true);
      }
    } else {
      navigate("/login");
    }
  }, [context, navigate]);

  return (
    <>
      <div className="text-center">
        <h1>Hello {context.username.toUpperCase()} ! </h1>
        {isAdmin && (
          <button
            className="btn btn-primary m-3"
            onClick={() => navigate("add-new")}
          >
            Add New Customer
          </button>
        )}
        {isManager && (
          <button
            className="btn btn-primary m-3"
            onClick={() => navigate("search")}
          >
            Search Customer
          </button>
        )}
        <Outlet />
      </div>
    </>
  );
}

export default ProtectedRoute;
