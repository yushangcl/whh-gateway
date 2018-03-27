package cn.itbat.whh.gateway.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GwManageApiDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GwManageApiDOExample() {
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

        public Criteria andApiUkidIsNull() {
            addCriterion("API_UKID is null");
            return (Criteria) this;
        }

        public Criteria andApiUkidIsNotNull() {
            addCriterion("API_UKID is not null");
            return (Criteria) this;
        }

        public Criteria andApiUkidEqualTo(Long value) {
            addCriterion("API_UKID =", value, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidNotEqualTo(Long value) {
            addCriterion("API_UKID <>", value, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidGreaterThan(Long value) {
            addCriterion("API_UKID >", value, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("API_UKID >=", value, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidLessThan(Long value) {
            addCriterion("API_UKID <", value, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidLessThanOrEqualTo(Long value) {
            addCriterion("API_UKID <=", value, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidIn(List<Long> values) {
            addCriterion("API_UKID in", values, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidNotIn(List<Long> values) {
            addCriterion("API_UKID not in", values, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidBetween(Long value1, Long value2) {
            addCriterion("API_UKID between", value1, value2, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiUkidNotBetween(Long value1, Long value2) {
            addCriterion("API_UKID not between", value1, value2, "apiUkid");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNull() {
            addCriterion("API_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNotNull() {
            addCriterion("API_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApiNameEqualTo(String value) {
            addCriterion("API_NAME =", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotEqualTo(String value) {
            addCriterion("API_NAME <>", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThan(String value) {
            addCriterion("API_NAME >", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("API_NAME >=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThan(String value) {
            addCriterion("API_NAME <", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThanOrEqualTo(String value) {
            addCriterion("API_NAME <=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLike(String value) {
            addCriterion("API_NAME like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotLike(String value) {
            addCriterion("API_NAME not like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameIn(List<String> values) {
            addCriterion("API_NAME in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotIn(List<String> values) {
            addCriterion("API_NAME not in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameBetween(String value1, String value2) {
            addCriterion("API_NAME between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotBetween(String value1, String value2) {
            addCriterion("API_NAME not between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiDescIsNull() {
            addCriterion("API_DESC is null");
            return (Criteria) this;
        }

        public Criteria andApiDescIsNotNull() {
            addCriterion("API_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andApiDescEqualTo(String value) {
            addCriterion("API_DESC =", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotEqualTo(String value) {
            addCriterion("API_DESC <>", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescGreaterThan(String value) {
            addCriterion("API_DESC >", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescGreaterThanOrEqualTo(String value) {
            addCriterion("API_DESC >=", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLessThan(String value) {
            addCriterion("API_DESC <", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLessThanOrEqualTo(String value) {
            addCriterion("API_DESC <=", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLike(String value) {
            addCriterion("API_DESC like", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotLike(String value) {
            addCriterion("API_DESC not like", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescIn(List<String> values) {
            addCriterion("API_DESC in", values, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotIn(List<String> values) {
            addCriterion("API_DESC not in", values, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescBetween(String value1, String value2) {
            addCriterion("API_DESC between", value1, value2, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotBetween(String value1, String value2) {
            addCriterion("API_DESC not between", value1, value2, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiStatusIsNull() {
            addCriterion("API_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andApiStatusIsNotNull() {
            addCriterion("API_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApiStatusEqualTo(Byte value) {
            addCriterion("API_STATUS =", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotEqualTo(Byte value) {
            addCriterion("API_STATUS <>", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusGreaterThan(Byte value) {
            addCriterion("API_STATUS >", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("API_STATUS >=", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLessThan(Byte value) {
            addCriterion("API_STATUS <", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLessThanOrEqualTo(Byte value) {
            addCriterion("API_STATUS <=", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusIn(List<Byte> values) {
            addCriterion("API_STATUS in", values, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotIn(List<Byte> values) {
            addCriterion("API_STATUS not in", values, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusBetween(Byte value1, Byte value2) {
            addCriterion("API_STATUS between", value1, value2, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("API_STATUS not between", value1, value2, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNull() {
            addCriterion("API_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNotNull() {
            addCriterion("API_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApiTypeEqualTo(Byte value) {
            addCriterion("API_TYPE =", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotEqualTo(Byte value) {
            addCriterion("API_TYPE <>", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThan(Byte value) {
            addCriterion("API_TYPE >", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("API_TYPE >=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThan(Byte value) {
            addCriterion("API_TYPE <", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThanOrEqualTo(Byte value) {
            addCriterion("API_TYPE <=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeIn(List<Byte> values) {
            addCriterion("API_TYPE in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotIn(List<Byte> values) {
            addCriterion("API_TYPE not in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeBetween(Byte value1, Byte value2) {
            addCriterion("API_TYPE between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("API_TYPE not between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiVersionIsNull() {
            addCriterion("API_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andApiVersionIsNotNull() {
            addCriterion("API_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andApiVersionEqualTo(String value) {
            addCriterion("API_VERSION =", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotEqualTo(String value) {
            addCriterion("API_VERSION <>", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionGreaterThan(String value) {
            addCriterion("API_VERSION >", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionGreaterThanOrEqualTo(String value) {
            addCriterion("API_VERSION >=", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLessThan(String value) {
            addCriterion("API_VERSION <", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLessThanOrEqualTo(String value) {
            addCriterion("API_VERSION <=", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLike(String value) {
            addCriterion("API_VERSION like", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotLike(String value) {
            addCriterion("API_VERSION not like", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionIn(List<String> values) {
            addCriterion("API_VERSION in", values, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotIn(List<String> values) {
            addCriterion("API_VERSION not in", values, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionBetween(String value1, String value2) {
            addCriterion("API_VERSION between", value1, value2, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotBetween(String value1, String value2) {
            addCriterion("API_VERSION not between", value1, value2, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidIsNull() {
            addCriterion("API_SERVICE_UKID is null");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidIsNotNull() {
            addCriterion("API_SERVICE_UKID is not null");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidEqualTo(Long value) {
            addCriterion("API_SERVICE_UKID =", value, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidNotEqualTo(Long value) {
            addCriterion("API_SERVICE_UKID <>", value, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidGreaterThan(Long value) {
            addCriterion("API_SERVICE_UKID >", value, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("API_SERVICE_UKID >=", value, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidLessThan(Long value) {
            addCriterion("API_SERVICE_UKID <", value, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidLessThanOrEqualTo(Long value) {
            addCriterion("API_SERVICE_UKID <=", value, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidIn(List<Long> values) {
            addCriterion("API_SERVICE_UKID in", values, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidNotIn(List<Long> values) {
            addCriterion("API_SERVICE_UKID not in", values, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidBetween(Long value1, Long value2) {
            addCriterion("API_SERVICE_UKID between", value1, value2, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andApiServiceUkidNotBetween(Long value1, Long value2) {
            addCriterion("API_SERVICE_UKID not between", value1, value2, "apiServiceUkid");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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