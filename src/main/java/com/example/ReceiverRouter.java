package com.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ReceiverRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("activemq:demo-camel-sb")
			.log("Message received >> ${body}");

	}

}
