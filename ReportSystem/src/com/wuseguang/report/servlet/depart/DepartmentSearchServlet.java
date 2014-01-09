package com.wuseguang.report.servlet.depart;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.DepartmentExample;
import com.wuseguang.report.db.pojo.DepartmentExample.Criteria;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class DepartmentSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/depart/search" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.DepartmentMapper"), 
				@WebInitParam(name = "searchColumns", value = "id, depart_name, depart_code, depart_address, depart_time"), 
				@WebInitParam(name = "viewColumns", value = "部门名称,部门编码,部门地址,创建时间"),
				@WebInitParam(name = "numPerPage", value = "5")
				
		})
public class DepartmentSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DepartmentSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		DepartmentExample example=new DepartmentExample();
		Criteria criteria =example.createCriteria();
		String departName=request.getParameter("departName");
		String departCode=request.getParameter("departCode");
		if(departName!=null)
		criteria.andDepartNameEqualTo(departName);
		if(departCode!=null)
		criteria.andDepartCodeEqualTo(departCode);
		//request.getp
		//example.
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id, depart_name, depart_code, depart_address, depart_time";
	}

}
