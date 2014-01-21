package com.wuseguang.report.servlet.enterprise;

import com.wuseguang.report.servlet.InfoServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class EnterpriseInfoServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/info" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EnterpriseChinaMapper")
		})
public class EnterpriseInfoServlet extends InfoServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EnterpriseInfoServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected String getColumns() {
		// TODO Auto-generated method stub
		return "id, enterprise_name_ch,enterprise_depart_code,enterprise_register_code,enterprise_legal_person_id,enterprise_business_scope";
	}

}
