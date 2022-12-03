package com.example.lepszeduolingoserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class LepszeDuolingoServerApplication {

	private static final Logger logger = LoggerFactory.getLogger(LepszeDuolingoServerApplication.class.getName());

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext context = SpringApplication.run(LepszeDuolingoServerApplication.class, args);
		Environment env = context.getEnvironment();

		logger.info("\n----------------------------------------------------------\n\t"
						+ "Application is running! Access URLs:\n\t"
						+ "Local: \t\thttp://localhost:{}\n\t" + "External: \thttp://{}:{}\n\t"
						+ "Profile(s): \t{}\n----------------------------------------------------------",
				env.getProperty("server.port"), InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"), env.getActiveProfiles());
	}

}