package com.wuseguang.report.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.util.MyBatisUtils;

public abstract class InfoServlet extends JsonServlet {

	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.openSession();
		Map json=new HashMap();
		try {
			String columns = this.getColumns();
			String daoClassName = this.getInitParameter("daoClassName");
			Class daoClass = Class.forName(daoClassName);
			Object dao = session.getMapper(daoClass);
			Class[] parameterTypes = new Class[] { String.class,Integer.class};
			Method selectMethod=daoClass.getMethod("selectByPrimaryKey", parameterTypes);
			Object info=selectMethod.invoke(dao, columns,Integer.parseInt(request.getParameter("id")));
			json.put("info", info);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return json;
	}

	protected abstract String getColumns();

}
