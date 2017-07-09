package com.project.REST.consulting.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.REST.consulting.Service.CosultingServiceInterface;

@RestController
@RequestMapping("/re")
public class CosunltingController {
	
	private static final Logger logger = LoggerFactory.getLogger(CosunltingController.class);
	
	@Inject
	private CosultingServiceInterface serviceOBJ;
	
	@RequestMapping(value="/se",method=RequestMethod.POST)
	public String testRest(@RequestParam("id") String id , @RequestParam("pw") String pw)throws Exception{
		System.out.println(id + ":" + pw);
		return "success";
	}
	@RequestMapping(value="/te",method = RequestMethod.GET)
	public void test()throws Exception{
		System.out.println("hello");
	}
}
