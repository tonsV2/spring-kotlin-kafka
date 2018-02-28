# Motivation
Simple Kafka "Hello world" application using Spring Boot 2.0 with Kotlin

# Inspiration/Credits
 - https://thecuriousdev.org/getting-started-spring-kafka/
 - https://hub.docker.com/r/spotify/kafka/

# Run Kafka
```docker run -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=localhost --env ADVERTISED_PORT=9092 spotify/kafka```

# Run the producer
```./gradlew producer:bootRun```

# Run the consumer
```./gradlew consumer:bootRun```

# Execute http request (using httpie)
```http :8080/person/john```
