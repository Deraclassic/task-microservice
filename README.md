# TaskBoard Microservice Application

TaskBoard is a microservice application generated using JHipster. It is designed to handle basic CRUD operations related to task management. The application is integrated with a gateway application called `taskmanagergateway`.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Features

- **CRUD Operations**: Create, Read, Update, and Delete tasks.
- **Microservice Architecture**: Developed as a microservice to be easily scalable and maintainable.
- **Gateway Integration**: Integrated with the `taskmanagergateway` for routing and load balancing.
- **API Documentation**: Fully documented APIs tested on Postman.

## Technologies Used

- **Spring Boot**: For building the microservice.
- **JHipster**: For rapid application development and microservice generation.
- **Hibernate**: For ORM and database interaction.
- **Postman**: For API testing and documentation.

## Getting Started

### Prerequisites

- **Java 17**: Ensure that you have Java 17 installed on your machine.
- **Maven**: For building and managing the application dependencies.
- **Docker**: If you plan to run the application in a containerized environment.

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/taskboard.git
    cd taskboard
    ```

2. Build the application using Maven:
    ```bash
    ./mvnw clean install
    ```

### Running the Application

1. Start the application:
    ```bash
    ./mvnw spring-boot:run
    ```

2. The application will start and be accessible at `http://localhost:8080`.

3. To access the `taskmanagergateway`, navigate to `http://localhost:8080/taskmanagergateway`.

## API Documentation

The API is fully documented and tested using Postman. You can import the Postman collection provided in the `postman` directory of this repository to explore the available endpoints.

## Testing

Unit and integration tests are included in the application. To run the tests, use the following command:

```bash
./mvnw test

