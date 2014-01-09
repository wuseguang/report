package com.wuseguang.report.servlet.enterprise;

import com.wuseguang.report.servlet.InsertServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class EnterpriseInsertServlet
 */
@WebServlet(
		urlPatterns = { "/api/enterprise/insert_ch" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EnterpriseChinaMapper"), 
				@WebInitParam(name = "beanNames", value = "enterprise"), 
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.EnterpriseChina"), 
				@WebInitParam(name = "pojo", value = "enterprise")
		})
public class EnterpriseChinaInsertServlet extends InsertServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EnterpriseChinaInsertServlet() {
        // TODO Auto-generated constructor stub
    }

}
