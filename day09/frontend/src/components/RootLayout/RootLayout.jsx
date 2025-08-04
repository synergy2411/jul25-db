import { Outlet } from "react-router";
import MainNavigation from "../UI/MainNavigation";

function RootLayout() {
  return (
    <div className="text-center">
      <MainNavigation />
      <h1 className="text-center m-4">Welcome to EazyBank</h1>
      <Outlet />
    </div>
  );
}

export default RootLayout;
