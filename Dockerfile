FROM eclipse-temurin:11-jdk-alpine
EXPOSE 8080:8080
ADD /target/springboot-thymeleaf-crud-0.0.1-SNAPSHOT.jar springboot-thymeleaf-crud-jdk11.jar
ENTRYPOINT ["java","-jar","springboot-thymeleaf-crud-jdk11.jar"]