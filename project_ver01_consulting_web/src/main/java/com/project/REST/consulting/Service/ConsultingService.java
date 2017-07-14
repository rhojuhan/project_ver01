package com.project.REST.consulting.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import com.project.REST.consulting.DAO.ConsultingInterface;
import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

@Service
public class ConsultingService implements CosultingServiceInterface{
	
	@Inject
	private ConsultingInterface serviceBean;
	
	@Inject 
	private TransactionTemplate transaction;
	
	@Autowired
	public void init(PlatformTransactionManager platformTransactionManager){
		this.transaction = new TransactionTemplate(platformTransactionManager);
	}

	@Override
	public List<Tel_Plan_DTO> getPlanInfor(int telCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DefaultDataDTO> getDefaultAllList(DefaultDataDTO defaultDataDTO) throws Exception {
		// TODO Auto-generated method stub
		
		return serviceBean.getDefaultAllList(defaultDataDTO);
	}

	

}
