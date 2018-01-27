package com.example.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener

class KafkaConsumer {
    @KafkaListener(topics = arrayOf("Topic1"))
    fun receive(payload: String) {
        LOGGER.info("Received payload='{}'", payload)
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(KafkaConsumer::class.java)
    }
}
