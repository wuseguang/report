package com.wuseguang.report.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.db.pojo.Department;
import com.wuseguang.report.util.JsonUtil;
import com.wuseguang.report.util.MyBatisUtils;

public class DeleteServlet extends JsonServlet {

	@Override
	protected Map processRequest(HttpServletRequest request) {
		Map json = new HashMap();
		try {
			SqlSession session = MyBatisUtils.openSession();
			String daoClassName = this.getInitParameter("daoClassName");
			Class daoClass = Class.forName(daoClassName);
			Object dao = session.getMapper(daoClass);
			Method deleteMethod = daoClass.getMethod("deleteByPrimaryKey",
					new Class[] { Integer.class});
			Integer id=Integer.parseInt(request.getParameter("id"));
			json.put("delete", deleteMethod.invoke(dao, id));
			json.put("ret", true);
			session.commit();
			session.close();
			return json;
		} catch (Exception ex) {
			ex.printStackTrace();
			json.put("ret", false);
			json.put("errdata", ex.getMessage());
			return json;
		}
	}

}
