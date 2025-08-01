// BLOCK SCOPING - let, const

// function doSomething(marks) {
//   // LOAD = undefined, FLASH = undefined -> stored in memory before you execute the function
//   if (marks.length > 2) {
//     const LOAD = "LOADING...";
//     console.log(FLASH);
//   } else {
//     const FLASH = "FLASHING...";
//     console.log(LOAD);
//   }
// }

// doSomething([98, 97, 95, 92]);

// DYNAMIC TYPING
// var anyVar = "Hello World!!";
// console.log(typeof anyVar);

// anyVar = 101;
// console.log(typeof anyVar);

// anyVar = true;
// console.log(typeof anyVar);

// anyVar = Symbol(101);
// console.log(typeof anyVar);

// anyVar = new Date("Dec 31, 2024");
// console.log(typeof anyVar);

// anyVar = ["Monica", "Ross", "Rachel"];
// console.log(typeof anyVar);

// anyVar = { firstName: "John", lastName: "Doe" };
// console.log(typeof anyVar);

// anyVar = function () {
//   console.log("do Something...");
// };
// console.log(typeof anyVar);

// OPERATORS
// let x = "20";
// let y = 10;
// let z = 20;
// // let result = x + y;
// let result = x - y;

// console.log("RESULT: ", result); // 2010

// console.log("x == z > ", x == z); // only checks the value
// console.log("x === z >", x === z); // strict checking - checks both value and type

// STRING LITERALS -> " " | ' ' | ` ` (back tick)
// - embed the variable into string
// - multiline strings

// let username = "Monica Geller";
// let age = 23;

// let intro = `
// Hi, This is ${username}.
// I'm ${age} years old.
// `;
// console.log(intro);

// LOOPS - For Loop
// function doSomething(marks) {
//   let sum = 0;
//   // Declarative
//   for (let i = 0; i < marks.length; i++) {
//     sum += marks[i];
//   }

//   console.log("Total Marks : ", sum);
//   //   Imoerative
//   for (let mark of marks) {
//     console.log("Mark - ", mark);
//   }

//   // Functional
//   marks.forEach((element) => {
//     console.log(element);
//   });
// }

// doSomething([98, 91, 89, 93]);

// OBJECTS
// let box = {
//   width: 8,
//   height: 6,
//   name: "Box 1",
//   isOpen: false,
//   books: ["book1", "book2", "book3"],
//   addBook: function (newBook) {
//     this.books.push(newBook);
//   },
// };

// box.volumne = box.width * box.height;

// console.log(box);

// box.addBook("book4");

// console.log("Books length :", box.books.length); // 4

// ARRAYS
// let marks = new Array(2);
// marks.push(99);
// marks.push(97);
// marks.push(89);
// marks.push(79);
// console.log(marks);

// let someArr = ["Apple", 101, true, { name: "John Doe" }];
// console.log(someArr[0]);
// console.log(someArr[1]); // 101
// console.log(someArr[2]); // true
// console.log(someArr);

// let fruits = ["Apple", "Banana", "Grapes", "Oranges", "Kiwi"];
// const position = fruits.findIndex((fruit) => fruit === "Kiwi");
// console.log(position); //
// const fruit = fruits.find((fruit) => fruit.includes("es"));
// console.log(fruit);
// console.log(fruits.join(" / "));

// -----------

// FUNCTIONS

// const result = add(5, 6);
// console.log("Result : ", result);

// Function declaration
// function add(n1, n2) {
//   return n1 + n2;
// }

// Function Express
// let addition = function (n1, n2) {
//   return n1 + n2;
// };
// console.log(addition(4, 5));

// Arrow Function
// let sum = (n1, n2) => n1 + n2;
// console.log("Sum : ", sum(10, 12));

// FUNCTIONS AS FIRST CLASS CITIZENS

// FUNCTION AS ARGUMENT
// function greet(cb) {
//   cb();
// }

// greet(function () {
//   console.log("Function supplied as argument.");
// });

// RETURNED FUNCTION AS VALUE
// function doSomething() {
//   return function () {
//     console.log("Nested Function!!");
//   };
// }
// const nestedFn = doSomething();
// console.log(nestedFn());

// CLOSURE: Process of binding outer scope variables with the nested functions
// function testClosure() {
//   let x = 2;
//   return function () {
//     return "NESTED FUNCTION (X) " + ++x;
//   };
// }

// const nestedFn = testClosure();
// console.log(nestedFn()); // 3
// console.log(nestedFn()); // 4
// console.log(nestedFn()); // 5

// function curriedDemo(n1) {
//   return function (n2) {
//     return function (n3) {
//       return n1 + n2 + n3;
//     };
//   };
// }

// const firstNestedFn = curriedDemo(10);
// const secondNestedFn = firstNestedFn(12);
// console.log("Curried Result : ", secondNestedFn(15));
// console.log("More Curried : ", curriedDemo(1)(2)(3));

// function buildTicket(transport) {
//   let numOfPassengers = 0;
//   return function (name) {
//     return `
// Hello Mr/s. ${name},
// You are going via ${transport}.
// Your ticket ID number is #${++numOfPassengers}!
//         `;
//   };
// }

// const shipTransport = buildTicket("Ship");
// console.log(shipTransport("Monica"));
// console.log(shipTransport("Ross"));

// const kangarooTansport = buildTicket("Kangaroo");
// console.log(kangarooTansport("Joey"));

// SCOPE CHAIN: local env -> outer env -> global env
// let x = 101;

// function a() {
//   //   let x = 201;
//   function b() {
//     // let x = 301;
//     console.log(x); // x = 301
//   }
//   b();
// }

// Lexical Environment: outer environment (refers to placement of function)
// let x = 501;            // Global Environment

// function a() {
//   let x = 401;
//   b();
// }

// function b() {
//   console.log(x); // 501
// }

// function a() {
//     console.log(x);         // 101
// }

// a();

// ASYNC - TIMER
// console.log("Start");

// // Executed by different thread environment
// setTimeout(() => {
//   console.log("Timer for 2 seconds");
// }, 2000);

// fetch("https://api.github.com/users/synergy2411")
//   .then((response) => response.json())
//   .then((userDetails) => console.log(userDetails))
//   .catch((err) => console.error(err));

// console.log("End");

for (key in window) {
  console.log(key);
}

// window.alert("Who's this?");

// alert("I'm here!");

confirm("Are you Sure?");
