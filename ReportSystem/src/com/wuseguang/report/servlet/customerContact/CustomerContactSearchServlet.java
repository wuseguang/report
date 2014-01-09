package com.wuseguang.report.servlet.customerContact;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.CustomerContactExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class CustomerContactSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/customerContact/search" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.CustomerContactMapper")
		})
public class CustomerContactSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerContactSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		CustomerContactExample example=new CustomerContactExample();
		Integer customerId=request.getParameter("customerId")==null?null:Integer.parseInt(request.getParameter("customerId"));
		example.createCriteria()
		.andCustomerIdEqualTo(customerId)
		.andCustomerContactNameEqualTo(request.getParameter("customerContactName"));
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,customer_id,customer_contact_name,customer_contact_mobile";
	}

}
