package com.example.service2;

import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/pipeline")
public class Service2Controller {
	
	private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(Service2Controller.class);
	
	@GetMapping("/demo")
	public String welcome() {
		LOG.info("Log dependency ===> org.apache.logging.log4j.LogManager");
		LOG.info("Logger INFO Statement");
		LOG.debug("Logger DEBUG Statement");
		LOG.error("Logger ERROR Statement");
		return "Welcome to Service 2";
		
		
	}

}
