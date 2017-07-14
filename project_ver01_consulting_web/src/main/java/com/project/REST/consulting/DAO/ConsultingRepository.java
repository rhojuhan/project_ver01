package com.project.REST.consulting.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.REST.consulting.DTO.DefaultDataDTO;
import com.project.REST.consulting.DTO.MakerProductDTO;
import com.project.REST.consulting.DTO.Tel_Extra_DTO;
import com.project.REST.consulting.DTO.Tel_H_Product_DTO;
import com.project.REST.consulting.DTO.Tel_Plan_DTO;

@Repository
public class ConsultingRepository implements ConsultingInterface{

	@Inject
	private SqlSession sessionBean;

	@Override
	public List<Tel_Plan_DTO> getPlanList(int telCode) throws Exception {
		return sessionBean.selectList("getPlanList",telCode);
	}

	@Override
	public List<Tel_Extra_DTO> getExtraList(int telCode) throws Exception {
		return sessionBean.selectList("getExtraList", telCode);
	}

	@Override
	public List<Tel_H_Product_DTO> getHomeProductList(int telCode) throws Exception {
		return sessionBean.selectList("getHomeProductList", telCode);
	}

	@Override
	public List<Tel_Plan_DTO> getDefaultPlanList(Tel_Plan_DTO tel_Plan_DTO) throws Exception {
		return sessionBean.selectList("getDefaultList", tel_Plan_DTO);
	}

	@Override
	public List<MakerProductDTO> getDefaultProductList(MakerProductDTO makerDTO) throws Exception {
		return sessionBean.selectList("getProductList", makerDTO);
	}

	@Override
	public List<DefaultDataDTO> getDefaultAllList(DefaultDataDTO defaultDataDTO) throws Exception {
		
		return sessionBean.selectList("getDefaultAllList", defaultDataDTO);
	}

	

	
	
}
