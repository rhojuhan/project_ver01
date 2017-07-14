package com.project.REST.consulting.Service;

import java.util.List;

import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.DTO.DefaultPrameterDTO;

public interface CosultingServiceInterface {
	public List<DefaultDataDTO> getDefaultAllList(DefaultPrameterDTO defaultPrameterDTO)throws Exception;
}
