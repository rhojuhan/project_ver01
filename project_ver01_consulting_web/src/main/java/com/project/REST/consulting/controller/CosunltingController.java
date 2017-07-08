package com.project.REST.consulting.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.REST.consulting.Service.CosultingServiceInterface;

@RestController
@RequestMapping("/re")
public class CosunltingController {
	
	private static final Logger logger = LoggerFactory.getLogger(CosunltingController.class);
	
	@Inject
	private CosultingServiceInterface serviceOBJ;
	
}
