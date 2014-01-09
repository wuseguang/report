package com.wuseguang.report.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.db.pojo.Department;
import com.wuseguang.report.util.JsonUtil;
import com.wuseguang.report.util.MyBatisUtils;

public abstract class UpdateServlet extends JsonServlet {

	@Override
	protected Map processRequest(HttpServletRequest request) {
		Map json = new HashMap();
		SqlSession session = MyBatisUtils.openSession();
		try {
			String daoClassName = this.getInitParameter("daoClassName");
			Class daoClass = Class.forName(daoClassName);
			Object dao = session.getMapper(daoClass);
			Object pojo = (Department) request.getAttribute(this
					.getInitParameter("pojo"));
			System.out.println(JsonUtil.toJson(pojo));
			Method updateMethod = daoClass.getMethod("updateByPrimaryKeySelective",
					new Class[] { pojo.getClass() });
			json.put("update", updateMethod.invoke(dao, pojo));
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
