package com.wuseguang.report.extractor;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.wuseguang.report.util.JsonUtil;

public class BeijingExtractor implements ExtractorInterface {

	@Override
	public List listEnterprise(String entName, String registeredNumber)
			throws IOException {
		// TODO Auto-generated method stub
		List result = new ArrayList();
		String queryStr = entName == null ? registeredNumber : entName;
		String url = "http://qyxy.baic.gov.cn/lucene/luceneAction!NetCreditLucene.dhtml?queryStr="
				+ URLEncoder.encode(queryStr, "utf8");
		Document doc = Jsoup
				.connect(url)
				.header("Host", "qyxy.baic.gov.cn")
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
				.timeout(3000).get();
		Elements companys = doc.select(".cx00");
		for (Element company : companys) {
			Element a = company.getElementsByTag("a").first();
			String compantyUri = a.attr("onclick").split("'")[1];
			if (compantyUri.length() < 10)
				continue;
			String compantyUrl = "http://qyxy.baic.gov.cn"
					+ compantyUri.replace("&flagScztdj=flagScztdj", "");
			String compantyName = a.text();
			int beginIndex = compantyName.lastIndexOf("（");
			if (beginIndex < 0)
				continue;
			Map compantyInfo = new HashMap();
			String compantyType = compantyName.substring(beginIndex + 1,
					compantyName.length() - 1);
			compantyName = compantyName.substring(0, beginIndex);
			System.out.println(compantyName + ":" + compantyType);
			company.child(0).remove();
			String info = company.text();
			String[] infoArray = info.replaceAll("，", "").split(
					"注册号：|法定代表人：|法定代表人姓名：|住所：|一般经营项目：|经营者姓名：|经营场所：");
			// System.out.println(info);
			compantyInfo.put("enterpriseName", compantyName);
			compantyInfo.put("enterpriseState", compantyType);
			compantyInfo.put("enterpriseRegisterCode", infoArray[1].trim());
			compantyInfo.put("enterpriseLegalPerson", infoArray[2].trim());
			compantyInfo.put("enterpriseAddress", infoArray[3].trim());
			compantyInfo.put("enterpriseUrl", compantyUrl);
			System.out.println(compantyUrl);
			result.add(compantyInfo);
			// for(String i:infoArray)
			// System.out.println(i.trim());
		}
		return result;
	}

	@Override
	public Map extractEnterprise(String entUri) throws IOException {
		// TODO Auto-generated method stub
		Map info = new HashMap();
		Document doc = Jsoup
				.connect(entUri)
				.header("Host", "qyxy.baic.gov.cn")
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
				.timeout(3000).get();
		Element container = doc.select(".jic").first();
		// 三个table
		Element gongShangContainer = container.select(
				"table:contains(工商登记注册基本信息)").first();
		if (gongShangContainer != null)
			gongShangContainer = gongShangContainer.nextElementSibling();
		Element zuzhiContainer = container.select("table:contains(组织机构代码信息)")
				.first();
		if (zuzhiContainer != null)
			zuzhiContainer = zuzhiContainer.nextElementSibling();
		Element shuiwuContainer = container.select("table:contains(税务登记信息)")
				.first();
		if (shuiwuContainer != null)
			shuiwuContainer = shuiwuContainer.nextElementSibling();

		// ////////////////////
		String updateTime = container.select("table").first().select("div")
				.text();
		// Elements trs=tables.get(1).select("tr");
		String name = this.getValueByLabel("名称：", gongShangContainer);
		String registerCode = this.getValueByLabel("注册号：", gongShangContainer);
		String address = this.getValueByLabel("住所：", gongShangContainer);
		String legalPerson = this.getValueByLabel("法定代表人姓名：",
				gongShangContainer);
		String stockholder = this.getValueByLabel("股东（发起人）：",
				gongShangContainer);
		String registerCapital = this.getValueByLabel("注册资本：",
				gongShangContainer);

		String paidinCapital = this.getValueByLabel("实收资本 ：",
				gongShangContainer);
		String enterpriseType = this.getValueByLabel("公司类型：",
				gongShangContainer);
		String enterpriseState = this.getValueByLabel("企业状态 ：",
				gongShangContainer);
		String certifiedBusiness = this.getValueByLabel("许可经营项目：",
				gongShangContainer);
		String generalBusiness = this.getValueByLabel("一般经营项目：",
				gongShangContainer);
		String businessScopRemark = this.getValueByLabel("经营范围项下标注：",
				gongShangContainer);
		String businessStart = this.getValueByLabel("营业期限自：",
				gongShangContainer);
		String businessEnd = this.getValueByLabel("营业期限至：", gongShangContainer);
		String createTime = this.getValueByLabel("成立日期：", gongShangContainer);
		String registerDepart = this.getValueByLabel("登记机关：",
				gongShangContainer);
		String departCode = this.getValueByLabel("组织机构代码：", zuzhiContainer);
		String jurisdictionDepart = this.getValueByLabel("代码证颁发机关：",
				zuzhiContainer);
		String taxCodeLocal=this.getValueByLabel("地税登记证号：", shuiwuContainer);
		info.put("updateTime", updateTime);
		info.put("name", name);

		info.put("registerCode", registerCode);
		info.put("address", address);
		info.put("legalPerson", legalPerson);

		info.put("stockholder", stockholder);

		info.put("registerCapital", registerCapital);

		info.put("paidinCapital", paidinCapital);

		info.put("enterpriseType", enterpriseType);

		info.put("enterpriseState", enterpriseState);

		info.put("certifiedBusiness", certifiedBusiness);

		info.put("generalBusiness", generalBusiness);

		info.put("businessScopRemark", businessScopRemark);

		info.put("businessStart", businessStart);
		info.put("businessEnd", businessEnd);
		info.put("businessStart", businessStart);
		info.put("createTime", createTime);
		info.put("registerDepart", registerDepart);
		info.put("departCode", departCode);
		info.put("jurisdictionDepart", jurisdictionDepart);
		info.put("taxCodeLocal", taxCodeLocal);
		System.out.println(JsonUtil.toJson(info));
		return info;
	}

	private String getValueByLabel(String label, Element container) {
		String value = "";
		String space = "\\s*";
		String reg = "";
		for (String c : label.split(""))
			reg += c + space;
		// System.out.println(reg);
		String selector = "td:matches(^#reg#$)".replace("#reg#", reg);
		// System.out.println(selector);
		try {
			value = container.select(selector).first().nextElementSibling()
					.text();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		return value;
	}
}
