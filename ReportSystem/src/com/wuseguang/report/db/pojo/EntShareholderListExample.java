package com.wuseguang.report.db.pojo;

import java.util.ArrayList;
import java.util.List;

public class EntShareholderListExample extends BaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public EntShareholderListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
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
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
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

        public Criteria andShareholderTypeIsNull() {
            addCriterion("shareholder_type is null");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeIsNotNull() {
            addCriterion("shareholder_type is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeEqualTo(String value) {
            addCriterion("shareholder_type =", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotEqualTo(String value) {
            addCriterion("shareholder_type <>", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeGreaterThan(String value) {
            addCriterion("shareholder_type >", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_type >=", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeLessThan(String value) {
            addCriterion("shareholder_type <", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeLessThanOrEqualTo(String value) {
            addCriterion("shareholder_type <=", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeLike(String value) {
            addCriterion("shareholder_type like", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotLike(String value) {
            addCriterion("shareholder_type not like", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeIn(List<String> values) {
            addCriterion("shareholder_type in", values, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotIn(List<String> values) {
            addCriterion("shareholder_type not in", values, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeBetween(String value1, String value2) {
            addCriterion("shareholder_type between", value1, value2, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotBetween(String value1, String value2) {
            addCriterion("shareholder_type not between", value1, value2, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameIsNull() {
            addCriterion("sharehodler_name is null");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameIsNotNull() {
            addCriterion("sharehodler_name is not null");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameEqualTo(String value) {
            addCriterion("sharehodler_name =", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameNotEqualTo(String value) {
            addCriterion("sharehodler_name <>", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameGreaterThan(String value) {
            addCriterion("sharehodler_name >", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameGreaterThanOrEqualTo(String value) {
            addCriterion("sharehodler_name >=", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameLessThan(String value) {
            addCriterion("sharehodler_name <", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameLessThanOrEqualTo(String value) {
            addCriterion("sharehodler_name <=", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameLike(String value) {
            addCriterion("sharehodler_name like", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameNotLike(String value) {
            addCriterion("sharehodler_name not like", value, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameIn(List<String> values) {
            addCriterion("sharehodler_name in", values, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameNotIn(List<String> values) {
            addCriterion("sharehodler_name not in", values, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameBetween(String value1, String value2) {
            addCriterion("sharehodler_name between", value1, value2, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andSharehodlerNameNotBetween(String value1, String value2) {
            addCriterion("sharehodler_name not between", value1, value2, "sharehodlerName");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeIsNull() {
            addCriterion("shareholder_contribute is null");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeIsNotNull() {
            addCriterion("shareholder_contribute is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeEqualTo(Float value) {
            addCriterion("shareholder_contribute =", value, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeNotEqualTo(Float value) {
            addCriterion("shareholder_contribute <>", value, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeGreaterThan(Float value) {
            addCriterion("shareholder_contribute >", value, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeGreaterThanOrEqualTo(Float value) {
            addCriterion("shareholder_contribute >=", value, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeLessThan(Float value) {
            addCriterion("shareholder_contribute <", value, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeLessThanOrEqualTo(Float value) {
            addCriterion("shareholder_contribute <=", value, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeIn(List<Float> values) {
            addCriterion("shareholder_contribute in", values, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeNotIn(List<Float> values) {
            addCriterion("shareholder_contribute not in", values, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeBetween(Float value1, Float value2) {
            addCriterion("shareholder_contribute between", value1, value2, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeNotBetween(Float value1, Float value2) {
            addCriterion("shareholder_contribute not between", value1, value2, "shareholderContribute");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitIsNull() {
            addCriterion("shareholder_currency_unit is null");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitIsNotNull() {
            addCriterion("shareholder_currency_unit is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitEqualTo(String value) {
            addCriterion("shareholder_currency_unit =", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitNotEqualTo(String value) {
            addCriterion("shareholder_currency_unit <>", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitGreaterThan(String value) {
            addCriterion("shareholder_currency_unit >", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_currency_unit >=", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitLessThan(String value) {
            addCriterion("shareholder_currency_unit <", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitLessThanOrEqualTo(String value) {
            addCriterion("shareholder_currency_unit <=", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitLike(String value) {
            addCriterion("shareholder_currency_unit like", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitNotLike(String value) {
            addCriterion("shareholder_currency_unit not like", value, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitIn(List<String> values) {
            addCriterion("shareholder_currency_unit in", values, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitNotIn(List<String> values) {
            addCriterion("shareholder_currency_unit not in", values, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitBetween(String value1, String value2) {
            addCriterion("shareholder_currency_unit between", value1, value2, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyUnitNotBetween(String value1, String value2) {
            addCriterion("shareholder_currency_unit not between", value1, value2, "shareholderCurrencyUnit");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeIsNull() {
            addCriterion("shareholder_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeIsNotNull() {
            addCriterion("shareholder_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeEqualTo(String value) {
            addCriterion("shareholder_currency_type =", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeNotEqualTo(String value) {
            addCriterion("shareholder_currency_type <>", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeGreaterThan(String value) {
            addCriterion("shareholder_currency_type >", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_currency_type >=", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeLessThan(String value) {
            addCriterion("shareholder_currency_type <", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("shareholder_currency_type <=", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeLike(String value) {
            addCriterion("shareholder_currency_type like", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeNotLike(String value) {
            addCriterion("shareholder_currency_type not like", value, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeIn(List<String> values) {
            addCriterion("shareholder_currency_type in", values, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeNotIn(List<String> values) {
            addCriterion("shareholder_currency_type not in", values, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeBetween(String value1, String value2) {
            addCriterion("shareholder_currency_type between", value1, value2, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("shareholder_currency_type not between", value1, value2, "shareholderCurrencyType");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioIsNull() {
            addCriterion("shareholder_contribute_ratio is null");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioIsNotNull() {
            addCriterion("shareholder_contribute_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioEqualTo(Float value) {
            addCriterion("shareholder_contribute_ratio =", value, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioNotEqualTo(Float value) {
            addCriterion("shareholder_contribute_ratio <>", value, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioGreaterThan(Float value) {
            addCriterion("shareholder_contribute_ratio >", value, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("shareholder_contribute_ratio >=", value, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioLessThan(Float value) {
            addCriterion("shareholder_contribute_ratio <", value, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioLessThanOrEqualTo(Float value) {
            addCriterion("shareholder_contribute_ratio <=", value, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioIn(List<Float> values) {
            addCriterion("shareholder_contribute_ratio in", values, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioNotIn(List<Float> values) {
            addCriterion("shareholder_contribute_ratio not in", values, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioBetween(Float value1, Float value2) {
            addCriterion("shareholder_contribute_ratio between", value1, value2, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderContributeRatioNotBetween(Float value1, Float value2) {
            addCriterion("shareholder_contribute_ratio not between", value1, value2, "shareholderContributeRatio");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundIsNull() {
            addCriterion("shareholder_background is null");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundIsNotNull() {
            addCriterion("shareholder_background is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundEqualTo(String value) {
            addCriterion("shareholder_background =", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundNotEqualTo(String value) {
            addCriterion("shareholder_background <>", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundGreaterThan(String value) {
            addCriterion("shareholder_background >", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_background >=", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundLessThan(String value) {
            addCriterion("shareholder_background <", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundLessThanOrEqualTo(String value) {
            addCriterion("shareholder_background <=", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundLike(String value) {
            addCriterion("shareholder_background like", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundNotLike(String value) {
            addCriterion("shareholder_background not like", value, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundIn(List<String> values) {
            addCriterion("shareholder_background in", values, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundNotIn(List<String> values) {
            addCriterion("shareholder_background not in", values, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundBetween(String value1, String value2) {
            addCriterion("shareholder_background between", value1, value2, "shareholderBackground");
            return (Criteria) this;
        }

        public Criteria andShareholderBackgroundNotBetween(String value1, String value2) {
            addCriterion("shareholder_background not between", value1, value2, "shareholderBackground");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 09 22:05:34 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ent_shareholder_list
     *
     * @mbggenerated Thu Jan 09 22:05:34 CST 2014
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