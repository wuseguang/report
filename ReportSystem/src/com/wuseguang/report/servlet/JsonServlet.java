package com.wuseguang.report.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuseguang.report.servlet.i.CompleteBean;
import com.wuseguang.report.util.BeanUtil;
import com.wuseguang.report.util.JsonUtil;

/**
 * Servlet implementation class JsonServlet
 */

public abstract class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String[] pageParameters={"pageNum","numPerPage","orderField","orderDirection"};
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected abstract Map processRequest(HttpServletRequest request);
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(!filterRequired(request,response))return;
		setDefaultValue(request);
		createBean(request);
		if(this instanceof CompleteBean){
			((CompleteBean)this).completeBean(request);
		}
		//createSearch(request);
		// request.getp
		Map json=this.processRequest(request);
		json.put("url", request.getRequestURI());
		String jstr=JsonUtil.toJson(json);
		response.setHeader("Content-type", "application/json;charset=UTF-8");  
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print(JsonUtil.toJson(json));
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}
	private void createSearch(HttpServletRequest request){
		//request.
		Map<String,String> searchMap=new HashMap<String,String>();
		for(String p:pageParameters)
			searchMap.put(p, request.getParameter(p));
		for(Entry<String,String[]> entry:request.getParameterMap().entrySet()){
			String key=entry.getKey();
			String []values=entry.getValue();
			String value=values==null||values.length==0?null:values[0];
			if(!key.startsWith("search."))continue;
			searchMap.put(key.substring(6), value);
		}
		if(searchMap.containsKey("orderField")&&!searchMap.containsKey("orderDirection"))
			searchMap.put("orderDirection", "ASC");
		request.setAttribute("searchMap", searchMap);
	}
	private void createBean(HttpServletRequest request){
		String beanNames=this.getInitParameter("beanNames");
		if(beanNames==null||beanNames.trim().isEmpty())return;
		String beanClasses=this.getInitParameter("beanClasses");
		String[] beanNameArray=beanNames.split(",");
		String[] beanClassNameArray=beanClasses.split(",");
		for(int i=0;i<beanNameArray.length;i++){
			String beanName=beanNameArray[i];
			String beanClassName=beanClassNameArray[i];
			request.setAttribute(beanName, BeanUtil.createBean(request.getParameterMap(), beanClassName, beanName));
		}
	}
	private boolean filterRequired(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String required=this.getInitParameter("required");
		 //System.out.println("servlet_name:"+request.getServletContext().getServletContextName());
		 //System.out.println("required:"+required);
		if(required==null)return true;
		List<String> noList=new ArrayList<String>();
		for(String key:required.split(",")){
			 if(request.getParameter(key)!=null&&request.getParameter(key).trim().length()>0)continue;
			 noList.add(key); 
		 };
		if(noList.isEmpty())return true;
		Map json=new HashMap();
		json.put("err", true);
		json.put("errcode", "IncompleteParameter");
		json.put("errdata", noList);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print(JsonUtil.toJson(json));
		out.flush();
		out.close();
		return false;
	}
	private void setDefaultValue(HttpServletRequest request){
		String defaultValues=this.getInitParameter("defaultValues");
		if(defaultValues==null)return;
		String[] configs=defaultValues.split(",");
		for(String config:configs){
			String [] kv=config.split(":");
			if(kv.length==0)continue;
			String k=kv.length==1?config:kv[0];
			String v=kv.length==1?"":kv[1];
			request.setAttribute(k, v);
		}
	}

}
