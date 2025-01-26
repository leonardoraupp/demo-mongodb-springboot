# Spring Boot & MongoDB demo project

## Introduction
A Spring Boot project with an RESTful API and MongoDB database. The project is following MCV(Model View Controller) architecture.
The project is based on a user entity and posts made by the users that can have comments. 
This application developed using the Spring Boot framework was built with the goal of learning and applying key concepts such as:

- Spring Boot 3
- MongoDB
- JPA (Java Persistence API)  
- Annotations Spring, Jackson, Java
- Class Relationships
- Object-Relational Mapping
- Jackson API
- Maven

## Architecture
### Domain Model
![image](https://github.com/user-attachments/assets/fcdcc067-c39d-4a85-ae53-12561a72556a)

### Domain Instance
![image](https://github.com/user-attachments/assets/4abdd3e0-cf01-4e2c-a20a-38aba7c1f163)

### Logical Layers
![image](https://github.com/user-attachments/assets/8d1d1855-9bf9-486b-b308-72dc92405aef)

### Schema Diagram(Documents)
![image](https://github.com/user-attachments/assets/9909aba1-cbc9-4bfa-8252-e2f5681a4433)

## Project Structure
- **src.main.java.com.example.mongodb_springboot.**: Contains the main Java source code.
    - **repository**: Package for repository.
    - **resources**: Package for resources.
    - **services**: Package for services.
    - **config**: Package for configuration on project.
    - **domain**: Package for entities classes.
    - **dto**:  Package for DTO classes.
    - **exceptions**: Package for exceptions.

## Technologies Used
- **Spring Boot 3**: Project framework.
- **Java 17 LTS**: Core programming language.
- **MongoDB**: Database used for this project.
- **Maven**: Package manager.
  
## Resources 
- localhost:8080/users
- localhost:8080/users/id
- localhost:8080/posts
- localhost:8080/posts/id
- localhost:8080/posts/postTitleSearch
- localhost:8080/posts/fullSearch

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Installation and running the project
1. **Clone the repository**:
   ```sh
   git git@github.com:leonardoraupp/demo-mongodb-springboot.git
   cd demo-spring
   ```
   
2.  **Execute the project on MongoDB Database**:
   *Make sure you have installed MongoDB*
    -  Run the MongoDB service.
    Linux example:
       ```sh
       sudo systemctl start mongod
       ```
    -  Create a database on MongoDB and update the application.properties with the necessary data:
       ```sh
       spring.application.name=mongodb-springboot
       spring.data.mongodb.uri=mongodb://localhost:27017/demo-mongodb       
       ```
    -  Run the class **MongodbSpringbootApplication** located on src.main.java.com.example.mongodb_springboot package.
    -  Use the platform Postman, Curl or any other to test and make requests.
   
## Contributing
Contributions are welcome! Please fork this repository and submit pull requests for any enhancements, bug fixes, or new features.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Author
Leonardo Raupp

https://www.linkedin.com/in/leonardo-raupp
