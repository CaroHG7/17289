FROM rrojano/spring-boot:latest
WORKDIR /app
CMD ["java", "-jar", "target/SaludarDatos-0.0.1-SNAPSHOT.jar"]
COPY ./SaludarDatos/SaludarDatos/pom.xml ./pom.xml
COPY ./SaludarDatos/SaludarDatos/src ./src
RUN mvn package -DskipTests
