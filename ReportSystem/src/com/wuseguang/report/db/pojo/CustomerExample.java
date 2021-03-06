package com.wuseguang.report.db.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample extends BaseExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public CustomerExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null)
				return;
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null)
				return;
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null)
				return;
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCustomerNameIsNull() {
			addCriterion("customer_name is null");
			return (Criteria) this;
		}

		public Criteria andCustomerNameIsNotNull() {
			addCriterion("customer_name is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerNameEqualTo(String value) {
			addCriterion("customer_name =", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameNotEqualTo(String value) {
			addCriterion("customer_name <>", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameGreaterThan(String value) {
			addCriterion("customer_name >", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
			addCriterion("customer_name >=", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameLessThan(String value) {
			addCriterion("customer_name <", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameLessThanOrEqualTo(String value) {
			addCriterion("customer_name <=", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameLike(String value) {
			addCriterion("customer_name like", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameNotLike(String value) {
			addCriterion("customer_name not like", value, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameIn(List<String> values) {
			addCriterion("customer_name in", values, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameNotIn(List<String> values) {
			addCriterion("customer_name not in", values, "customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameBetween(String value1, String value2) {
			addCriterion("customer_name between", value1, value2,
					"customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerNameNotBetween(String value1, String value2) {
			addCriterion("customer_name not between", value1, value2,
					"customerName");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeIsNull() {
			addCriterion("customer_type is null");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeIsNotNull() {
			addCriterion("customer_type is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeEqualTo(String value) {
			addCriterion("customer_type =", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeNotEqualTo(String value) {
			addCriterion("customer_type <>", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeGreaterThan(String value) {
			addCriterion("customer_type >", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
			addCriterion("customer_type >=", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeLessThan(String value) {
			addCriterion("customer_type <", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
			addCriterion("customer_type <=", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeLike(String value) {
			addCriterion("customer_type like", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeNotLike(String value) {
			addCriterion("customer_type not like", value, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeIn(List<String> values) {
			addCriterion("customer_type in", values, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeNotIn(List<String> values) {
			addCriterion("customer_type not in", values, "customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeBetween(String value1, String value2) {
			addCriterion("customer_type between", value1, value2,
					"customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerTypeNotBetween(String value1, String value2) {
			addCriterion("customer_type not between", value1, value2,
					"customerType");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressIsNull() {
			addCriterion("customer_address is null");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressIsNotNull() {
			addCriterion("customer_address is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressEqualTo(String value) {
			addCriterion("customer_address =", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressNotEqualTo(String value) {
			addCriterion("customer_address <>", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressGreaterThan(String value) {
			addCriterion("customer_address >", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
			addCriterion("customer_address >=", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressLessThan(String value) {
			addCriterion("customer_address <", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
			addCriterion("customer_address <=", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressLike(String value) {
			addCriterion("customer_address like", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressNotLike(String value) {
			addCriterion("customer_address not like", value, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressIn(List<String> values) {
			addCriterion("customer_address in", values, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressNotIn(List<String> values) {
			addCriterion("customer_address not in", values, "customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressBetween(String value1, String value2) {
			addCriterion("customer_address between", value1, value2,
					"customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerAddressNotBetween(String value1,
				String value2) {
			addCriterion("customer_address not between", value1, value2,
					"customerAddress");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeIsNull() {
			addCriterion("customer_zipcode is null");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeIsNotNull() {
			addCriterion("customer_zipcode is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeEqualTo(String value) {
			addCriterion("customer_zipcode =", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeNotEqualTo(String value) {
			addCriterion("customer_zipcode <>", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeGreaterThan(String value) {
			addCriterion("customer_zipcode >", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeGreaterThanOrEqualTo(String value) {
			addCriterion("customer_zipcode >=", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeLessThan(String value) {
			addCriterion("customer_zipcode <", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeLessThanOrEqualTo(String value) {
			addCriterion("customer_zipcode <=", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeLike(String value) {
			addCriterion("customer_zipcode like", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeNotLike(String value) {
			addCriterion("customer_zipcode not like", value, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeIn(List<String> values) {
			addCriterion("customer_zipcode in", values, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeNotIn(List<String> values) {
			addCriterion("customer_zipcode not in", values, "customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeBetween(String value1, String value2) {
			addCriterion("customer_zipcode between", value1, value2,
					"customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerZipcodeNotBetween(String value1,
				String value2) {
			addCriterion("customer_zipcode not between", value1, value2,
					"customerZipcode");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneIsNull() {
			addCriterion("customer_telphone is null");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneIsNotNull() {
			addCriterion("customer_telphone is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneEqualTo(String value) {
			addCriterion("customer_telphone =", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneNotEqualTo(String value) {
			addCriterion("customer_telphone <>", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneGreaterThan(String value) {
			addCriterion("customer_telphone >", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneGreaterThanOrEqualTo(String value) {
			addCriterion("customer_telphone >=", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneLessThan(String value) {
			addCriterion("customer_telphone <", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneLessThanOrEqualTo(String value) {
			addCriterion("customer_telphone <=", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneLike(String value) {
			addCriterion("customer_telphone like", value, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneNotLike(String value) {
			addCriterion("customer_telphone not like", value,
					"customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneIn(List<String> values) {
			addCriterion("customer_telphone in", values, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneNotIn(List<String> values) {
			addCriterion("customer_telphone not in", values, "customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneBetween(String value1, String value2) {
			addCriterion("customer_telphone between", value1, value2,
					"customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerTelphoneNotBetween(String value1,
				String value2) {
			addCriterion("customer_telphone not between", value1, value2,
					"customerTelphone");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameIsNull() {
			addCriterion("customer_shortname is null");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameIsNotNull() {
			addCriterion("customer_shortname is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameEqualTo(String value) {
			addCriterion("customer_shortname =", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameNotEqualTo(String value) {
			addCriterion("customer_shortname <>", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameGreaterThan(String value) {
			addCriterion("customer_shortname >", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameGreaterThanOrEqualTo(String value) {
			addCriterion("customer_shortname >=", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameLessThan(String value) {
			addCriterion("customer_shortname <", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameLessThanOrEqualTo(String value) {
			addCriterion("customer_shortname <=", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameLike(String value) {
			addCriterion("customer_shortname like", value, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameNotLike(String value) {
			addCriterion("customer_shortname not like", value,
					"customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameIn(List<String> values) {
			addCriterion("customer_shortname in", values, "customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameNotIn(List<String> values) {
			addCriterion("customer_shortname not in", values,
					"customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameBetween(String value1, String value2) {
			addCriterion("customer_shortname between", value1, value2,
					"customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerShortnameNotBetween(String value1,
				String value2) {
			addCriterion("customer_shortname not between", value1, value2,
					"customerShortname");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailIsNull() {
			addCriterion("customer_email is null");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailIsNotNull() {
			addCriterion("customer_email is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailEqualTo(String value) {
			addCriterion("customer_email =", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailNotEqualTo(String value) {
			addCriterion("customer_email <>", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailGreaterThan(String value) {
			addCriterion("customer_email >", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
			addCriterion("customer_email >=", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailLessThan(String value) {
			addCriterion("customer_email <", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
			addCriterion("customer_email <=", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailLike(String value) {
			addCriterion("customer_email like", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailNotLike(String value) {
			addCriterion("customer_email not like", value, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailIn(List<String> values) {
			addCriterion("customer_email in", values, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailNotIn(List<String> values) {
			addCriterion("customer_email not in", values, "customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailBetween(String value1, String value2) {
			addCriterion("customer_email between", value1, value2,
					"customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerEmailNotBetween(String value1, String value2) {
			addCriterion("customer_email not between", value1, value2,
					"customerEmail");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxIsNull() {
			addCriterion("customer_fax is null");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxIsNotNull() {
			addCriterion("customer_fax is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxEqualTo(String value) {
			addCriterion("customer_fax =", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxNotEqualTo(String value) {
			addCriterion("customer_fax <>", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxGreaterThan(String value) {
			addCriterion("customer_fax >", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxGreaterThanOrEqualTo(String value) {
			addCriterion("customer_fax >=", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxLessThan(String value) {
			addCriterion("customer_fax <", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxLessThanOrEqualTo(String value) {
			addCriterion("customer_fax <=", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxLike(String value) {
			addCriterion("customer_fax like", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxNotLike(String value) {
			addCriterion("customer_fax not like", value, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxIn(List<String> values) {
			addCriterion("customer_fax in", values, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxNotIn(List<String> values) {
			addCriterion("customer_fax not in", values, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxBetween(String value1, String value2) {
			addCriterion("customer_fax between", value1, value2, "customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerFaxNotBetween(String value1, String value2) {
			addCriterion("customer_fax not between", value1, value2,
					"customerFax");
			return (Criteria) this;
		}

		public Criteria andCustomerWebIsNull() {
			addCriterion("customer_web is null");
			return (Criteria) this;
		}

		public Criteria andCustomerWebIsNotNull() {
			addCriterion("customer_web is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerWebEqualTo(String value) {
			addCriterion("customer_web =", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebNotEqualTo(String value) {
			addCriterion("customer_web <>", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebGreaterThan(String value) {
			addCriterion("customer_web >", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebGreaterThanOrEqualTo(String value) {
			addCriterion("customer_web >=", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebLessThan(String value) {
			addCriterion("customer_web <", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebLessThanOrEqualTo(String value) {
			addCriterion("customer_web <=", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebLike(String value) {
			addCriterion("customer_web like", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebNotLike(String value) {
			addCriterion("customer_web not like", value, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebIn(List<String> values) {
			addCriterion("customer_web in", values, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebNotIn(List<String> values) {
			addCriterion("customer_web not in", values, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebBetween(String value1, String value2) {
			addCriterion("customer_web between", value1, value2, "customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerWebNotBetween(String value1, String value2) {
			addCriterion("customer_web not between", value1, value2,
					"customerWeb");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkIsNull() {
			addCriterion("customer_remark is null");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkIsNotNull() {
			addCriterion("customer_remark is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkEqualTo(String value) {
			addCriterion("customer_remark =", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkNotEqualTo(String value) {
			addCriterion("customer_remark <>", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkGreaterThan(String value) {
			addCriterion("customer_remark >", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("customer_remark >=", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkLessThan(String value) {
			addCriterion("customer_remark <", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkLessThanOrEqualTo(String value) {
			addCriterion("customer_remark <=", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkLike(String value) {
			addCriterion("customer_remark like", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkNotLike(String value) {
			addCriterion("customer_remark not like", value, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkIn(List<String> values) {
			addCriterion("customer_remark in", values, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkNotIn(List<String> values) {
			addCriterion("customer_remark not in", values, "customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkBetween(String value1, String value2) {
			addCriterion("customer_remark between", value1, value2,
					"customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerRemarkNotBetween(String value1, String value2) {
			addCriterion("customer_remark not between", value1, value2,
					"customerRemark");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridIsNull() {
			addCriterion("customer_userid is null");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridIsNotNull() {
			addCriterion("customer_userid is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridEqualTo(Integer value) {
			addCriterion("customer_userid =", value, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridNotEqualTo(Integer value) {
			addCriterion("customer_userid <>", value, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridGreaterThan(Integer value) {
			addCriterion("customer_userid >", value, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("customer_userid >=", value, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridLessThan(Integer value) {
			addCriterion("customer_userid <", value, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridLessThanOrEqualTo(Integer value) {
			addCriterion("customer_userid <=", value, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridIn(List<Integer> values) {
			addCriterion("customer_userid in", values, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridNotIn(List<Integer> values) {
			addCriterion("customer_userid not in", values, "customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridBetween(Integer value1, Integer value2) {
			addCriterion("customer_userid between", value1, value2,
					"customerUserid");
			return (Criteria) this;
		}

		public Criteria andCustomerUseridNotBetween(Integer value1,
				Integer value2) {
			addCriterion("customer_userid not between", value1, value2,
					"customerUserid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table customer
	 * @mbggenerated  Tue Dec 24 20:21:21 CST 2013
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 23 20:18:54 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}