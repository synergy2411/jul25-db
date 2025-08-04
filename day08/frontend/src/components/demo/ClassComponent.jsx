import { Component } from "react";

class ClassComponent extends Component {
  state = {
    counter: 0,
    posts: [],
  };

  constructor() {
    super();
    console.log("Constructor");
  }

  componentDidMount() {
    console.log("componentDidMount");
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((allPosts) => this.setState({ posts: allPosts }))
      .catch(console.error);
  }

  componentDidUpdate() {
    console.log("componentDidUpdate");
  }

  componentWillUnmount() {
    console.log("componentWillUnmount");
  }

  shouldComponentUpdate() {
    const rnd = Math.round(Math.random() * 10);
    console.log(rnd);
    // return rnd > 3;
    return true;
  }

  render() {
    console.log("Render");

    return (
      <div>
        <p>{3 + 5}</p>
        <button
          onClick={() => this.setState({ counter: this.state.counter + 1 })}
        >
          Increase
        </button>
        <p>Counter : {this.state.counter}</p>

        <ul>
          {this.state.posts.map((post) => (
            <li key={post.id}>{post.title}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default ClassComponent;
