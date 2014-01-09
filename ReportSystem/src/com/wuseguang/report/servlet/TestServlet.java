package com.wuseguang.report.servlet;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/api/test")
public class TestServlet extends JsonServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Map json=new HashMap();
		json.put("test", "测试页面");
		return json;
	}

}
