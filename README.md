# Run Kafka
```docker run -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=localhost --env ADVERTISED_PORT=9092 spotify/kafka```

# Run the producer
```cd producer && ./gradlew bootRun```

# Run the consumer
```cd consumer && ./gradlew bootRun```

# Execute http request (using httpie)
```http :8080/person/john```
