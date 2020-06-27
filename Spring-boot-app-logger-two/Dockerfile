# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /Spring-boot-app-logger-two
WORKDIR /Spring-boot-app-logger-two/logger_generator_service_2

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /Spring-boot-app-logger-two/logger_generator_service_2/target

# running the spring boot app
CMD ["java", "-jar", "logger_generator_service_2-0.0.1-SNAPSHOT.jar"]

