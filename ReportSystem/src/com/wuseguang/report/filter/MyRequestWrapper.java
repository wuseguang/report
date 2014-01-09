package com.wuseguang.report.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequestWrapper extends HttpServletRequestWrapper {
	private HttpServletRequest req;
	public MyRequestWrapper(HttpServletRequest request) {
		super(request);
		this.req=request;
		// TODO Auto-generated constructor stub
	}
	public String getParameter(String name){
		String value=super.getParameter(name);
		String defaultValue=req.getAttribute(name)==null?null:(String)req.getAttribute(name);
		if(value==null)return defaultValue;
		value=value.trim();
		if(value.isEmpty())return defaultValue;
		return value;
	}

}
