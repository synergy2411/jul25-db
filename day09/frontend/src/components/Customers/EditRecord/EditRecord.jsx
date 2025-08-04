import { useEffect, useRef, useState } from "react";
import { findCustomerByMobileNumber, updateRecord } from "../../../http/crud";

import "./EditRecord.css";
import { useNavigate, useParams } from "react-router";

function EditRecord() {
  const [record, setRecord] = useState(null);
  const nameRef = useRef();
  const emailRef = useRef();
  const [message, setMessage] = useState(null);
  const params = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    findCustomerByMobileNumber(params.mobileNumber)
      .then((record) => {
        console.log(record);
        setRecord(record);
      })
      .catch((err) => setMessage(err));
  }, [params.mobileNumber]);

  const editHandler = (e) => {
    e.preventDefault();
    updateRecord({
      name: nameRef.current.value,
      email: emailRef.current.value,
      mobileNumber: params.mobileNumber,
    })
      .then(() => navigate("/protected"))
      .catch(setMessage);
  };

  return (
    <>
      <div className="backdrop">
        <div className="customer-edit-dialog">
          <div className="card">
            <div className="card-header">
              <h3 className="text-center">Edit Record</h3>
            </div>
            <div className="card-body">
              {message !== null && <p>{message}</p>}
              {record !== null && (
                <form>
                  {/* name  */}
                  <div className="form-floating mb-3">
                    <input
                      type="text"
                      className="form-control"
                      name="name"
                      id="name"
                      placeholder=""
                      defaultValue={record ? record.name : ""}
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
                      defaultValue={record ? record.email : ""}
                      ref={emailRef}
                    />
                    <label htmlFor="email">Your Name:</label>

                    <div className="row">
                      <div className="col">
                        <div className="d-grid">
                          <button
                            className="btn btn-success"
                            onClick={editHandler}
                          >
                            Save
                          </button>
                        </div>
                      </div>
                      <div className="col">
                        <div className="d-grid">
                          <button className="btn btn-secondary">Cancel</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </form>
              )}
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default EditRecord;
