FROM openjdk:11

WORKDIR /app

COPY ./target/testacr-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "testacr-0.0.1-SNAPSHOT.jar"]