package com.wuseguang.report.servlet.user;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.UserBaseExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class UserCodeRecmdServlet
 */
@WebServlet(
		urlPatterns = { "/api/user/coderecmd" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.UserBaseMapper"),
				@WebInitParam(name = "defaultValues", value = "userBase.userCode"),

		})
public class UserCodeRecmdServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserCodeRecmdServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		UserBaseExample example=new UserBaseExample();
		example.createCriteria().andUserCodeLike(request.getParameter("userBase.userCode")+"%");
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "user_code";
	}

}
