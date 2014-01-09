package com.wuseguang.report.servlet.customer;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.CustomerExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class CustomerSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/customer/search" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.CustomerMapper")
		})
public class CustomerSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		CustomerExample example=new CustomerExample();
		example.createCriteria().andCustomerNameEqualTo(request.getParameter("customerName"));
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,customer_name,customer_address,customer_telphone,customer_userid,customer_web";
	}

}
