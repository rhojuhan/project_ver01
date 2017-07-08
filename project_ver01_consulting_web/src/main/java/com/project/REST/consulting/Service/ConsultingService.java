package com.project.REST.consulting.Service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.REST.consulting.DAO.ConsultingInterface;

@Service
public class ConsultingService implements CosultingServiceInterface{
	
	@Inject
	private ConsultingInterface con;
	
	@Override
	public void testInsert() throws Exception {
		con.testDBCP();
	}

}
