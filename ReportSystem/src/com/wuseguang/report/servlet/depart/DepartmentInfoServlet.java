package com.wuseguang.report.servlet.depart;

import com.wuseguang.report.servlet.InfoServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class DepartmentInfoServlet
 */
@WebServlet(
		urlPatterns = { "/api/depart/info" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.DepartmentMapper"),
				@WebInitParam(name = "required", value = "id")
		})
public class DepartmentInfoServlet extends InfoServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DepartmentInfoServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	@Override
	protected String getColumns() {
		// TODO Auto-generated method stub
		return  "id, depart_name, depart_code, depart_address, depart_time";
	}

}
