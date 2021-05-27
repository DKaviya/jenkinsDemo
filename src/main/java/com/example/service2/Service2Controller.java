package com.example.service2;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	private static final Logger LOG = (Logger) LogManager.getLogger(Service2Controller.class);
	
	@GetMapping
	public String welcome() {
		LOG.info("Log dependency ===> org.apache.logging.log4j.LogManager");
		LOG.info("Logger INFO Statement");
		LOG.debug("Logger DEBUG Statement");
		LOG.error("Logger ERROR Statement");
		return "Welcome to Service 2";
		
		
	}

}
