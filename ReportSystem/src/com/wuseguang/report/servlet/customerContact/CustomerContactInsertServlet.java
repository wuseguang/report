package com.wuseguang.report.servlet.customerContact;

import com.wuseguang.report.servlet.InsertServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class CustomerContactInsertServlet
 */
@WebServlet(
		urlPatterns = { "/api/customerContact/insert" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.CustomerContactMapper"), 
				@WebInitParam(name = "beanNames", value = "customerContact"),
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.CustomerContact"),
				@WebInitParam(name = "pojo", value = "customerContact")
		})
public class CustomerContactInsertServlet extends InsertServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerContactInsertServlet() {
        // TODO Auto-generated constructor stub
    }

}
