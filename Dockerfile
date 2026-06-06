
FROM maven:3.8.8-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /target/usuarios-0.0.1-SNAPSHOT.jar usuarios.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "usuarios.jar"]