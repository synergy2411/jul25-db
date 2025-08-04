import { Link, useNavigate } from "react-router";
import classes from "./CustomerDetails.module.css";
import { useContext } from "react";
import AuthContext from "../../../context/auth-context";

function CustomerDetails({
  customerRecord: { name, email, mobileNumber, accountsDto },
  onDeleteRecord,
}) {
  const navigate = useNavigate();
  const context = useContext(AuthContext);

  const deleteHandler = (e) => {
    e.preventDefault();
    const isConfirmed = confirm(
      "Are you sure to close the account for Mr.  " + name + "?"
    );
    if (isConfirmed) {
      onDeleteRecord(mobileNumber);
    }
    return;
  };

  return (
    <div className={classes["backdrop"]}>
      <div className={classes["customer-details-dialog"]}>
        <div className="card">
          <div className="card-header">
            <h1 className="text-center">{name.toUpperCase()}</h1>
          </div>
          <div className="card-body">
            <p>Email : {email}</p>
            <p>Contact Number : {mobileNumber}</p>
            <p>Account Number : {accountsDto.accountNumber}</p>
            <p>Account Type : {accountsDto.accountType}</p>
            <p>Branch Address : {accountsDto.branchAddress}</p>

            {context.roles.includes("ROLE_ADMIN") && (
              <div className="row">
                <div className="col">
                  <div className="d-grid">
                    <button
                      onClick={() =>
                        navigate(`/protected/edit/${mobileNumber}`)
                      }
                      className="btn btn-success"
                    >
                      Edit
                    </button>
                  </div>
                </div>
                <div className="col">
                  <div className="d-grid">
                    <button
                      className="btn btn-outline-danger"
                      onClick={deleteHandler}
                    >
                      Delete
                    </button>
                  </div>
                </div>
              </div>
            )}
            <br />

            <Link to="/protected" className="px-4">
              Back
            </Link>
          </div>
        </div>
      </div>
    </div>
  );
}

export default CustomerDetails;
