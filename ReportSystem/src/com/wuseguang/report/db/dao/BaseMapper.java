package com.wuseguang.report.db.dao;

import com.wuseguang.report.db.pojo.BaseExample;

public interface BaseMapper {
	public abstract Object selectByExample(BaseExample e);
}
