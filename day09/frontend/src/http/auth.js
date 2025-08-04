const userLogin = (userCreds) => {
  return new Promise((resolve, reject) => {
    fetch("http://localhost:8080/api/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(userCreds),
    })
      .then((response) => response.json())
      .then((response) => resolve(response))
      .catch(reject);
  });
};

export { userLogin };
