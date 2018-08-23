FROM openjdk:8-jdk-alpine AS builder
WORKDIR /src
ADD . /src
RUN ./gradlew clean bootJar

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=builder /src/build/libs/*-0.0.1-SNAPSHOT.jar .
CMD exec java -jar *.jar
