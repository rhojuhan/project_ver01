package com.project.REST.consulting.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ConsultingRepository implements ConsultingInterface{

	@Inject
	private SqlSession sql;
	
	@Override
	public void testDBCP() throws Exception {
		sql.insert("testDBCP");
	}
	
}
