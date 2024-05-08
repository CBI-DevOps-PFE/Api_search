# Use an OpenJDK 17 base image
FROM adoptopenjdk/openjdk17:jdk-17.0.2_8-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/search-app.jar /app/search-app.jar

# Expose the port your application runs on
EXPOSE 8083

# Command to run the application when the container starts
CMD ["java", "-jar", "search-app.jar"]
