package com.tds.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsIsNull() {
            addCriterion("totle_seats is null");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsIsNotNull() {
            addCriterion("totle_seats is not null");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsEqualTo(Integer value) {
            addCriterion("totle_seats =", value, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsNotEqualTo(Integer value) {
            addCriterion("totle_seats <>", value, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsGreaterThan(Integer value) {
            addCriterion("totle_seats >", value, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsGreaterThanOrEqualTo(Integer value) {
            addCriterion("totle_seats >=", value, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsLessThan(Integer value) {
            addCriterion("totle_seats <", value, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsLessThanOrEqualTo(Integer value) {
            addCriterion("totle_seats <=", value, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsIn(List<Integer> values) {
            addCriterion("totle_seats in", values, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsNotIn(List<Integer> values) {
            addCriterion("totle_seats not in", values, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsBetween(Integer value1, Integer value2) {
            addCriterion("totle_seats between", value1, value2, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andTotleSeatsNotBetween(Integer value1, Integer value2) {
            addCriterion("totle_seats not between", value1, value2, "totleSeats");
            return (Criteria) this;
        }

        public Criteria andLeaveCityIsNull() {
            addCriterion("leave_city is null");
            return (Criteria) this;
        }

        public Criteria andLeaveCityIsNotNull() {
            addCriterion("leave_city is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveCityEqualTo(String value) {
            addCriterion("leave_city =", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotEqualTo(String value) {
            addCriterion("leave_city <>", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityGreaterThan(String value) {
            addCriterion("leave_city >", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityGreaterThanOrEqualTo(String value) {
            addCriterion("leave_city >=", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityLessThan(String value) {
            addCriterion("leave_city <", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityLessThanOrEqualTo(String value) {
            addCriterion("leave_city <=", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityLike(String value) {
            addCriterion("leave_city like", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotLike(String value) {
            addCriterion("leave_city not like", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityIn(List<String> values) {
            addCriterion("leave_city in", values, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotIn(List<String> values) {
            addCriterion("leave_city not in", values, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityBetween(String value1, String value2) {
            addCriterion("leave_city between", value1, value2, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotBetween(String value1, String value2) {
            addCriterion("leave_city not between", value1, value2, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityIsNull() {
            addCriterion("arrival_city is null");
            return (Criteria) this;
        }

        public Criteria andArrivalCityIsNotNull() {
            addCriterion("arrival_city is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalCityEqualTo(String value) {
            addCriterion("arrival_city =", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotEqualTo(String value) {
            addCriterion("arrival_city <>", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityGreaterThan(String value) {
            addCriterion("arrival_city >", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_city >=", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityLessThan(String value) {
            addCriterion("arrival_city <", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityLessThanOrEqualTo(String value) {
            addCriterion("arrival_city <=", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityLike(String value) {
            addCriterion("arrival_city like", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotLike(String value) {
            addCriterion("arrival_city not like", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityIn(List<String> values) {
            addCriterion("arrival_city in", values, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotIn(List<String> values) {
            addCriterion("arrival_city not in", values, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityBetween(String value1, String value2) {
            addCriterion("arrival_city between", value1, value2, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotBetween(String value1, String value2) {
            addCriterion("arrival_city not between", value1, value2, "arrivalCity");
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

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("leave_time like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("leave_time not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(String value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(String value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(String value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(String value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(String value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLike(String value) {
            addCriterion("arrival_time like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotLike(String value) {
            addCriterion("arrival_time not like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<String> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<String> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(String value1, String value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(String value1, String value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
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