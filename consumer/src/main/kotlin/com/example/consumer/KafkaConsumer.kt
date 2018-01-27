package com.example.consumer

import com.example.consumer.KafkaConsumerConfig.Companion.TOPIC
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener

class KafkaConsumer {
    @KafkaListener(topics = [TOPIC])
    fun receive(payload: String) {
        LOGGER.info("Received payload='$payload'")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(KafkaConsumer::class.java)
    }
}
