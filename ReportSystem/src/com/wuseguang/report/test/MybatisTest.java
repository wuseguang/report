package com.wuseguang.report.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wuseguang.report.db.dao.DepartmentMapper;
import com.wuseguang.report.db.pojo.Department;
import com.wuseguang.report.util.MyBatisUtils;

public class MybatisTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		SqlSession session = MyBatisUtils.openSession();
		try{
		
		DepartmentMapper dao=session.getMapper(DepartmentMapper.class);
		Department model=new Department();
		model.setDepartName("研发部");
		model.setDepartCode("AB");
		model.setDepartContact(22);
		model.setDepartPhone("13854687965");
		model.setDepartAddress("工业路3号");
		dao.insert(model);
		//System.out.println(dao.codeRecmd("A"));
		session.commit();
		}finally{
			session.close();
		}
	}

}
