# Start from OpenJDK base image
FROM openjdk17-jdk-slim

# Set the working directory inside the container
WORKDIR app

# Copy the JAR file from target to the container
COPY targetrudrakshafinance-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR file
ENTRYPOINT [java, -jar, app.jar]
