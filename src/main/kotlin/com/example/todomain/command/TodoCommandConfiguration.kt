package com.example.todomain.command

import io.eventuate.tram.messaging.common.Message
import io.eventuate.tram.messaging.producer.MessageProducer
import io.eventuate.tram.spring.events.publisher.TramEventsPublisherConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories
//@Import(TramEventsPublisherConfiguration::class)

//TramMessageProducerJdbcConfiguration::class, NoopDuplicateMessageDetector::class
class TodoCommandConfiguration {


}