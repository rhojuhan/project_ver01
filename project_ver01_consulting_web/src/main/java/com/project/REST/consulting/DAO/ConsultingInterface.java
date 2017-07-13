package com.project.REST.consulting.DAO;

import java.util.List;

import com.project.REST.consulting.DTO.Tel_Extra_DTO;
import com.project.REST.consulting.DTO.Tel_H_Product_DTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

public interface ConsultingInterface {
	public List<Tel_Plan_DTO> getDefaultList(int defaultPlanCode)throws Exception;
	public List<Tel_Plan_DTO> getPlanList(int telCode)throws Exception;
	public List<Tel_Extra_DTO> getExtraList(int telCode)throws Exception;
	public List<Tel_H_Product_DTO> getHomeProductList(int telCode)throws Exception;
}
