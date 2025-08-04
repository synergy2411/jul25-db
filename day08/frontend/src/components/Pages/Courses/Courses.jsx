import { Link, Outlet } from "react-router";
function CoursesPage() {
  let courses = [
    { id: "c001", title: "Refresh React", duration: 120 },
    { id: "c002", title: "Spring in Java", duration: 220 },
    { id: "c003", title: "SpringBoot 101", duration: 80 },
  ];

  return (
    <>
      <h1>Courses Page loaded</h1>
      <ul>
        {courses.map((course) => (
          <li key={course.id}>
            {course.title.toUpperCase()} - {course.duration} Hrs |{" "}
            <Link to={course.id}>More Info</Link>
          </li>
        ))}
      </ul>

      <hr />
      <Outlet />
    </>
  );
}

export default CoursesPage;
