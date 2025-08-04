import { createContext } from "react";

const AuthContext = createContext({
  roles: [],
  setRoles: () => {},
  username: "",
  setUsername: () => {},
});

export default AuthContext;
