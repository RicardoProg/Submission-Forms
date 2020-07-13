package com.ricardo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SubmissionFormsApplication {
	
	/*@ComponentScan

	extends SpringBootServletInitializer

	@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			
			return application.sources(SubmissionFormsApplication.class);
		}*/

	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormsApplication.class, args);
	}

}
