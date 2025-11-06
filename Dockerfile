# ---- Build stage ----
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# ---- Run stage ----
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Render cung cấp biến PORT, ta cần expose nó
EXPOSE 8080
CMD ["sh", "-c", "java -jar app.jar --server.port=${PORT:-8080}"]
