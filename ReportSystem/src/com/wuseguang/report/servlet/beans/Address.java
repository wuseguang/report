package com.wuseguang.report.servlet.beans;

public class Address {
	private String province="";
	private String city="";
	private String address="";
	private String district="";
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFullAddress(){
		return province+city+district+address;
	}
}
