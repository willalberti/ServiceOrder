FROM adoptopenjdk/openjdk11:latest
WORKDIR /usr/src/app
COPY target/serviceorder-0.0.1-SNAPSHOT.jar ./app.jar
CMD ["java", "-jar", "app.jar"]
EXPOSE 8090