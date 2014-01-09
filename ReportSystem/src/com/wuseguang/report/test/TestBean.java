package com.wuseguang.report.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.wuseguang.report.util.BeanUtil;
import com.wuseguang.report.util.JsonUtil;

public class TestBean {

	@Test
	public void test() throws IOException {
		//fail("Not yet implemented");
		Map<String,String[]> parameters=new HashMap<String,String[]>();
		parameters.put("depart.departName", new String[]{"hello departName"});
		Object bean=BeanUtil.createBean(parameters, "com.wuseguang.report.db.pojo.depart.Department", "depart");
		System.out.print(JsonUtil.toJson(bean));
	}

}
