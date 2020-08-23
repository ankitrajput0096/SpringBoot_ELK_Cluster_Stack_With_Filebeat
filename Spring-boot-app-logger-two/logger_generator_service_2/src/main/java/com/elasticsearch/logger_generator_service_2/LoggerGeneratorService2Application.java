package com.elasticsearch.logger_generator_service_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerGeneratorService2Application implements ApplicationRunner {

	private static final Logger logger =
			LoggerFactory.getLogger(LoggerGeneratorService2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerGeneratorService2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("--------------> Logger Two <----------------");
		logger.info("----   The Application for Logger Two    ----");
		logger.info("----              STARTED                 ----");
		logger.info("----------------------------------------------");
	}
}
