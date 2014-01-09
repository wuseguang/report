package com.wuseguang.report.db.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerContactExample extends BaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public CustomerContactExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
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
            if (condition == null) return;
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) return;
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) return;
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

        public Criteria andCustomerContactNameIsNull() {
            addCriterion("customer_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameIsNotNull() {
            addCriterion("customer_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameEqualTo(String value) {
            addCriterion("customer_contact_name =", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameNotEqualTo(String value) {
            addCriterion("customer_contact_name <>", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameGreaterThan(String value) {
            addCriterion("customer_contact_name >", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_name >=", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameLessThan(String value) {
            addCriterion("customer_contact_name <", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_name <=", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameLike(String value) {
            addCriterion("customer_contact_name like", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameNotLike(String value) {
            addCriterion("customer_contact_name not like", value, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameIn(List<String> values) {
            addCriterion("customer_contact_name in", values, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameNotIn(List<String> values) {
            addCriterion("customer_contact_name not in", values, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameBetween(String value1, String value2) {
            addCriterion("customer_contact_name between", value1, value2, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNameNotBetween(String value1, String value2) {
            addCriterion("customer_contact_name not between", value1, value2, "customerContactName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexIsNull() {
            addCriterion("customer_contact_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexIsNotNull() {
            addCriterion("customer_contact_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexEqualTo(String value) {
            addCriterion("customer_contact_sex =", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexNotEqualTo(String value) {
            addCriterion("customer_contact_sex <>", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexGreaterThan(String value) {
            addCriterion("customer_contact_sex >", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_sex >=", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexLessThan(String value) {
            addCriterion("customer_contact_sex <", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_sex <=", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexLike(String value) {
            addCriterion("customer_contact_sex like", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexNotLike(String value) {
            addCriterion("customer_contact_sex not like", value, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexIn(List<String> values) {
            addCriterion("customer_contact_sex in", values, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexNotIn(List<String> values) {
            addCriterion("customer_contact_sex not in", values, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexBetween(String value1, String value2) {
            addCriterion("customer_contact_sex between", value1, value2, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactSexNotBetween(String value1, String value2) {
            addCriterion("customer_contact_sex not between", value1, value2, "customerContactSex");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleIsNull() {
            addCriterion("customer_contact_role is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleIsNotNull() {
            addCriterion("customer_contact_role is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleEqualTo(String value) {
            addCriterion("customer_contact_role =", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleNotEqualTo(String value) {
            addCriterion("customer_contact_role <>", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleGreaterThan(String value) {
            addCriterion("customer_contact_role >", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_role >=", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleLessThan(String value) {
            addCriterion("customer_contact_role <", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_role <=", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleLike(String value) {
            addCriterion("customer_contact_role like", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleNotLike(String value) {
            addCriterion("customer_contact_role not like", value, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleIn(List<String> values) {
            addCriterion("customer_contact_role in", values, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleNotIn(List<String> values) {
            addCriterion("customer_contact_role not in", values, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleBetween(String value1, String value2) {
            addCriterion("customer_contact_role between", value1, value2, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRoleNotBetween(String value1, String value2) {
            addCriterion("customer_contact_role not between", value1, value2, "customerContactRole");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionIsNull() {
            addCriterion("customer_contact_position is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionIsNotNull() {
            addCriterion("customer_contact_position is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionEqualTo(String value) {
            addCriterion("customer_contact_position =", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionNotEqualTo(String value) {
            addCriterion("customer_contact_position <>", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionGreaterThan(String value) {
            addCriterion("customer_contact_position >", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_position >=", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionLessThan(String value) {
            addCriterion("customer_contact_position <", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_position <=", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionLike(String value) {
            addCriterion("customer_contact_position like", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionNotLike(String value) {
            addCriterion("customer_contact_position not like", value, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionIn(List<String> values) {
            addCriterion("customer_contact_position in", values, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionNotIn(List<String> values) {
            addCriterion("customer_contact_position not in", values, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionBetween(String value1, String value2) {
            addCriterion("customer_contact_position between", value1, value2, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactPositionNotBetween(String value1, String value2) {
            addCriterion("customer_contact_position not between", value1, value2, "customerContactPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneIsNull() {
            addCriterion("customer_contact_telphone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneIsNotNull() {
            addCriterion("customer_contact_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneEqualTo(String value) {
            addCriterion("customer_contact_telphone =", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneNotEqualTo(String value) {
            addCriterion("customer_contact_telphone <>", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneGreaterThan(String value) {
            addCriterion("customer_contact_telphone >", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_telphone >=", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneLessThan(String value) {
            addCriterion("customer_contact_telphone <", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_telphone <=", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneLike(String value) {
            addCriterion("customer_contact_telphone like", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneNotLike(String value) {
            addCriterion("customer_contact_telphone not like", value, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneIn(List<String> values) {
            addCriterion("customer_contact_telphone in", values, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneNotIn(List<String> values) {
            addCriterion("customer_contact_telphone not in", values, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneBetween(String value1, String value2) {
            addCriterion("customer_contact_telphone between", value1, value2, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactTelphoneNotBetween(String value1, String value2) {
            addCriterion("customer_contact_telphone not between", value1, value2, "customerContactTelphone");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileIsNull() {
            addCriterion("customer_contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileIsNotNull() {
            addCriterion("customer_contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileEqualTo(String value) {
            addCriterion("customer_contact_mobile =", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileNotEqualTo(String value) {
            addCriterion("customer_contact_mobile <>", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileGreaterThan(String value) {
            addCriterion("customer_contact_mobile >", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_mobile >=", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileLessThan(String value) {
            addCriterion("customer_contact_mobile <", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_mobile <=", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileLike(String value) {
            addCriterion("customer_contact_mobile like", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileNotLike(String value) {
            addCriterion("customer_contact_mobile not like", value, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileIn(List<String> values) {
            addCriterion("customer_contact_mobile in", values, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileNotIn(List<String> values) {
            addCriterion("customer_contact_mobile not in", values, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileBetween(String value1, String value2) {
            addCriterion("customer_contact_mobile between", value1, value2, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactMobileNotBetween(String value1, String value2) {
            addCriterion("customer_contact_mobile not between", value1, value2, "customerContactMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailIsNull() {
            addCriterion("customer_contact_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailIsNotNull() {
            addCriterion("customer_contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailEqualTo(String value) {
            addCriterion("customer_contact_email =", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailNotEqualTo(String value) {
            addCriterion("customer_contact_email <>", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailGreaterThan(String value) {
            addCriterion("customer_contact_email >", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_email >=", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailLessThan(String value) {
            addCriterion("customer_contact_email <", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_email <=", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailLike(String value) {
            addCriterion("customer_contact_email like", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailNotLike(String value) {
            addCriterion("customer_contact_email not like", value, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailIn(List<String> values) {
            addCriterion("customer_contact_email in", values, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailNotIn(List<String> values) {
            addCriterion("customer_contact_email not in", values, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailBetween(String value1, String value2) {
            addCriterion("customer_contact_email between", value1, value2, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEmailNotBetween(String value1, String value2) {
            addCriterion("customer_contact_email not between", value1, value2, "customerContactEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkIsNull() {
            addCriterion("customer_contact_remark is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkIsNotNull() {
            addCriterion("customer_contact_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkEqualTo(String value) {
            addCriterion("customer_contact_remark =", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkNotEqualTo(String value) {
            addCriterion("customer_contact_remark <>", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkGreaterThan(String value) {
            addCriterion("customer_contact_remark >", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact_remark >=", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkLessThan(String value) {
            addCriterion("customer_contact_remark <", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkLessThanOrEqualTo(String value) {
            addCriterion("customer_contact_remark <=", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkLike(String value) {
            addCriterion("customer_contact_remark like", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkNotLike(String value) {
            addCriterion("customer_contact_remark not like", value, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkIn(List<String> values) {
            addCriterion("customer_contact_remark in", values, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkNotIn(List<String> values) {
            addCriterion("customer_contact_remark not in", values, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkBetween(String value1, String value2) {
            addCriterion("customer_contact_remark between", value1, value2, "customerContactRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerContactRemarkNotBetween(String value1, String value2) {
            addCriterion("customer_contact_remark not between", value1, value2, "customerContactRemark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_contact
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 26 19:36:52 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_contact
     *
     * @mbggenerated Thu Dec 26 19:36:52 CST 2013
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}