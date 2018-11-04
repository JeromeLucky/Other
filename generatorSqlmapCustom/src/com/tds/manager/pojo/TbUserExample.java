package com.tds.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andEmpIsNull() {
            addCriterion("emp is null");
            return (Criteria) this;
        }

        public Criteria andEmpIsNotNull() {
            addCriterion("emp is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEqualTo(Integer value) {
            addCriterion("emp =", value, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpNotEqualTo(Integer value) {
            addCriterion("emp <>", value, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpGreaterThan(Integer value) {
            addCriterion("emp >", value, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp >=", value, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpLessThan(Integer value) {
            addCriterion("emp <", value, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpLessThanOrEqualTo(Integer value) {
            addCriterion("emp <=", value, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpIn(List<Integer> values) {
            addCriterion("emp in", values, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpNotIn(List<Integer> values) {
            addCriterion("emp not in", values, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpBetween(Integer value1, Integer value2) {
            addCriterion("emp between", value1, value2, "emp");
            return (Criteria) this;
        }

        public Criteria andEmpNotBetween(Integer value1, Integer value2) {
            addCriterion("emp not between", value1, value2, "emp");
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