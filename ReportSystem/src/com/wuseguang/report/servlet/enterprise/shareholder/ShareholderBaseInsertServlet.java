package com.wuseguang.report.servlet.enterprise.shareholder;

import com.wuseguang.report.db.pojo.EntShareholder;
import com.wuseguang.report.db.pojo.Person;
import com.wuseguang.report.db.pojo.UserBase;
import com.wuseguang.report.servlet.InsertServlet;
import com.wuseguang.report.servlet.i.CompleteBean;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class ShareholderBaseInsertServlet
 */
@WebServlet(
		urlPatterns = { "/api/ent/shareholder/base_add" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderMapper"), 
				@WebInitParam(name = "beanNames", value = "shareholder"), 
				@WebInitParam(name = "beanClasses", value = "com.wuseguang.report.db.pojo.EntShareholder"),
				@WebInitParam(name = "pojo", value = "shareholder")
		})
public class ShareholderBaseInsertServlet extends InsertServlet implements CompleteBean{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShareholderBaseInsertServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void completeBean(HttpServletRequest request) {
		// TODO Auto-generated method stub
		UserBase user=(UserBase) request.getSession().getAttribute("user");
		EntShareholder shareholder=(EntShareholder) request.getAttribute("shareholder");
		shareholder.setCreatorId(user.getId());
	}

}
