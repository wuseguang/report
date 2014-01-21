package com.wuseguang.report.servlet.enterprise;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.EnterpriseChinaExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class EnterpriseSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/search" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EnterpriseChinaMapper")
		})
public class EnterpriseSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EnterpriseSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		EnterpriseChinaExample example=new EnterpriseChinaExample();
		example.createCriteria().andEnterpriseNameChLike(super.getParameterByLike(request, "entName"));
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id, enterprise_name_ch,enterprise_depart_code,enterprise_register_code,enterprise_legal_person_id";
	}

}
