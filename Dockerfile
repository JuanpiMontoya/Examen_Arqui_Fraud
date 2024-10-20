FROM openjdk:17-jdk-slim

EXPOSE 8084
COPY target/Fraud-Service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]