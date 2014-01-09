package com.wuseguang.report.servlet.person;

import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.PersonExample;
import com.wuseguang.report.servlet.SearchServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class PersonSearchServlet
 */
@WebServlet(
		urlPatterns = { "/api/person/search" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.PersonMapper")
		})
public class PersonSearchServlet extends SearchServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PersonSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected BaseExample getExample(HttpServletRequest request) {
		// TODO Auto-generated method stub
		PersonExample example=new PersonExample();
		String personName=request.getParameter("personName");
		if(personName!=null)personName="%"+personName+"%";
		example.createCriteria().andPersonNameLike(personName);
		return example;
	}

	@Override
	protected String getColumns(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "id,person_name,person_region,person_idcard,person_creator_id,person_sex";
	}

}
