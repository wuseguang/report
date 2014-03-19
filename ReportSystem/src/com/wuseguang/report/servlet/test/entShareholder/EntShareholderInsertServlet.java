package com.wuseguang.report.servlet.test.entShareholder;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import com.wuseguang.report.servlet.InsertServlet;

/**
 * 由CodeModel-web工具自动生成，生成时间：2014-02-24 21:03:16
 * 
 */
@WebServlet(urlPatterns = "/api/entShareholder/insert", initParams = {
		@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderMapper"),
		@WebInitParam(name = "beanNames", value = "entShareholder"),
		@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.EntShareholder"),
		@WebInitParam(name = "pojo", value = "entShareholder") })
public class EntShareholderInsertServlet extends InsertServlet {

	public EntShareholderInsertServlet() {
	}

}
