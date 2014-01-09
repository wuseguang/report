package com.wuseguang.report.util;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 mybatis工具类，提供openSesison，对外提供SqlSession对象。
 将此对象的构造过程隐藏起来，SqlSessionFactory对象，只需要在类加载时创建出来就OK了。
 需要指定mybatis的配置文件xml的路径或相应的字节流或字符流。
 
 这里用字节流InputStream，采用类加载器的方式来获取输入字节流。
 * @author 陈淑飞
 * @time Oct 6, 2012
 */
public class MyBatisUtils {

	private static SqlSessionFactory factory ;
	
	static{
		InputStream in = MyBatisUtils.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		factory = new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
		return factory;
	}
	
	/**
	 返回一个SqlSession对象(每次返回一个新的SqlSession对象)
	 若涉及多个表的操作，涉及事务的，要做到操作失败时回滚，那么建议自定义一个TransactionUtils的工具类
	 用ThreadLocal类来保存SqlSession类，这样跨多个dao操作时，确保获取的都是同一SqlSession对象。然后在service层中捕获异常，再catch上用session的回滚。
	 * @return
	 */
	public static SqlSession openSession(){
		return factory.openSession();
	}
	
}