package com.ust.msg.consumer;

import java.util.logging.Logger;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ust.msg.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {

	// Logger l = Logger.getLogger("PurchaseOrderConsumer");

	@Value("${ust.rabbitmq.queue}")
	String queuename;

	@Value("${ust.rabbitmq.exhange}")
	String exchange;

	@Value("${ust.rabbitmq.routingkey}")
	private String routingKey;

	@RabbitListener(queues = "ust_queue")
	public void consumerMessageFromQueue(OrderStatus orderStatus) {
		// l.info("Message received from queue : " + orderStatus);
		System.out.println("Message received from queue : " + orderStatus);
	}

}
