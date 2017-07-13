package com.project.REST.consulting.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.REST.consulting.DAO.ConsultingInterface;
import com.project.REST.consulting.DTO.MakerProductDTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

@Service
public class ConsultingService implements CosultingServiceInterface{
	
	@Inject
	private ConsultingInterface con;
	
	
	@Override
	public List<MakerProductDTO> getDefaultMakerList(MakerProductDTO makerProductDTO) throws Exception {

		return con.getDefaultProductList(makerProductDTO);
	}

	@Override
	public List<Tel_Plan_DTO> getDefaultPlanList(Tel_Plan_DTO tel_Plan_DTO) throws Exception {
		// TODO Auto-generated method stub
		return con.getDefaultPlanList(tel_Plan_DTO);
	}

	@Override
	public List<Tel_Plan_DTO> getPlanInfor(int telCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	

}
