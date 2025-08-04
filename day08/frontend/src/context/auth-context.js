import { createContext } from "react";

const AuthContext = createContext({
  isLoggedIn: false,
  setIsLoggedIn: () => {},
  //   roles : ["ROLE_ADMIN", "ROLE_MANAGER"]
});

export default AuthContext;
