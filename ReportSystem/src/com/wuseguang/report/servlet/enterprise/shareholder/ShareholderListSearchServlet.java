package com.wuseguang.report.servlet.enterprise.shareholder;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.EntShareholderListExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class ShareholderListSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/shareholder/list" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderListMapper"),
				@WebInitParam(name = "required", value = "entid")
		})
public class ShareholderListSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShareholderListSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		EntShareholderListExample example=new EntShareholderListExample();
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
