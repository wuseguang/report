package com.wuseguang.report.servlet.depart;

import java.util.HashMap;
import java.util.Map;

import com.wuseguang.report.db.dao.DepartmentMapper;
import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.DepartmentExample;
import com.wuseguang.report.servlet.JsonServlet;
import com.wuseguang.report.servlet.SearchServlet;
import com.wuseguang.report.util.MyBatisUtils;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

/**
 * Servlet implementation class DepartmentNameRecmdServlet
 */
@WebServlet(
		urlPatterns = { "/api/depart/namerecmd" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.DepartmentMapper")
		})
public class DepartmentNameRecmdServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see JsonServlet#JsonServlet()
     */
    public DepartmentNameRecmdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		DepartmentExample example=new DepartmentExample();
		example.createCriteria().andDepartNameLike(request.getParameter("depart.departName")+"%");
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,depart_name";
	}

}
