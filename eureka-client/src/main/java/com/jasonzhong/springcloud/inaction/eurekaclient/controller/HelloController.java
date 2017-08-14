package com.jasonzhong.springcloud.inaction.eurekaclient.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class HelloController {

	private final Logger logger = Logger.getLogger(HelloController.class);
	
//	@Autowired
//	private DiscoveryClient client ;
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String index(){
		
		return "Hello World";
	}
	
}
