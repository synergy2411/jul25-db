import { useRef } from "react";
import "./CreateForm.css";
import { createNewCustomer } from "../../../http/crud";
import { useNavigate } from "react-router";
function CreateForm() {
  const nameRef = useRef();
  const emailRef = useRef();
  const mobileNumberRef = useRef();
  const navigate = useNavigate();

  const submitHandler = (e) => {
    e.preventDefault();
    createNewCustomer({
      name: nameRef.current.value,
      email: emailRef.current.value,
      mobileNumber: mobileNumberRef.current.value,
    })
      .then((resp) => {
        if (resp.status === "CREATED") {
          navigate("/protected");
        }
      })
      .catch(console.error);
  };

  return (
    <div className="backdrop">
      <div className="customer-add-new-dialog">
        <div className="card">
          <div className="card-header">
            <h1 className="text-center">Add New Customer</h1>
          </div>
          <div className="card-body">
            <form onSubmit={submitHandler}>
              {/* name */}
              <div className="form-floating mb-3">
                <input
                  type="text"
                  className="form-control"
                  name="name"
                  id="name"
                  placeholder=""
                  ref={nameRef}
                />
                <label htmlFor="name">Your Name:</label>
              </div>

              {/* email */}
              <div className="form-floating mb-3">
                <input
                  type="email"
                  className="form-control"
                  name="email"
                  id="email"
                  placeholder=""
                  ref={emailRef}
                />
                <label htmlFor="email">Your Email:</label>
              </div>

              {/* mobileNumber */}
              <div className="form-floating mb-3">
                <input
                  type="text"
                  className="form-control"
                  name="mobileNumber"
                  id="mobileNumber"
                  placeholder=""
                  ref={mobileNumberRef}
                />
                <label htmlFor="mobileNumber">Mobile Number:</label>
              </div>
              <div className="row">
                <div className="col">
                  <div className="d-grid">
                    <button className="btn btn-primary">Submit</button>
                  </div>
                </div>
                <div className="col">
                  <div className="d-grid">
                    <button
                      onClick={() => navigate("/protected")}
                      className="btn btn-secondary"
                    >
                      Close
                    </button>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
}

export default CreateForm;
