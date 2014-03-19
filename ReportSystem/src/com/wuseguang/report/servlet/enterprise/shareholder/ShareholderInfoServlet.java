package com.wuseguang.report.servlet.enterprise.shareholder;

import com.wuseguang.report.servlet.InfoServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ShareholderInfoServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/shareholder/info" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "")
		})
public class ShareholderInfoServlet extends InfoServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShareholderInfoServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected String getColumns() {
		// TODO Auto-generated method stub
		return null;
	}

}
