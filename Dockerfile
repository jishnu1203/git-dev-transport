# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine
ENV APP_HOME=/home/java
RUN mkdir  $APP_HOME
WORKDIR $APP_HOME

#ADD
ARG JAR_FILE=build/libs/transport-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]