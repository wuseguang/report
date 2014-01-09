package com.wuseguang.report.servlet.person;

import com.wuseguang.report.db.pojo.Person;
import com.wuseguang.report.db.pojo.UserBase;
import com.wuseguang.report.servlet.InsertServlet;
import com.wuseguang.report.servlet.i.CompleteBean;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class PersonInsert
 */
@WebServlet(
		urlPatterns = { "/api/person/insert" }, 
		initParams = { 
				@WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.PersonMapper"),
				@WebInitParam(name="beanNames",value="person"),
				@WebInitParam(name="beanClasses",value="com.wuseguang.report.db.pojo.Person"),
				@WebInitParam(name="pojo",value="person")
		})
public class PersonInsertServlet extends InsertServlet implements CompleteBean{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PersonInsertServlet() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void completeBean(HttpServletRequest request) {
		// TODO Auto-generated method stub
		UserBase user=(UserBase) request.getSession().getAttribute("user");
		Person person=(Person) request.getAttribute("person");
		person.setPersonCreatorId(user.getId());
	}

}
