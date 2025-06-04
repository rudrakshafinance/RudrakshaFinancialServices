# Stage 1: Build the JAR using Maven
FROM maven:3.9.4-eclipse-temurin-17 AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: Run the JAR with OpenJDK
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=builder /app/target/rudrakshafinance-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
