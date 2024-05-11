# Use an OpenJDK 17 base image
FROM openjdk:17-oracle

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY . .

# Expose the port your application runs on
EXPOSE 8083

# Command to run the application when the container starts
CMD ["java", "-jar", "SearchHotel.jar"]
