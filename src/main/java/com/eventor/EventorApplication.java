package com.eventor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//
@SpringBootApplication
public class EventorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventorApplication.class, args);
	}

}
//
//@ComponentScan
//@EnableAutoConfiguration
//public class EventorApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(EventorApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(EventorApplication.class, args);
//	}
//}