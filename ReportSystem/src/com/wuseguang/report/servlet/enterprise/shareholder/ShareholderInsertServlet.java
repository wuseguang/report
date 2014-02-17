package com.wuseguang.report.servlet.enterprise.shareholder;

import com.wuseguang.report.servlet.InsertServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ShareholderInsertServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/shareholder/add" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderListMapper"), 
				@WebInitParam(name = "beanNames", value = "shareholder"), 
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.EntShareholderList"),
				@WebInitParam(name = "pojo", value = "shareholder")
		})
public class ShareholderInsertServlet extends InsertServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShareholderInsertServlet() {
        // TODO Auto-generated constructor stub
    }

}
