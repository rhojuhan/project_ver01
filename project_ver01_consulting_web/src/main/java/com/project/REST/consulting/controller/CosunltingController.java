package com.project.REST.consulting.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.Service.CosultingServiceInterface;

@RestController
@RequestMapping("/items")
public class CosunltingController {
	
	@Inject
	private CosultingServiceInterface serviceBean;
//	/{planCode}/{makerCode}/{productCode} ,@PathVariable("planCode") int planCode
	
	@RequestMapping(value="/default",method=RequestMethod.GET)
	public ResponseEntity<List<DefaultDataDTO>> defaultFirstPage()throws Exception{
		int defaultTelCode = 2004;
		int defaultPlanCode = 3012;
		int defaultMakerCode = 7001;
		int defaultProductCode = 7031;
		
		DefaultDataDTO defaultDataDTO = new DefaultDataDTO();
		defaultDataDTO.setTel_code(defaultTelCode);
		defaultDataDTO.setPlan_code(defaultPlanCode);
		defaultDataDTO.setMakerCode(defaultMakerCode);
		defaultDataDTO.setProductCode(defaultProductCode);
		
		ResponseEntity<List<DefaultDataDTO>> getEntityList = null;
		
		try {
			getEntityList = new ResponseEntity<>(serviceBean.getDefaultAllList(defaultDataDTO), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			getEntityList=new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}
		return getEntityList;
	}
	
}
