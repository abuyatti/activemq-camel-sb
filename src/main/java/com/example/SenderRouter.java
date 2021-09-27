package com.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SenderRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("timer:active-mq-timer?period=30000")
			.transform().constant("Hello World!")
			.log("Message sent >> ${body}")
			.to("activemq:demo-camel-sb");

	}

}
