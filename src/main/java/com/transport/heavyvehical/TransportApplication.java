package com.transport.heavyvehical;

import com.transport.heavyvehical.patterns.Patterns;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("app.properties")
public class TransportApplication {

	public static void main(String[] args) {

		SpringApplication.run(TransportApplication.class, args);

		Patterns.getPattern();
	}
}
