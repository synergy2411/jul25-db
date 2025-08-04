import { createRoot } from "react-dom/client";
import App from "./App.jsx";
import { createBrowserRouter, Outlet, RouterProvider } from "react-router";
import JsxDemo from "./components/demo/JsxDemo.jsx";
import StateDemo from "./components/demo/StateDemo.jsx";
import HomePage from "./components/Pages/Home/HomePage.jsx";
import CoursesPage from "./components/Pages/Courses/Courses.jsx";
import RootLayout from "./components/RootLayout/RootLayout.jsx";
import CourseDetails from "./components/Pages/Courses/CourseDetails.jsx";
import ErrorPage from "./components/Error/ErrorPage.jsx";

const router = createBrowserRouter([
  {
    path: "/", // http://localhost:5173
    element: <RootLayout />,
    errorElement: <ErrorPage />,
    children: [
      { element: <HomePage />, index: true },
      {
        path: "courses",
        element: <CoursesPage />,
        children: [{ path: ":courseId", element: <CourseDetails /> }],
      },
    ],
  },
]);

createRoot(document.getElementById("root")).render(
  <RouterProvider router={router}></RouterProvider>
);
