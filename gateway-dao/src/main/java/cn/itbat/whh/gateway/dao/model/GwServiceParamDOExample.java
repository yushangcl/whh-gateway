package cn.itbat.whh.gateway.dao.model;

import java.util.ArrayList;
import java.util.List;

public class GwServiceParamDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GwServiceParamDOExample() {
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

        public Criteria andParamUkidIsNull() {
            addCriterion("PARAM_UKID is null");
            return (Criteria) this;
        }

        public Criteria andParamUkidIsNotNull() {
            addCriterion("PARAM_UKID is not null");
            return (Criteria) this;
        }

        public Criteria andParamUkidEqualTo(Long value) {
            addCriterion("PARAM_UKID =", value, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidNotEqualTo(Long value) {
            addCriterion("PARAM_UKID <>", value, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidGreaterThan(Long value) {
            addCriterion("PARAM_UKID >", value, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("PARAM_UKID >=", value, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidLessThan(Long value) {
            addCriterion("PARAM_UKID <", value, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidLessThanOrEqualTo(Long value) {
            addCriterion("PARAM_UKID <=", value, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidIn(List<Long> values) {
            addCriterion("PARAM_UKID in", values, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidNotIn(List<Long> values) {
            addCriterion("PARAM_UKID not in", values, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidBetween(Long value1, Long value2) {
            addCriterion("PARAM_UKID between", value1, value2, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamUkidNotBetween(Long value1, Long value2) {
            addCriterion("PARAM_UKID not between", value1, value2, "paramUkid");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNull() {
            addCriterion("PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNotNull() {
            addCriterion("PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParamNameEqualTo(String value) {
            addCriterion("PARAM_NAME =", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotEqualTo(String value) {
            addCriterion("PARAM_NAME <>", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThan(String value) {
            addCriterion("PARAM_NAME >", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME >=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThan(String value) {
            addCriterion("PARAM_NAME <", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME <=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLike(String value) {
            addCriterion("PARAM_NAME like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotLike(String value) {
            addCriterion("PARAM_NAME not like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameIn(List<String> values) {
            addCriterion("PARAM_NAME in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotIn(List<String> values) {
            addCriterion("PARAM_NAME not in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameBetween(String value1, String value2) {
            addCriterion("PARAM_NAME between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotBetween(String value1, String value2) {
            addCriterion("PARAM_NAME not between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamClassIsNull() {
            addCriterion("PARAM_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andParamClassIsNotNull() {
            addCriterion("PARAM_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andParamClassEqualTo(String value) {
            addCriterion("PARAM_CLASS =", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassNotEqualTo(String value) {
            addCriterion("PARAM_CLASS <>", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassGreaterThan(String value) {
            addCriterion("PARAM_CLASS >", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_CLASS >=", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassLessThan(String value) {
            addCriterion("PARAM_CLASS <", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassLessThanOrEqualTo(String value) {
            addCriterion("PARAM_CLASS <=", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassLike(String value) {
            addCriterion("PARAM_CLASS like", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassNotLike(String value) {
            addCriterion("PARAM_CLASS not like", value, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassIn(List<String> values) {
            addCriterion("PARAM_CLASS in", values, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassNotIn(List<String> values) {
            addCriterion("PARAM_CLASS not in", values, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassBetween(String value1, String value2) {
            addCriterion("PARAM_CLASS between", value1, value2, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamClassNotBetween(String value1, String value2) {
            addCriterion("PARAM_CLASS not between", value1, value2, "paramClass");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNull() {
            addCriterion("PARAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNotNull() {
            addCriterion("PARAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypeEqualTo(String value) {
            addCriterion("PARAM_TYPE =", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotEqualTo(String value) {
            addCriterion("PARAM_TYPE <>", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThan(String value) {
            addCriterion("PARAM_TYPE >", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_TYPE >=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThan(String value) {
            addCriterion("PARAM_TYPE <", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThanOrEqualTo(String value) {
            addCriterion("PARAM_TYPE <=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLike(String value) {
            addCriterion("PARAM_TYPE like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotLike(String value) {
            addCriterion("PARAM_TYPE not like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeIn(List<String> values) {
            addCriterion("PARAM_TYPE in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotIn(List<String> values) {
            addCriterion("PARAM_TYPE not in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeBetween(String value1, String value2) {
            addCriterion("PARAM_TYPE between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotBetween(String value1, String value2) {
            addCriterion("PARAM_TYPE not between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeIsNull() {
            addCriterion("PARAM_INOUTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeIsNotNull() {
            addCriterion("PARAM_INOUTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeEqualTo(Byte value) {
            addCriterion("PARAM_INOUTYPE =", value, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeNotEqualTo(Byte value) {
            addCriterion("PARAM_INOUTYPE <>", value, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeGreaterThan(Byte value) {
            addCriterion("PARAM_INOUTYPE >", value, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("PARAM_INOUTYPE >=", value, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeLessThan(Byte value) {
            addCriterion("PARAM_INOUTYPE <", value, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeLessThanOrEqualTo(Byte value) {
            addCriterion("PARAM_INOUTYPE <=", value, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeIn(List<Byte> values) {
            addCriterion("PARAM_INOUTYPE in", values, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeNotIn(List<Byte> values) {
            addCriterion("PARAM_INOUTYPE not in", values, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeBetween(Byte value1, Byte value2) {
            addCriterion("PARAM_INOUTYPE between", value1, value2, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andParamInoutypeNotBetween(Byte value1, Byte value2) {
            addCriterion("PARAM_INOUTYPE not between", value1, value2, "paramInoutype");
            return (Criteria) this;
        }

        public Criteria andServiceUkidIsNull() {
            addCriterion("SERVICE_UKID is null");
            return (Criteria) this;
        }

        public Criteria andServiceUkidIsNotNull() {
            addCriterion("SERVICE_UKID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUkidEqualTo(Long value) {
            addCriterion("SERVICE_UKID =", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidNotEqualTo(Long value) {
            addCriterion("SERVICE_UKID <>", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidGreaterThan(Long value) {
            addCriterion("SERVICE_UKID >", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("SERVICE_UKID >=", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidLessThan(Long value) {
            addCriterion("SERVICE_UKID <", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidLessThanOrEqualTo(Long value) {
            addCriterion("SERVICE_UKID <=", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidIn(List<Long> values) {
            addCriterion("SERVICE_UKID in", values, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidNotIn(List<Long> values) {
            addCriterion("SERVICE_UKID not in", values, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidBetween(Long value1, Long value2) {
            addCriterion("SERVICE_UKID between", value1, value2, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidNotBetween(Long value1, Long value2) {
            addCriterion("SERVICE_UKID not between", value1, value2, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andParamOrderIsNull() {
            addCriterion("PARAM_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andParamOrderIsNotNull() {
            addCriterion("PARAM_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andParamOrderEqualTo(Integer value) {
            addCriterion("PARAM_ORDER =", value, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderNotEqualTo(Integer value) {
            addCriterion("PARAM_ORDER <>", value, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderGreaterThan(Integer value) {
            addCriterion("PARAM_ORDER >", value, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARAM_ORDER >=", value, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderLessThan(Integer value) {
            addCriterion("PARAM_ORDER <", value, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderLessThanOrEqualTo(Integer value) {
            addCriterion("PARAM_ORDER <=", value, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderIn(List<Integer> values) {
            addCriterion("PARAM_ORDER in", values, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderNotIn(List<Integer> values) {
            addCriterion("PARAM_ORDER not in", values, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderBetween(Integer value1, Integer value2) {
            addCriterion("PARAM_ORDER between", value1, value2, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("PARAM_ORDER not between", value1, value2, "paramOrder");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidIsNull() {
            addCriterion("PARAM_PARENT_UKID is null");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidIsNotNull() {
            addCriterion("PARAM_PARENT_UKID is not null");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidEqualTo(Long value) {
            addCriterion("PARAM_PARENT_UKID =", value, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidNotEqualTo(Long value) {
            addCriterion("PARAM_PARENT_UKID <>", value, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidGreaterThan(Long value) {
            addCriterion("PARAM_PARENT_UKID >", value, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("PARAM_PARENT_UKID >=", value, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidLessThan(Long value) {
            addCriterion("PARAM_PARENT_UKID <", value, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidLessThanOrEqualTo(Long value) {
            addCriterion("PARAM_PARENT_UKID <=", value, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidIn(List<Long> values) {
            addCriterion("PARAM_PARENT_UKID in", values, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidNotIn(List<Long> values) {
            addCriterion("PARAM_PARENT_UKID not in", values, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidBetween(Long value1, Long value2) {
            addCriterion("PARAM_PARENT_UKID between", value1, value2, "paramParentUkid");
            return (Criteria) this;
        }

        public Criteria andParamParentUkidNotBetween(Long value1, Long value2) {
            addCriterion("PARAM_PARENT_UKID not between", value1, value2, "paramParentUkid");
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