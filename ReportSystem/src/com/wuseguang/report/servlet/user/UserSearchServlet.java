package com.wuseguang.report.servlet.user;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.UserBaseExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class UserSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/user/search" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.UserBaseMapper")

		})
public class UserSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		UserBaseExample example=new UserBaseExample();
		example.createCriteria().andUserCodeEqualTo(request.getParameter("userCode"))
		.andUserNameEqualTo(request.getParameter("userName"));
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,user_name,user_code,depart_id,user_idcard";
	}

}
