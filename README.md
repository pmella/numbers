# Numbers API


## Overview
This is a REST API that returns the path for a given positive integer number after performing repeteadly from 1, either a multiplication by 3 or sum increment by 5.

## Business Value
This application provides the breakdown of the path to reach a specific number. The possible paths are either mulplications by 3 or increments by 5. It could help demonstrate what is the way a number can be decomposed by following these operations

## Functional Requirements

### User Persona
Any user 

### Acceptance Criteria
1.  GIVEN a positive integer number
    WHEN the number is send to the api
    THEN the system will provide a path to the number, if the number is the result of iterations based on either multiplication by 3 or increment in 5. 
2.  GIVEN a positive integer number
    WHEN the number cannot be decomposed on either iterations of mulitplications by 3 or increments in 5
    THEN the system will return a "NO PATH" message.
3.  GIVEN an incorrect input
    WHEN the incorrect input value is entered
    THEN the system will return a "NO PATH" message

### Assumptions
1. Numbers are positive integers greater or equals to 1. For 1, the path is 1.
2. Search is performed by using pre-order traversal, meaning the search visits first the root node, then the left subtree, and finally the right subtree.
3. There might be several paths to reach the same number, for example the number 28 ( 1->3->8-13->18->23->28 or 1->6->18->23->28). In those cases, the resulted path will be the first one found from the left nodes. In this case, the returned path will be 1->3->8-13->18->23->28. 

## Architecture

The application will consist of a REST API with a controller layer and some domain objects. 

### Components

1. **REST Controller Layer:** The application will expose a REST API and also a UI interface. Its documentation is available through open api (Swagger) under http://localhost:8080/swagger-ui.html 
2. **Domain Objects:** a Node class is created to support the implementation of a Binary Tree.
3. **Test Cases:** There are several test cases under src/test/java based on JUnit to perform functional testing. 


### Limitations
1. The biggest number tested before incurring in a stack overflow exception was 2202. In a further iteration, this limitation must be taken into account, should the requirement demand a bigger number to be decomposed. Complexity of this searchi is O(n) due to the algorithm used for search.

### Security
No mayor requirements for now.

### Tech Stack

The application is a java spring boot application. It uses the version 2.3.8 

### API
TBD
### Logging
TBD
### Health 
TBD
### Testing
TBD
### Regulatory and Compliance
TBD
### SLOs 
TBD
### Metrics
TBD
### CICD
TBD

## Next Steps and Potential Future Requirements
1. Provide the alternative paths as part of the response, in the case of the numbers that have more than 1 path
2. Optimize storage


## Prerequisites
1. Java SDK 11
2. Apache maven (for development purposes)

## How to execute it locally
1. Clone the project from this git repo 
```
git clone https://github.com/pmella/numbers.git
```
2. install the application with the following command:
```
mvn clean install
```
3. execute the following command:
```
java -jar target/numbers-0.0.1-SNAPSHOT.jar
```

3. to run it locally via maven spring-boot-plugin:
```
./mwnw sprint-boot:run
```

3. to run the unit test cases:
```
./mwnw test
```



