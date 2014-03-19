package com.wuseguang.report.servlet.enterprise.shareholder;

import com.wuseguang.report.servlet.UpdateServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ShareholderUpdateServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/shareholder/update" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderMapper"),
				@WebInitParam(name = "beanNames", value = "shareholder"), 
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.EntShareholder"),
				@WebInitParam(name = "pojo", value = "shareholder"),
				@WebInitParam(name = "required", value = "shareholder.id,shareholder.entId")
		})
public class ShareholderUpdateServlet extends UpdateServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShareholderUpdateServlet() {
        // TODO Auto-generated constructor stub
    }

}
