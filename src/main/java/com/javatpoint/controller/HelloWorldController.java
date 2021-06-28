package com.javatpoint.controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController{
	private static final Logger log = LogManager.getLogger(HelloWorldController.class);

	@RequestMapping("/")
	public String hello() {
		log.info("ACCESS PAGE SUCCESS");
		return "Hello HUMAN";
	}
}
