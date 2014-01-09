package com.wuseguang.report.servlet.user;

import com.wuseguang.report.servlet.InsertServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class UserInsertServlet
 */
@WebServlet(
		urlPatterns = { "/api/user/insert" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.UserBaseMapper"),
				@WebInitParam(name = "beanNames", value = "userBase"), 
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.UserBase"),
				@WebInitParam(name = "pojo", value = "userBase")
		})
public class UserInsertServlet extends InsertServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserInsertServlet() {
        // TODO Auto-generated constructor stub
    }

}
