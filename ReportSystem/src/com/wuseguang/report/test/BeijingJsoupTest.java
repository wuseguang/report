package com.wuseguang.report.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.wuseguang.report.extractor.BeijingExtractor;

public class BeijingJsoupTest {

	@Test
	public void test() throws IOException {
		new BeijingExtractor().extractEnterprise("http://211.94.187.236/xycx/queryCreditAction!qyxq_view.dhtml?reg_bus_ent_id=DCBB0FD56D324C87AD672F5D35EA3437");
		//.listEnterprise("联想", null);
		//String name=new String("公司".getBytes("utf-8"),"gbk");
//		String name =URLEncoder.encode("公司","utf8");
//		System.out.println(name);
//		//String name="百度";
//		Document doc = Jsoup.connect("http://qyxy.baic.gov.cn/lucene/luceneAction!NetCreditLucene.dhtml?queryStr=%E7%99%BE%E5%BA%A6")
//						.header("Host", "qyxy.baic.gov.cn")
//						.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
//						.get();
//		Elements companys=doc.select(".cx00");
//		for(Element company :companys){
//			Element a=company.getElementsByTag("a").first();
//			String compantyId=a.attr("onclick");
//			System.out.println(compantyId.split("'")[1]);
//		}
						//.data("name",name)
						//.post();
		//System.out.print(doc.html());
	}

}
