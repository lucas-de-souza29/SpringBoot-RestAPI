# **Backend API RestFul - Spring Boot**

Welcome to the **Clientes API**, a RESTful web service designed for managing customer data efficiently. This project is built using **Spring Boot** to provide a robust and scalable backend for CRUD operations.

---

## **Features**
- **CRUD Operations:** Create, Read, Update, and Delete customer information.
- **Filter Queries:** Search customers by name or email.
- **Exception Handling:** Custom error messages for invalid requests using `@ControllerAdvice`.
- **Validation:** Data validation to ensure the integrity of customer information.
- **HTTP Status Codes:** Consistent and meaningful status codes for all API responses.
- **Modular Design:** Repository, Service, and Controller layers for better separation of concerns.

---

## **Technologies Used**
- **Spring Boot:** Framework for rapid and efficient development of Java-based RESTful APIs.
- **Spring Data JPA:** Simplified database operations with support for custom queries.
- **H2 Database:** Lightweight, in-memory database for development and testing.
- **Maven:** Dependency management and build tool.
- **Java 21 (or your version):** Modern language features for better code maintainability.

---

## **Endpoints**
Below is a summary of the main API endpoints:

| Method | Endpoint             | Description                  |
|--------|----------------------|------------------------------|
| POST   | `/api/clientes`      | Add a new customer           |
| PUT    | `/api/clientes/{id}` | Update customer by ID        |
| GET    | `/api/clientes/{id}` | Retrieve customer by ID      |
| GET    | `/api/clientes/nome` | Retrieve customers by name   |
| GET    | `/api/clientes/email`| Retrieve customers by email  |
| DELETE | `/api/clientes/{id}` | Delete customer by ID        |

---

## **Access the API**

- **Base URL:** `http://localhost:8080/api/clientes`

---

## **Error Handling**
The API includes comprehensive error handling to ensure clear and actionable feedback for clients. For example:
- **Invalid ID:** Returns a message like `"ID 999 not found."`
- **Internal Server Errors:** Proper logging for debugging and resolution.

---

## **How to Run**

1. Clone the repository:
   ```bash
   git clone https://github.com/lucas-de-souza29/SpringBoot-RestAPI.git

2. Navigate to the project directory:
   ```bash
   cd SpringBoot-RestAPI
   
3. Build the project with Maven:
    ```bash
    mvn clean install
    
4. Run the application:
    ```bash
    mvn spring-boot:run
    
5. Access the API at:
   - Base URL: http://localhost:8080/api/clientes 
   
