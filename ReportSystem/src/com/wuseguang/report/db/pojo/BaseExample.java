package com.wuseguang.report.db.pojo;

public class BaseExample {
	private Integer limitStart;
	private Integer limitEnd;
	private String columns;
	public String getColumns() {
		return columns;
	}
	public void setColumns(String columns) {
		this.columns = columns;
	}
	public Integer getLimitStart() {
		return limitStart;
	}
	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}
	public Integer getLimitEnd() {
		return limitEnd;
	}
	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
	}

}
