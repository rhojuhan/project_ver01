package com.project.REST.consulting.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.REST.consulting.DTO.Tel_Extra_DTO;
import com.project.REST.consulting.DTO.Tel_H_Product_DTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

@Repository
public class ConsultingRepository implements ConsultingInterface{

	@Inject
	private SqlSession sessionBean;
	
	@Override
	public void testDBCP() throws Exception {
		sessionBean.insert("testDBCP");
	}

	@Override
	public List<Tel_Plan_DTO> getPlanList(int telCode) throws Exception {
		// TODO Auto-generated method stub
		return sessionBean.selectList("getPlanList",telCode);
	}

	@Override
	public List<Tel_Extra_DTO> getExtraList(int telCode) throws Exception {
		// TODO Auto-generated method stub
		return sessionBean.selectList("getExtraList", telCode);
	}

	@Override
	public List<Tel_H_Product_DTO> getHomeProductList(int telCode) throws Exception {
		// TODO Auto-generated method stub
		return sessionBean.selectList("getHomeProductList", telCode);
	}
	
}
