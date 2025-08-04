import { useNavigate } from "react-router";

function ErrorPage() {
  const navigate = useNavigate();

  return (
    <>
      <h1>Oops! Something went wrong.</h1>
      <button onClick={() => navigate("/")}>Go Back</button>
    </>
  );
}

export default ErrorPage;
