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
import com.project.REST.consulting.Service.ConsultingService;
import com.project.REST.consulting.Service.CosultingServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class TEST_JDBC {
	
	@Inject
	private SqlSession sql;
	
	@Inject
	private ConsultingInterface con;
	
	@Inject
	private CosultingServiceInterface con1;
//	@Test
//	public void test()throws Exception{
//		con.testDBCP();
//		System.out.println("오잉~!");
//	}
//	@Test 
//	public void test1()throws Exception{
//		con1.testInsert();
//		System.out.println("ok~");
//	}
//	@Test
//	public void test2()throws Exception{
//		System.out.println(con.getPlanList(2004));
//		System.out.println(con.getExtraList(2004));
//		System.out.println(con.getHomeProductList(2004));
//		System.out.println(con1.getPlanInfor(2004));
//	}
	@Test 
	public void test3()throws Exception{
		System.out.println(con.getDefaultList(3012));
	}
}
