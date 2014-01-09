package com.wuseguang.report.servlet.user;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.UserBaseExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class UserInDeparmentServlent
 */
@WebServlet(
		urlPatterns = { "/api/user/indepart" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.UserBaseMapper"), 
				@WebInitParam(name = "required", value = "departId")
		})
public class UserInDeparmentServlent extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserInDeparmentServlent() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Integer departId=Integer.parseInt(request.getParameter("departId"));
		UserBaseExample example=new UserBaseExample();
		example.createCriteria().andDepartIdEqualTo(departId);
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,user_name,user_code,user_sex";
	}

}
