FROM maven:3.8.6-jdk-11-slim as build

COPY src src

COPY pom.xml pom.xml

RUN mvn -f pom.xml clean package -Dmaven.test.skip

FROM openjdk:11

COPY --from=build /target/*.jar app.jar

EXPOSE 8091

ENTRYPOINT ["java", "-jar", "app.jar"]