const username = localStorage.getItem("username");
const password = localStorage.getItem("password");
const credentials = btoa(`${username}:${password}`);

const findCustomerByMobileNumber = (mobileNumber) => {
  return new Promise((resolve, reject) => {
    fetch("http://localhost:8080/api/fetch?mobileNumber=" + mobileNumber, {
      headers: {
        Authorization: `Basic ${credentials}`,
      },
    })
      .then((resp) => resp.json())
      .then((response) => {
        if (response.status === "INTERNAL_SERVER_ERROR") {
          reject(response.errorMessage);
        } else {
          resolve(response);
        }
      })
      .catch(console.error);
  });
};

const deleteCustomerByMobileNumber = (mobileNumber) => {
  return new Promise((resolve, reject) => {
    fetch("http://localhost:8080/api/delete?mobileNumber=" + mobileNumber, {
      method: "DELETE",
      headers: {
        Authorization: `Basic ${credentials}`,
      },
    })
      .then((resp) => resp.json())
      .then((response) => {
        if (response.status === "OK") {
          resolve(response.message);
        }
      })
      .catch(reject);
  });
};

const updateRecord = (record) => {
  const username = localStorage.getItem("username");
  const password = localStorage.getItem("password");
  const credentials = btoa(`${username}:${password}`);
  return new Promise((resolve, reject) => {
    fetch("http://localhost:8080/api/update", {
      method: "PATCH",
      headers: {
        Authorization: `Basic ${credentials}`,
        "Content-Type": "application/json",
      },
      body: JSON.stringify(record),
    })
      .then((resp) => resp.json())
      .then((response) => {
        if (response.status === "ACCEPTED") {
          resolve(response);
        }
      })
      .catch(reject);
  });
};

const createNewCustomer = (createCreds) => {
  const username = localStorage.getItem("username");
  const password = localStorage.getItem("password");
  const credentials = btoa(`${username}:${password}`);
  return new Promise((resolve, reject) => {
    fetch("http://localhost:8080/api/create", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Authorization: `Basic ${credentials}`,
      },

      body: JSON.stringify(createCreds),
    })
      .then((resp) => resp.json())
      .then(resolve)
      .catch(reject);
  });
};

const userLogout = () => {
  return new Promise((resolve, reject) => {
    fetch("http://localhost:8080/api/greet")
      .then((resp) => resp.json())
      .then(resolve)
      .catch(reject);
  });
};

export {
  findCustomerByMobileNumber,
  deleteCustomerByMobileNumber,
  updateRecord,
  userLogout,
  createNewCustomer,
};
