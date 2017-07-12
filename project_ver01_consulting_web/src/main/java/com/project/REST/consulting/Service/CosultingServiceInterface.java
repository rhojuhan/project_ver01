package com.project.REST.consulting.Service;

import java.util.List;

import com.project.REST.consulting.DTO.Tel_Plan_DTO;

public interface CosultingServiceInterface {
	public void testInsert()throws Exception;
	public List<Tel_Plan_DTO> getPlanInfor(int telCode)throws Exception;
}
