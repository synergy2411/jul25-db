import { useContext } from "react";
import AuthContext from "../../../context/auth-context";

function Child() {
  const context = useContext(AuthContext);

  // const [isAdmin, setIsAdmin] = useState(false)
  // const [isManager, setIsManager] = useState(false)

  // useEffect(() => {
  //     if (context.roles.includes("ADMIN")) {
  //         setIsAdmin(true)
  //     }
  //     if (context.roles.includes("MANAGERS")) {
  //         setIsManager(true)
  //     }
  // }, [context.roles])

  return (
    <>
      <h2>The Child Component</h2>

      {/* { isAdmin && <AdminDashboard />}
          { isManager && <ManagerDashboard />} */}

      {!context.isLoggedIn && (
        <button onClick={() => context.setIsLoggedIn(true)}>Login</button>
      )}
      {context.isLoggedIn && (
        <button onClick={() => context.setIsLoggedIn(false)}>Logout</button>
      )}

      {context.isLoggedIn && <p>The user is logged-in</p>}
      {!context.isLoggedIn && <p>The user is NOT logged-in</p>}
    </>
  );
}

export default Child;
