package com.wuseguang.report.servlet.depart;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.db.dao.DepartmentMapper;
import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.DepartmentExample;
import com.wuseguang.report.servlet.JsonServlet;
import com.wuseguang.report.servlet.SearchServlet;
import com.wuseguang.report.util.MyBatisUtils;

/**
 * Servlet implementation class DepartMentCodeRecmdServlet
 */
@WebServlet(
		urlPatterns={"/api/depart/coderecmd"},
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.DepartmentMapper"), 
				@WebInitParam(name = "numPerPage", value = "5"),
				@WebInitParam(name = "defaultValues", value = "depart.departCode")
		}
		)
		
public class DepartmentCodeRecmdServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentCodeRecmdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		DepartmentExample example=new DepartmentExample();
		String departCode=request.getParameter("depart.departCode");
		System.out.println("departCode:"+departCode);
		example.createCriteria().andDepartCodeLike(departCode+"%");
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,depart_code";
	}

}
