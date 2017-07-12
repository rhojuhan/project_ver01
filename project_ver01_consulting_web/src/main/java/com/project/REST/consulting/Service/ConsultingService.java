package com.project.REST.consulting.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.REST.consulting.DAO.ConsultingInterface;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

@Service
public class ConsultingService implements CosultingServiceInterface{
	
	@Inject
	private ConsultingInterface con;
	
	@Override
	public void testInsert() throws Exception {
		con.testDBCP();
	}

	@Override
	public List<Tel_Plan_DTO> getPlanInfor(int telCode) throws Exception {
		// TODO Auto-generated method stub
		return con.getPlanList(telCode);
	}

}
