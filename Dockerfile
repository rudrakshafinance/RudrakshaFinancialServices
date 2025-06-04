# Stage 1: Build the JAR using Maven
FROM maven:3.8.7-openjdk-17-slim AS builder

WORKDIR /app

# Copy pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the project and skip tests (you can remove -DskipTests if you want to run tests)
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR with OpenJDK
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built jar from the builder stage
COPY --from=builder /app/target/rudrakshafinance-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
