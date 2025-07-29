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
- Spring
- SpringBoot
- Spring Web
- Spring Security
- Documentation
- Distributed Tracing (Zipkin)
- Actuators (Monitoring)
- REST Endpoints
- Maven


----
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
- Documentation
- Distributed Tracing (Zipkin)
- Security
- Actuator

# Folder Structure
- Controller: AccountsController
- Entity
- Repository
- Services
- DTOs
- Exceptions
- Mapper


# Steps
- Include h2 & data-jpa dependency in pom.xml
- Create tables - customers and accounts (schema.sql))
- Enable the h2 console (application.yml)
  - spring.h2.console.enabled = true
- Set the properties for Datasource
  
- Visit -  http://localhost:8080/h2-console












