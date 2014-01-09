package com.wuseguang.report.extractor;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ExtractorInterface {
	List listEnterprise(String entName,String registeredNumber) throws IOException;
	Map extractEnterprise(String entUri) throws IOException;
}
