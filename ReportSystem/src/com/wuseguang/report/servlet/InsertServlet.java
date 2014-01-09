package com.wuseguang.report.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.db.dao.DepartmentMapper;
import com.wuseguang.report.db.pojo.Department;
import com.wuseguang.report.util.JsonUtil;
import com.wuseguang.report.util.MyBatisUtils;

public class InsertServlet extends JsonServlet {

	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Map json = new HashMap();
		SqlSession session = MyBatisUtils.openSession();
		try {
			
			String daoClassName = this.getInitParameter("daoClassName");
			Class daoClass = Class.forName(daoClassName);
			Object dao = session.getMapper(daoClass);
			Object pojo = request.getAttribute(this
					.getInitParameter("pojo"));
			System.out.println(JsonUtil.toJson(pojo));
			Method insertMethod = daoClass.getMethod("insertSelective",
					new Class[] { pojo.getClass() });
			json.put("info", insertMethod.invoke(dao, pojo));
			json.put("ret", true);
			session.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			json.put("ret", false);
			json.put("errdata", ex.getMessage());
		}finally{
			session.close();
		}
		return json;
	}

}
