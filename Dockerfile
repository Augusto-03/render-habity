FROM amazoncorretto:17-alpine-jdk

COPY target/habity-backend-0.0.1-SNAPSHOT.jar /api-v1.jar

ENTRYPOINT [ "Java", "-jar", "/api-v1.jar" ]