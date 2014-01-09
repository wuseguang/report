package com.wuseguang.report.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class JsoupTest {

	@Test
	public void test() throws IOException {
		String name=new String("公司".getBytes("utf-8"),"gbk");
		name =URLEncoder.encode("公司","GBK");
		System.out.println(name);
		Document doc = Jsoup.connect("http://gzhd.saic.gov.cn/gszj/chaxun/listQyName1.jsp?name="+name).get();
						//.data("name",name)
						//.post();
		System.out.print(doc.html());
		//fail("Not yet implemented");
	}

}
