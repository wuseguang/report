package com.wuseguang.report.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;




import com.wuseguang.report.util.JsonUtil;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(description = "过滤非登陆用户", urlPatterns = { "/api/*" })
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		 HttpServletRequest _request = (HttpServletRequest) request;  
		 
		 HttpSession session = _request.getSession(); 
		 Boolean islogin=session.getAttribute("islogin")!=null&&(Boolean) session.getAttribute("islogin");
		 if(islogin&&session.getAttribute("user")!=null){
			 chain.doFilter(request, response);
			 return;
		 }
		// pass the request along the filter chain
		Map json=new HashMap();
		json.put("err", true);
		json.put("errcode", "notlogin");
		json.put("notlogin", true);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print(JsonUtil.toJson(json));
		out.flush();
		out.close();
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
