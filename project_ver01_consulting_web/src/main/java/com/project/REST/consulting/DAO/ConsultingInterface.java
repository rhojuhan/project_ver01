package com.project.REST.consulting.DAO;

import java.util.List;

import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.DTO.DefaultPrameterDTO;

public interface ConsultingInterface {
	public List<DefaultDataDTO> getDefaultAllList(DefaultPrameterDTO defaultDataDTO)throws Exception;
}
