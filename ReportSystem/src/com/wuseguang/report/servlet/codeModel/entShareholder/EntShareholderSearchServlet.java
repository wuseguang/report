
package com.wuseguang.report.servlet.codeModel.entShareholder;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import com.wuseguang.report.db.pojo.BaseExample;
import com.wuseguang.report.db.pojo.EntShareholderExample;
import com.wuseguang.report.servlet.SearchServlet;


/**
 * 由CodeModel-web工具自动生成，生成时间：2014-03-07 23:19:25
 * 
 */
@WebServlet(urlPatterns = "/api/entShareholder/search", initParams = {
    @WebInitParam(name = "daoClassName", value = "com.wuseguang.report.db.dao.EntShareholderMapper")
})
public class EntShareholderSearchServlet
    extends SearchServlet
{


    public EntShareholderSearchServlet() {
    }

    @Override
    protected BaseExample getExample(HttpServletRequest request) {
        EntShareholderExample example = new EntShareholderExample();
        //请填写example规则

        return example;
    }

    @Override
    protected String getColumns(HttpServletRequest request) {
        return "id,ent_id,creator_id,shareholder_currency_unit";
    }

}
