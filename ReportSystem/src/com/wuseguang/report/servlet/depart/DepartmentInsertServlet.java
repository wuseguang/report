package com.wuseguang.report.servlet.depart;

import java.util.HashMap;
import java.util.Map;

import com.wuseguang.report.db.dao.DepartmentMapper;
import com.wuseguang.report.db.pojo.Department;
import com.wuseguang.report.servlet.InsertServlet;
import com.wuseguang.report.servlet.JsonServlet;
import com.wuseguang.report.util.JsonUtil;
import com.wuseguang.report.util.MyBatisUtils;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

/**
 * Servlet implementation class DepartmentInsertServlet
 */
@WebServlet(
		urlPatterns = { "/api/depart/insert" }, 
		initParams = { 
				@WebInitParam(name = "required", value = "depart.departName,depart.departCode"), 
				@WebInitParam(name = "beanNames", value = "depart"), 
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.Department"),
				@WebInitParam(name = "pojo", value = "depart")
		})
public class DepartmentInsertServlet extends InsertServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see JsonServlet#JsonServlet()
     */
    public DepartmentInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Map json=new HashMap();
		try{
		SqlSession session = MyBatisUtils.openSession();
		DepartmentMapper dao=session.getMapper(DepartmentMapper.class);
		Department bean=(Department) request.getAttribute("depart");
		System.out.println(JsonUtil.toJson(bean));
		
		json.put("result", dao.insertSelective(bean));
		json.put("ret", true);
		session.commit();
		session.close();
		return json;
		}catch(Exception ex){
			ex.printStackTrace();
			json.put("ret", false);
			json.put("errdata",ex.getMessage());
			return json;
		}
	}

}
