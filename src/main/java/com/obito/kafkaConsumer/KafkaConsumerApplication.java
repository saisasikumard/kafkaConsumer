package com.obito.kafkaConsumer;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.obito.kafkaImplemetation.dto.AppleRequest1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumerApplication {

	private static final Log log = LogFactory.getLog(KafkaConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
	@KafkaListener(topics = "apple",groupId = "payment-consumer-group")
	public void paymentConsumer(AppleRequest1 messege) throws JsonProcessingException {
		log.info("initiated the payment:"+new ObjectMapper().writeValueAsString(messege));


	}
}
