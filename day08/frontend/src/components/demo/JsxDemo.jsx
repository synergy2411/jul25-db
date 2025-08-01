function JsxDemo() {
  let user = {
    name: "Monica Geller",
    age: 23,
    isAdmin: false,
  };

  let friends = ["Monica", "Ross", "Rachel", "Joey"];

  return (
    <>
      <h1>JSX Demo</h1>
      <p>User name : {user.name}</p>
      <p>Age : {user.age}</p>

      {/* Conditional Rendering */}
      {user.isAdmin && <p>This user is Admin</p>}

      {/* Iterating Array */}
      <ul>
        {friends.map((friend) => (
          <li>{friend.toUpperCase()}</li>
        ))}
      </ul>
    </>
  );
}

export default JsxDemo;
