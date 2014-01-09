package com.wuseguang.report.util;
import java.io.IOException;





import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtil {
	public static ObjectMapper mapper = new ObjectMapper();
	static {
	    //默认设置
	    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    mapper.setSerializationInclusion(Include.NON_NULL);
	    //_mapper.setFilters(new SimpleFilterProvider().setFailOnUnknownId(false));
		// 设置默认日期格式
	    //_mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm-ss S"));  
    }
	public static String toJson(Object obj) throws IOException{
		return mapper.writeValueAsString(obj);
	}
	public static <T> T toObject(String json, Class<T> cls) throws IOException{
		return mapper.readValue(json, cls);
	}
}
