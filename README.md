# Microservices-Based-Student-Survey-application

## Project Overview
This project is a microservices-based web application built with Spring Boot to manage student survey data. It uses Amazon RDS for data storage and integrates with Docker, Kubernetes, Jenkins, and Rancher for containerization and deployment in a CI/CD pipeline.

The key features of this application include:

1.CRUD operations to manage student survey data.

2.Microservice architecture using Spring Boot, JPA, and RESTful API.

3.Docker containerization and deployment on Kubernetes.

4.Continuous integration and deployment (CI/CD) using Jenkins and Rancher.

5.Amazon RDS/MySQL database integration.

6.API testing using Postman.

Links
GET request:
https://44.219.217.249/k8s/clusters/c-m-mr9zg5c4/api/v1/namespaces/default/services/http:swe645-hw3-
deployment:8080/proxy/api/getstudentsurveys

POST request:
https://44.219.217.249/k8s/clusters/c-m-mr9zg5c4/api/v1/namespaces/default/services/http:swe645-hw3-
deployment:8080/proxy/api/createstudentsurvey

## Project Setup

1. Spring Boot Application
Create a Spring Boot project from Spring Initializer, selecting dependencies like JPA and MySQL.
Implement RESTful API endpoints using @RestController for HTTP GET, POST, PUT, DELETE operations.
Set up domain model classes to represent the database structure (surveys table).
Develop the service layer to handle business logic.
Set up Amazon RDS to store and manage survey data using MySQL.
Run the application on localhost:8080.

3. Amazon RDS Setup
Create an RDS MySQL instance in the AWS Management Console.
Use the Free Tier option and configure the instance with the appropriate settings (e.g., db.t2.micro).
Connect the Spring Boot application to the RDS instance via the application.yaml file.

5. Docker and Kubernetes Setup
Create a Dockerfile to containerize the Spring Boot application:
```
FROM tomcat:9.0-jdk15
COPY surveyform.war /usr/local/tomcat/webapps/
```
Build and run the Docker image:
```
docker build --tag surveyform645:0.1 .
docker run -it -p 8182:8080 surveyform645:0.1
```

Push the image to DockerHub:
```
docker login -u <username>
docker tag surveyform645:0.1 <username>/surveyform645:0.1
docker push <username>/surveyform645:0.1
```

Deploy the Docker container on a Kubernetes cluster using Rancher.

4. Jenkins CI/CD Pipeline
   
Set up Jenkins on an EC2 instance.
Configure Jenkins with the necessary plugins (GitHub, Docker, Maven).
Create a pipeline that:
  1.Builds the Spring Boot project.
  2.Creates a Docker image and pushes it to DockerHub.
  3.Deploys the image to Kubernetes using Rancher.

  ## Testing the API
Use Postman to test the API endpoints:
GET: Fetch all student surveys:
```
GET https://localhost:8080/surveys
```
POST: Add a new survey:

```
{
  "firstName": "John",
  "lastName": "Doe",
  "address": {
    "street": "123 Main St",
    "city": "Fairfax",
    "state": "VA",
    "zip": "22030"
  },
  "telephone": "123-456-7890",
  "email": "john.doe@example.com",
  "surveyDate": "2023-10-01",
  "likes": ["location", "sports"],
  "interestedIn": "internet",
  "recommendation": "Very Likely"
}
```

## Work Distribution
Preethi Ranganathan and Mary Rithika Reddy Gade: Led Jenkins CI/CD pipeline setup and deployment.
Sindhuja Kodaparthi, Tarun Vinay Gujjar, and Vikas Halgar Seetharam: Configured Docker, Kubernetes, and Rancher, contributing to infrastructure setup.

