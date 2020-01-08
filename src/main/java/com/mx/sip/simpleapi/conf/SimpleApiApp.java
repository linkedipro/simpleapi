package com.mx.sip.simpleapi.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.mx.sip.simpleapi")
public class SimpleApiApp {

	public static void main (String[] arg) {
		SpringApplication.run(SimpleApiApp.class, arg);
	}
}
