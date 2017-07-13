package com.project.REST.consulting.Service;

import java.util.List;

import com.project.REST.consulting.DTO.MakerProductDTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

public interface CosultingServiceInterface {
	public List<Tel_Plan_DTO> getPlanInfor(int telCode)throws Exception;
	public List<Tel_Plan_DTO> getDefaultPlanList(Tel_Plan_DTO tel_Plan_DTO)throws Exception;
	public List<MakerProductDTO> getDefaultMakerList(MakerProductDTO makerProductDTO)throws Exception;
}
