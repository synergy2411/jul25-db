import { useParams } from "react-router";

function CourseDetails() {
  const { courseId } = useParams();

  return (
    <>
      <h1>Course details loading for ID - {courseId}</h1>
    </>
  );
}

export default CourseDetails;
