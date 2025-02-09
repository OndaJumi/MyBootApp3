package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
/**
* Hello world!
*
*/
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		 SpringApplication.run(DemoApplication.class, args);
	}

}

