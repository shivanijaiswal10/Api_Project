

# API Testing Project

## Table of Contents
- [Introduction](#Introduction)
- [Features](#features)
- [Tools & Technologies](#tools--technologies)
- [Test Scenarios](#test-scenarios)
- [Installation](#installation)
- [Usage](#usage)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Introduction
This project demonstrates API testing using **Rest Assured** and **JAVA** for automating and validating API requests. The purpose is to ensure that the API endpoints are functioning as expected by performing various tests such as CRUD operations and authentication.

## Features
- Automated API testing for various endpoints.
- Supports both positive and negative test cases.
- Detailed assertions for response validation.
- Handles authentication and token-based testing.
- JSON response body validation.
  
## Tools & Technologies
- **Rest Assured** (Java)
- **JUnit/TestNG** (for Rest Assured)
- **Spring Tool Suite/Eclipse** (for Rest Assured)

## Test Scenarios
The following scenarios are covered:
- User creation, retrieval, update, and deletion.
- Login and logout functionality.
- Handling invalid requests and responses.
- Validating response codes, headers, and body content

### Prerequisites
- Maven (for dependency management)
- VS Code and Spring Tool Suite or Eclipse



### Running Rest Assured Tests
To run API tests using **Rest Assured**:
```bash
mvn test
```

## Running Tests
- All tests are automated and can be run via the command line.
- Test reports are generated and stored in the `/target` folder (for Rest Assured).
- Cypress provides a built-in dashboard for viewing test execution results.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve the project.








