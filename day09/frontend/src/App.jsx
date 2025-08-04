import { useState } from "react";
import { RouterProvider, createBrowserRouter } from "react-router";
import LoginForm from "./components/Auth/LoginForm";
import SearchCustomer from "./components/Customers/SearchCustomer/SearchCustomer";
import RootLayout from "./components/RootLayout/RootLayout";
import AuthContext from "./context/auth-context";
import Greet from "./components/Greet/Greet";
import Customers from "./components/Customers/ManagersDashboard";
import ProtectedRoute from "./components/Customers/Protected";
import CreateForm from "./components/Customers/CreateForm/CreateForm";
import EditRecord from "./components/Customers/EditRecord/EditRecord";
import LogoutPage from "./components/Auth/LogoutPage";

const router = createBrowserRouter([
  {
    path: "/",
    Component: RootLayout,
    errorElement: <h1>OOPS! Somethign went wrong!</h1>,
    children: [
      { path: "login", Component: LoginForm },
      { path: "logout", Component: LogoutPage },
      { path: "greet", Component: Greet },
      {
        path: "protected",
        Component: ProtectedRoute,
        children: [
          {
            path: "search",
            Component: SearchCustomer,
          },
          {
            path: "add-new",
            Component: CreateForm,
          },
          {
            path: "edit/:mobileNumber",
            Component: EditRecord,
          },
        ],
      },
    ],
  },
]);

function App() {
  const [roles, setRoles] = useState([]);
  const [username, setUsername] = useState("");
  return (
    <AuthContext.Provider value={{ roles, setRoles, username, setUsername }}>
      <RouterProvider router={router}></RouterProvider>
    </AuthContext.Provider>
  );
}

export default App;
