import { Outlet } from "react-router";
import Header from "../Header/Header";

function RootLayout() {
  return (
    <>
      <Header />
      <hr />

      <Outlet />
    </>
  );
}

export default RootLayout;
