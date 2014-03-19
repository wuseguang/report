package com.wuseguang.report.servlet.customer;

import com.wuseguang.report.db.pojo.Customer;
import com.wuseguang.report.db.pojo.UserBase;
import com.wuseguang.report.servlet.InsertServlet;
import com.wuseguang.report.servlet.beans.Address;
import com.wuseguang.report.servlet.i.CompleteBean;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class CustomerInsertServlet
 */
@WebServlet(urlPatterns = { "/api/customer/insert" }, initParams = {
		@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.CustomerMapper"),
		@WebInitParam(name = "required", value = "customer.customerName"),
		@WebInitParam(name = "beanNames", value = "customer,address"),
		@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.Customer,com.wuseguang.report.servlet.beans.Address"),
		@WebInitParam(name = "pojo", value = "customer") })
public class CustomerInsertServlet extends InsertServlet implements
		CompleteBean {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CustomerInsertServlet() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void completeBean(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) request.getAttribute("customer");
		Address address = (Address) request.getAttribute("address");
		customer.setCustomerAddress(address.getFullAddress());
		UserBase user = (UserBase) request.getSession().getAttribute("user");
		customer.setCustomerUserid(user.getId());
	}

}