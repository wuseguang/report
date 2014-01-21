package com.wuseguang.report.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.util.MyBatisUtils;

public abstract class SearchServlet extends JsonServlet {

	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Map json = new HashMap();
		SqlSession session = MyBatisUtils.openSession();
		try {
			BaseExample example = this.getExample(request);
			String columns = this.getColumns(request);
			example.setColumns(columns);
			String pageNumStr=request.getParameter("pageNum");
			String numPerPageStr=request.getParameter("numPerPage");
			if (pageNumStr != null && numPerPageStr != null) {
				Integer pageNum = Integer.parseInt(pageNumStr);
				Integer numPerPage = Integer.parseInt(numPerPageStr);
				example.setLimitStart(pageNum - 1);
				example.setLimitEnd(numPerPage);
			} 
			//SqlSession session = MyBatisUtils.openSession();
			String daoClassName = this.getInitParameter("daoClassName");
			Class daoClass=Class.forName(daoClassName);
			Object dao = session.getMapper(daoClass);
			Class[] parameterTypes = new Class[]{example.getClass()};
			//执行count操作
			if(request.getParameter("count")!=null){
				Method countMethod=daoClass.getMethod("countByExample", parameterTypes);
				Object totalCount=countMethod.invoke(dao, example);
				json.put("totalCount", totalCount);
			}
			//执行search操作
			if(request.getParameter("search")!=null){
				Method searchMethod=daoClass.getMethod("selectByExample", parameterTypes);
				Object searchResult=searchMethod.invoke(dao, example);
				json.put("searchResult", searchResult);
			}	
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return json;
	}
	protected String getParameterByLike(HttpServletRequest request,String key){
		String v=request.getParameter(key);
		if(v==null)
		return null;
		return "%"+v+"%";
	}
	protected abstract BaseExample getExample(HttpServletRequest request);
	protected abstract String getColumns(HttpServletRequest request);

}
