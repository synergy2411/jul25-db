import { useRef, useState } from "react";
import {
  deleteCustomerByMobileNumber,
  findCustomerByMobileNumber,
} from "../../../http/crud";
import CustomerDetails from "../CustomerDetails/CustomerDetails";

function SearchCustomer() {
  const mobileNumberRef = useRef();
  const [customerRecord, setCustomerRecord] = useState(null);
  const [message, setMessage] = useState("");

  const searchCustomerByMobileNumber = () => {
    findCustomerByMobileNumber(mobileNumberRef.current.value)
      .then((response) => setCustomerRecord(response))
      .catch((error) => setMessage(error));
  };

  const onDeleteRecord = (mobileNumber) => {
    deleteCustomerByMobileNumber(mobileNumber)
      .then((responseMessage) => {
        setCustomerRecord(null);
        setMessage(responseMessage);
      })
      .catch(setMessage);
  };

  return (
    <>
      <div className="row">
        <div className="col-3 offset-2">
          <h5>Search by Mobile Number :</h5>
        </div>
        <div className="col-3">
          <input type="text" ref={mobileNumberRef} className="form-control" />
        </div>
        <div className="col-2">
          <div className="d-grid">
            <button
              className="btn btn-warning"
              onClick={searchCustomerByMobileNumber}
            >
              Search
            </button>
          </div>
        </div>
      </div>
      <hr />
      {message.trim() !== "" && <h4>{message}</h4>}

      {customerRecord !== null && (
        <CustomerDetails
          onDeleteRecord={onDeleteRecord}
          customerRecord={customerRecord}
        />
      )}
    </>
  );
}

export default SearchCustomer;
