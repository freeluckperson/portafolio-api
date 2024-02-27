FROM amazoncorretto:17-alpine-jdk

COPY target/resapi-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
