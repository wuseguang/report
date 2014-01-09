package com.wuseguang.report.servlet.extractor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.wuseguang.report.extractor.BeijingExtractor;
import com.wuseguang.report.extractor.ExtractorInterface;
import com.wuseguang.report.servlet.JsonServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class EnterpriseExtractorServlet
 */
@WebServlet("/api/entExtractor")
public class EnterpriseExtractorServlet extends JsonServlet {
	private static final long serialVersionUID = 1L;
    private Map<String,ExtractorInterface> extractorMap=new HashMap<String,ExtractorInterface>();
    /**
     * @see JsonServlet#JsonServlet()
     */
    public EnterpriseExtractorServlet() {
        super();
        // TODO Auto-generated constructor stub
        extractorMap.put("beijing", new BeijingExtractor());
    }
    private Map listEnterprise(ExtractorInterface extractor,HttpServletRequest request){
    	Map result=new HashMap();
    	String entName=request.getParameter("entName");
		String entCode=request.getParameter("entCode");
		try {
			result.put("searchResult", extractor.listEnterprise(entName, entCode));
			result.put("ret", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("ret", false);
		}
		return result;
    }
    private Map extractEnterprise(ExtractorInterface extractor,HttpServletRequest request){
    	Map result=new HashMap();
    	String entUrl=request.getParameter("entUrl");
    	try {
			result.put("info", extractor.extractEnterprise(entUrl));
			result.put("ret", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("ret", false);
		}
    	return result;
    }
	@Override
	protected Map processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ExtractorInterface extractor=this.extractorMap.get(request.getParameter("extractorName"));
		String type=request.getParameter("extractorType");
		if(type.equals("list"))return this.listEnterprise(extractor, request);
		return this.extractEnterprise(extractor, request);
	}

}
