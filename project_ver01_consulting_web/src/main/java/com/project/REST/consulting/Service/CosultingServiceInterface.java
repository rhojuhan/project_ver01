package com.project.REST.consulting.Service;

import java.util.List;

import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

public interface CosultingServiceInterface {
	public List<Tel_Plan_DTO> getPlanInfor(int telCode)throws Exception;
	public List<DefaultDataDTO> getDefaultAllList(DefaultDataDTO defaultDataDTO)throws Exception;
}
