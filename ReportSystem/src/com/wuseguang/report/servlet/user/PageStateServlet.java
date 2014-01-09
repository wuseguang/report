package com.wuseguang.report.servlet.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import com.wuseguang.report.db.pojo.UserBase;
import com.wuseguang.report.servlet.JsonServlet;

/**
 * Servlet implementation class PageStateServlet
 */
@WebServlet("/api/page_state")
public class PageStateServlet extends JsonServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see JsonServlet#JsonServlet()
     */
    public PageStateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		UserBase user=(UserBase) request.getSession().getAttribute("user");
		String role=(String) request.getSession().getAttribute("role");
		Map json=new HashMap();
		json.put("username", user.getUserName());
		json.put("role", role);
		return json;
	}

}
