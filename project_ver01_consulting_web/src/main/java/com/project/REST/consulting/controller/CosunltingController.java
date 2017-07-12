package com.project.REST.consulting.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.REST.consulting.DTO.Tel_Plan_DTO;
import com.project.REST.consulting.Service.CosultingServiceInterface;

@RestController
@RequestMapping("/re")
public class CosunltingController {
	
	@Inject
	private CosultingServiceInterface serviceBean;
//	/{planCode}/{makerCode}/{productCode} ,@PathVariable("planCode") int planCode
	
	@RequestMapping(value="/se/{telCode}",method=RequestMethod.GET)
	public ResponseEntity<List<Tel_Plan_DTO>> defaultFirstPage(@PathVariable("telCode") int telCode)throws Exception{
		
		ResponseEntity<List<Tel_Plan_DTO>> getEntityList = null;
		System.out.println(telCode);
		
		try {
			getEntityList=new ResponseEntity<>(serviceBean.getPlanInfor(telCode),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			getEntityList=new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return getEntityList;
	}
	
}
