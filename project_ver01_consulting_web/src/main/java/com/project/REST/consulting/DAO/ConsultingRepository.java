package com.project.REST.consulting.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.DTO.DefaultPrameterDTO;

@Repository
public class ConsultingRepository implements ConsultingInterface{

	@Inject
	private SqlSession sessionBean;

	
	@Override
	public List<DefaultDataDTO> getDefaultAllList(DefaultPrameterDTO defaultDataDTO) throws Exception {
		// TODO Auto-generated method stub
		return sessionBean.selectList("getDefaultAllList", defaultDataDTO);
	}

	

	

	
	
}
