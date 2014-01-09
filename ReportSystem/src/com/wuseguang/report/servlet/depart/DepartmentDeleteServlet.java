package com.wuseguang.report.servlet.depart;

import com.wuseguang.report.servlet.DeleteServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class DepartmentDeleteServlet
 */
@WebServlet(
		urlPatterns = { "/api/depart/delete" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.DepartmentMapper"),
				@WebInitParam(name = "required", value = "id")
		})
public class DepartmentDeleteServlet extends DeleteServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DepartmentDeleteServlet() {
        // TODO Auto-generated constructor stub
    }

}
