package com.tds.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andEconomyNumIsNull() {
            addCriterion("economy_num is null");
            return (Criteria) this;
        }

        public Criteria andEconomyNumIsNotNull() {
            addCriterion("economy_num is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyNumEqualTo(Integer value) {
            addCriterion("economy_num =", value, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumNotEqualTo(Integer value) {
            addCriterion("economy_num <>", value, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumGreaterThan(Integer value) {
            addCriterion("economy_num >", value, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("economy_num >=", value, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumLessThan(Integer value) {
            addCriterion("economy_num <", value, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumLessThanOrEqualTo(Integer value) {
            addCriterion("economy_num <=", value, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumIn(List<Integer> values) {
            addCriterion("economy_num in", values, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumNotIn(List<Integer> values) {
            addCriterion("economy_num not in", values, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumBetween(Integer value1, Integer value2) {
            addCriterion("economy_num between", value1, value2, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("economy_num not between", value1, value2, "economyNum");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceIsNull() {
            addCriterion("economy_price is null");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceIsNotNull() {
            addCriterion("economy_price is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceEqualTo(Double value) {
            addCriterion("economy_price =", value, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceNotEqualTo(Double value) {
            addCriterion("economy_price <>", value, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceGreaterThan(Double value) {
            addCriterion("economy_price >", value, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("economy_price >=", value, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceLessThan(Double value) {
            addCriterion("economy_price <", value, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceLessThanOrEqualTo(Double value) {
            addCriterion("economy_price <=", value, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceIn(List<Double> values) {
            addCriterion("economy_price in", values, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceNotIn(List<Double> values) {
            addCriterion("economy_price not in", values, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceBetween(Double value1, Double value2) {
            addCriterion("economy_price between", value1, value2, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyPriceNotBetween(Double value1, Double value2) {
            addCriterion("economy_price not between", value1, value2, "economyPrice");
            return (Criteria) this;
        }

        public Criteria andFirstNumIsNull() {
            addCriterion("first_num is null");
            return (Criteria) this;
        }

        public Criteria andFirstNumIsNotNull() {
            addCriterion("first_num is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNumEqualTo(Integer value) {
            addCriterion("first_num =", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotEqualTo(Integer value) {
            addCriterion("first_num <>", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThan(Integer value) {
            addCriterion("first_num >", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_num >=", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThan(Integer value) {
            addCriterion("first_num <", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThanOrEqualTo(Integer value) {
            addCriterion("first_num <=", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumIn(List<Integer> values) {
            addCriterion("first_num in", values, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotIn(List<Integer> values) {
            addCriterion("first_num not in", values, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumBetween(Integer value1, Integer value2) {
            addCriterion("first_num between", value1, value2, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotBetween(Integer value1, Integer value2) {
            addCriterion("first_num not between", value1, value2, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstPriceIsNull() {
            addCriterion("first_price is null");
            return (Criteria) this;
        }

        public Criteria andFirstPriceIsNotNull() {
            addCriterion("first_price is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPriceEqualTo(Double value) {
            addCriterion("first_price =", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceNotEqualTo(Double value) {
            addCriterion("first_price <>", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceGreaterThan(Double value) {
            addCriterion("first_price >", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("first_price >=", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceLessThan(Double value) {
            addCriterion("first_price <", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceLessThanOrEqualTo(Double value) {
            addCriterion("first_price <=", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceIn(List<Double> values) {
            addCriterion("first_price in", values, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceNotIn(List<Double> values) {
            addCriterion("first_price not in", values, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceBetween(Double value1, Double value2) {
            addCriterion("first_price between", value1, value2, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceNotBetween(Double value1, Double value2) {
            addCriterion("first_price not between", value1, value2, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseIsNull() {
            addCriterion("economy_release is null");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseIsNotNull() {
            addCriterion("economy_release is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseEqualTo(Integer value) {
            addCriterion("economy_release =", value, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseNotEqualTo(Integer value) {
            addCriterion("economy_release <>", value, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseGreaterThan(Integer value) {
            addCriterion("economy_release >", value, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("economy_release >=", value, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseLessThan(Integer value) {
            addCriterion("economy_release <", value, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseLessThanOrEqualTo(Integer value) {
            addCriterion("economy_release <=", value, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseIn(List<Integer> values) {
            addCriterion("economy_release in", values, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseNotIn(List<Integer> values) {
            addCriterion("economy_release not in", values, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseBetween(Integer value1, Integer value2) {
            addCriterion("economy_release between", value1, value2, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyReleaseNotBetween(Integer value1, Integer value2) {
            addCriterion("economy_release not between", value1, value2, "economyRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseIsNull() {
            addCriterion("first_release is null");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseIsNotNull() {
            addCriterion("first_release is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseEqualTo(Integer value) {
            addCriterion("first_release =", value, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseNotEqualTo(Integer value) {
            addCriterion("first_release <>", value, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseGreaterThan(Integer value) {
            addCriterion("first_release >", value, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_release >=", value, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseLessThan(Integer value) {
            addCriterion("first_release <", value, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseLessThanOrEqualTo(Integer value) {
            addCriterion("first_release <=", value, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseIn(List<Integer> values) {
            addCriterion("first_release in", values, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseNotIn(List<Integer> values) {
            addCriterion("first_release not in", values, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseBetween(Integer value1, Integer value2) {
            addCriterion("first_release between", value1, value2, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andFirstReleaseNotBetween(Integer value1, Integer value2) {
            addCriterion("first_release not between", value1, value2, "firstRelease");
            return (Criteria) this;
        }

        public Criteria andEconomyNoIsNull() {
            addCriterion("economy_no is null");
            return (Criteria) this;
        }

        public Criteria andEconomyNoIsNotNull() {
            addCriterion("economy_no is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyNoEqualTo(Integer value) {
            addCriterion("economy_no =", value, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoNotEqualTo(Integer value) {
            addCriterion("economy_no <>", value, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoGreaterThan(Integer value) {
            addCriterion("economy_no >", value, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("economy_no >=", value, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoLessThan(Integer value) {
            addCriterion("economy_no <", value, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoLessThanOrEqualTo(Integer value) {
            addCriterion("economy_no <=", value, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoIn(List<Integer> values) {
            addCriterion("economy_no in", values, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoNotIn(List<Integer> values) {
            addCriterion("economy_no not in", values, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoBetween(Integer value1, Integer value2) {
            addCriterion("economy_no between", value1, value2, "economyNo");
            return (Criteria) this;
        }

        public Criteria andEconomyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("economy_no not between", value1, value2, "economyNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoIsNull() {
            addCriterion("first_no is null");
            return (Criteria) this;
        }

        public Criteria andFirstNoIsNotNull() {
            addCriterion("first_no is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNoEqualTo(Integer value) {
            addCriterion("first_no =", value, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoNotEqualTo(Integer value) {
            addCriterion("first_no <>", value, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoGreaterThan(Integer value) {
            addCriterion("first_no >", value, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_no >=", value, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoLessThan(Integer value) {
            addCriterion("first_no <", value, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoLessThanOrEqualTo(Integer value) {
            addCriterion("first_no <=", value, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoIn(List<Integer> values) {
            addCriterion("first_no in", values, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoNotIn(List<Integer> values) {
            addCriterion("first_no not in", values, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoBetween(Integer value1, Integer value2) {
            addCriterion("first_no between", value1, value2, "firstNo");
            return (Criteria) this;
        }

        public Criteria andFirstNoNotBetween(Integer value1, Integer value2) {
            addCriterion("first_no not between", value1, value2, "firstNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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