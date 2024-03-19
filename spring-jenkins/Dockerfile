FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/spring-jenkins.jar .
EXPOSE 8080
CMD ["java","-jar","spring-jenkins.jar"]