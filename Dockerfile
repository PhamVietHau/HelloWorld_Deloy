FROM eclipse-temurin:17-jdk-jammy

# Tạo thư mục làm việc trong container
WORKDIR /app

# Sao chép file JAR vào container
COPY target/*.jar app.jar

# Mở cổng 8080 (hoặc cổng bạn dùng)
EXPOSE 8090

# Lệnh chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]