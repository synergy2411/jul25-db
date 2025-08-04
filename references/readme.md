# Day 04 - Topics

- Generics: Parameterized Type; <T>
- Collection Framework:
  - List: ArrayList, LinkedList, Vector
  - Set: HashSet, LinkedHashSet, TreeSet
  - Map: HashMap, LinkedHashMap, TreeMap
- Comparator and Comparable
- Functional Interface and Lambda Expression (()->{}):
  - Consumer
  - Predicate
  - Function
  - Supplier
- JDBC:

  - DriverManager Class
  - Connection
  - Statement / PreparedStatement (executeQuery, executeUpdate)
  - ResultSet

- JUnit 5: Testing Framework for Java Apps
  - JUnit Platform: launches the test on JVM
  - JUnit Jupiter: New Annotations added
  - JUnit Vintage: Support Old version of JUnit (v3.x / v4.x)
  - Two Dependencies
    - junit-jupiter-api
    - junit-jupiter-engine
- Stub : Dummy implementation
- Mockito : mock the behaviour with implementation
  - mock() method
  - @Mock Annotation

# Day 05 and Day 06 -

- Spring: Container for creating and manging beans; IoC; DI
- SpringBoot: Production ready App...quickly. Starters: web - Tomcat, Auto-configuration, Jackson Binding etc
- Spring Web: starter to create MVC App
- Actuators (Monitoring): to monitor App health and various metrics available
- Maven: Dependency Management Tool; POM.xml
- REST Endpoints : Resources (/courses, /products etc)
- Spring Security
- Documentation
- Distributed Tracing (Zipkin)

---

# Spring: Container for Creating and Managing Beans

- A framework of frameworks
- Open Source
- Web Apps, Microservices, Cloud Apps
- IoC: Inversion of Control-
  - Approach for delegating the responsibility of create and managing the beans to the Spring Container
- DI: Dependency Injection
- IoC Container, DI Container, ApplicationContext, Container
- Convention over Configuration
- @Autowired: supply the dependency
- Beans: Java POJO (Plain Old Java Object; Reusable
  - @Component
  - @Service
  - @Repository
  - @Configuration
  - @Bean

# Accounts - REST API for EazyBank

- Accounts
- Customers
- h2 Database (in-memory)
- JPA
- Lombok: @NoArgsContructor, @AllArgsConstructor, @Getter, @Setter, @Data
- Starter Web
- Actuator
- Documentation
- Distributed Tracing (Zipkin)
- Security

# Folder Structure

- Controller: AccountsController
- Entity: (Customer and Accounts)
- Repository: (CustomerRepo and AccountsRepo)
- DTOs: Data Transfer Object (CustomerDto, AccountsDto, ResponseDto, ErrorResponseDto)
- Mapper :
  - (CustomerMapper -> transfer data from / to Customer / CustomerDto)
  - (AccountsMapper -> transfer data from / to Accounts / AccountsDto )
- Services: AccountsService Class (business logic and JPA Operation)
  - create: Customer details required to open the account (CustomerDto as Request Body)
  - fetch
  - update
  - delete
- Exceptions

# Steps to include H2 and JPA

- Include h2 & data-jpa dependency in pom.xml
- Create tables - customers and accounts (schema.sql))
- Enable the h2 console (application.yml)
  - spring.h2.console.enabled = true
- Set properties for Datasource
- Visit - http://localhost:8080/h2-console

# Actuator : for health monitoring

- include the actuator dependency (pom.xml)
  - spring-boot-starter-actuator
- Update the application properties (application.yml)
  - management.endpoints.web.exposure.include="\*"
- Visit: http://localhost:8080/actuator

# Lombok Support: for Annotations

- Include 'lombok' dependency in pom.xml

---

# Day 06

- Accounts App (CRUD Operations)
  - Create: /api/create (POST Mapping + RequestBody - CustomerDto)
  - Read: /api/fetch (GET Mapping + RequestParameter - Mobile Number)
  - Delete: /api/delete (Delete Mapping + RequestParameter - Mobile Number)
  - Update: /api/update (Patch Mapping + Request Body - Customer Dto (name, email, mobileNumber))
- Documentation - Swagger UI
- Zipkin Server: Distributed Tracing: Timing Data
- Monitoring: Actuator: metrics-> health, beans, live, ready etc
- Security: Authentication and Authorization;
  - spring-boot-starter-security
  - Security Filter
    - Enable Http-basic auth
    - Disable the FormLogin (user, GeneratedPassword)
    - InMemoryUserDetailsService
    - JdbcUserDetailsManager (User, Authority)
    - @PreAuthorize("hasRole('ADMIN')") : Method level Security
    - RequestMatcher("\*/admin/\*\*").authenticate().hasRole("ADMIN") : Endpoints secured
- Testing:
  - JUnit 5
  - Mockito
  - @Test
  - @DisplayName
  - @BeforeEach
  - @BeforeAll
  - @AfterEach
  - @AfterAll
  - @Mock
  - @InjectMock

---

# Day 07

- HTML: creates the structure and display the content
  - Semantic Elements: meaningful elements
- CSS: Selectors; change the appearence and layout(Float, Flexbox, Grid) of the page
- Labs

---

# Day 08

- JavaScript
  - ECMA Specification (ES5)
  - Function (Callback, HOF, Closures, Lexical Scope)
    - Function declaration
    - Function Expression
    - Arrow Function =>
  - JavaScript engine runs in two phase :
    - Creational Phase : allocates the memory
    - Executional Phase: executes the code
  - AST : Abstract Syntax Tree
  - BOM (window): Browser Object Model
  - DOM (document) : Document Object Model

# JavaScript Libraries and Frameworks

- React: 35kb, Render the UI quickly; Virtual DOM; Reconciliation Process; Diffing Algorithm; Props, State, JSX, hooks etc; Component based architecture;
- jQuery: DOM manipulation; Animation, AJAX Calls
- Bootstrap: Material UI Components
- KnockoutJS: MVVM Pattern; 2 way data binding
- BackboneJS: MVC Pattern at client side
- Stencil: Component based architecture
- Electron: Standalone Desktop Apps
- PolymerJS: Feature Rich Web Components
- D3: Charts (Bar, Pie etc)
- NextJS\*: Server-side framework for React App; SPA
- Vue\*: Template, HTTP Call, Components, State Management, 2 way data binding, MVC Pattern, SPA etc
- Angular\* (v1.x -> 2011): Template, HTTP Call, Components, State Management, 2 way data binding, MVC Pattern, SPA etc
- Ionic\*: Mobile Apps (React/Angular/Vue)
- EmberJS\* (2010): Frequent changes in API

- NodeJS: Server-Side Platform
- ExpressJs/Koa/Hapi/KrakenJS/SailsJS: Web App Server for NodeJS Platform

# Install NodeJS from https://www.nodejs.org

# Generate React Boilerplate Code-

- npm create vite@latest
- cd frontend
- npm install
- npm run dev (localhost:5173)

# React Concepts

- Components: reusable piece of code
  - Functional
  - Class Based
- Lifting up the state (Data transfer from child to parent component)
- JSX : {} to embed JavaScript Expressions in JSX
- Props: using attribute

# SpringBoot App

- Accounts App:
  - GET: getbyMobileNumber
  - POST: create
  - DELETE: deleteByMobileNumber
  - PATCH: updateCustomer (name, email)
  - Security (http-basic, Role based security, h2, data jpa)
  - POST: userLogin (username, password) => username, roles
  - GET: userLogout
- Frontend App

# Side effect: any effect for which React is not meant for.

- Remote Server Call
- State Management
- Form Validation

# Form Inputs

- Controlled
  - Maintain State in React Component
  - Listen to onChange Event
  - More fine-grain control over input element
- Uncontrolled
  - Create Ref Variables
  - Supply Ref to the form element
