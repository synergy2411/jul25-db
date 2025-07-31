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

- HTML
  - Semantic Elements: meaningful elements
- CSS
- Labs
