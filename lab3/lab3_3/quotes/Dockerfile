FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY ./target/quotes-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]