package com.wuseguang.report.servlet.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import com.wuseguang.report.servlet.InfoServlet;
import com.wuseguang.report.servlet.JsonServlet;

/**
 * Servlet implementation class UserInfoServlet
 */
@WebServlet(
		urlPatterns = { "/api/user/info" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.UserBaseMapper"),
				@WebInitParam(name = "required", value = "id")
		})
public class UserInfoServlet extends InfoServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see JsonServlet#JsonServlet()
     */
    public UserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected String getColumns() {
		// TODO Auto-generated method stub
		return "id,user_name,user_code,user_email,user_idcard,user_sex,depart_id";
	}

}
