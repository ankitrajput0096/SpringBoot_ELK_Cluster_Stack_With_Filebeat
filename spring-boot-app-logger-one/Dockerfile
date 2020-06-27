# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring-boot-app-logger-one
WORKDIR /spring-boot-app-logger-one/spring-app-log

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /spring-boot-app-logger-one/spring-app-log/target

# running the spring boot app
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

