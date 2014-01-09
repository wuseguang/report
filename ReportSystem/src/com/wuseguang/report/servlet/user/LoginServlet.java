package com.wuseguang.report.servlet.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.wuseguang.report.db.dao.UserBaseMapper;
import com.wuseguang.report.db.pojo.UserBase;
import com.wuseguang.report.db.pojo.UserBaseExample;
import com.wuseguang.report.servlet.JsonServlet;
import com.wuseguang.report.util.MyBatisUtils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/login" }, 
		initParams = { 
				@WebInitParam(name = "required", value = "userCode,userPassword")

		})
public class LoginServlet extends JsonServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see JsonServlet#JsonServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Map json=new HashMap();
		json.put("ret", false);
		request.getSession().setAttribute("islogin", false);
		//while(request.getphasMoreElements())
		//System.out.println(request.getAttributeNames().nextElement());
		SqlSession sqlSession =MyBatisUtils.openSession();
		UserBaseExample example=new UserBaseExample();
		example.createCriteria().andUserCodeEqualTo(request.getParameter("userCode")).andUserPasswordEqualTo(request.getParameter("userPassword"));
		UserBaseMapper dao=sqlSession.getMapper(UserBaseMapper.class);
		List<UserBase> r=dao.selectByExample(example);
		if(r.size()==0){
			json.put("msg", "密码错误");
			return json;
		}
		json.put("ret", true);
		request.getSession().setAttribute("islogin", true);
		request.getSession().setAttribute("user", r.get(0));
		request.getSession().setAttribute("role", "manager");
		return json;
	}

}
