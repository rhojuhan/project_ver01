package com.project.main;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.REST.consulting.DAO.ConsultingInterface;
import com.project.REST.consulting.DAO.ConsultingRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class TEST_JDBC {
	
	@Inject
	private SqlSession sql;
	
	@Inject
	private ConsultingInterface con;
	
	@Test
	public void test()throws Exception{
		
		con.testDBCP();
		System.out.println("오잉~!");
	}
}
