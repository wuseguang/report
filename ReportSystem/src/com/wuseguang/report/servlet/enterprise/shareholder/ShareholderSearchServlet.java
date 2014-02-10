package com.wuseguang.report.servlet.enterprise.shareholder;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.EntShareholderExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class ShareholderInfoServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/shareholder/info" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderMapper"),
				@WebInitParam(name = "required", value = "entid")
		})
public class ShareholderSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShareholderSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		EntShareholderExample example=new EntShareholderExample();
		String entid=request.getParameter("entid");
		example.createCriteria().andEntIdEqualTo(Integer.getInteger(entid));
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
