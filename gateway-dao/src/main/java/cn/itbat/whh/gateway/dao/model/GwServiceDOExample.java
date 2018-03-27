package cn.itbat.whh.gateway.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GwServiceDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public GwServiceDOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * gw_service 2017-11-21
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andServiceUkidIsNull() {
            addCriterion("service_ukid is null");
            return (Criteria) this;
        }

        public Criteria andServiceUkidIsNotNull() {
            addCriterion("service_ukid is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUkidEqualTo(Long value) {
            addCriterion("service_ukid =", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidNotEqualTo(Long value) {
            addCriterion("service_ukid <>", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidGreaterThan(Long value) {
            addCriterion("service_ukid >", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidGreaterThanOrEqualTo(Long value) {
            addCriterion("service_ukid >=", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidLessThan(Long value) {
            addCriterion("service_ukid <", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidLessThanOrEqualTo(Long value) {
            addCriterion("service_ukid <=", value, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidIn(List<Long> values) {
            addCriterion("service_ukid in", values, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidNotIn(List<Long> values) {
            addCriterion("service_ukid not in", values, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidBetween(Long value1, Long value2) {
            addCriterion("service_ukid between", value1, value2, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceUkidNotBetween(Long value1, Long value2) {
            addCriterion("service_ukid not between", value1, value2, "serviceUkid");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNull() {
            addCriterion("service_desc is null");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNotNull() {
            addCriterion("service_desc is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDescEqualTo(String value) {
            addCriterion("service_desc =", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotEqualTo(String value) {
            addCriterion("service_desc <>", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThan(String value) {
            addCriterion("service_desc >", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThanOrEqualTo(String value) {
            addCriterion("service_desc >=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThan(String value) {
            addCriterion("service_desc <", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThanOrEqualTo(String value) {
            addCriterion("service_desc <=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLike(String value) {
            addCriterion("service_desc like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotLike(String value) {
            addCriterion("service_desc not like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescIn(List<String> values) {
            addCriterion("service_desc in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotIn(List<String> values) {
            addCriterion("service_desc not in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescBetween(String value1, String value2) {
            addCriterion("service_desc between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotBetween(String value1, String value2) {
            addCriterion("service_desc not between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesIsNull() {
            addCriterion("service_properties is null");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesIsNotNull() {
            addCriterion("service_properties is not null");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesEqualTo(String value) {
            addCriterion("service_properties =", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesNotEqualTo(String value) {
            addCriterion("service_properties <>", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesGreaterThan(String value) {
            addCriterion("service_properties >", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("service_properties >=", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesLessThan(String value) {
            addCriterion("service_properties <", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesLessThanOrEqualTo(String value) {
            addCriterion("service_properties <=", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesLike(String value) {
            addCriterion("service_properties like", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesNotLike(String value) {
            addCriterion("service_properties not like", value, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesIn(List<String> values) {
            addCriterion("service_properties in", values, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesNotIn(List<String> values) {
            addCriterion("service_properties not in", values, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesBetween(String value1, String value2) {
            addCriterion("service_properties between", value1, value2, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServicePropertiesNotBetween(String value1, String value2) {
            addCriterion("service_properties not between", value1, value2, "serviceProperties");
            return (Criteria) this;
        }

        public Criteria andServiceKeyIsNull() {
            addCriterion("service_key is null");
            return (Criteria) this;
        }

        public Criteria andServiceKeyIsNotNull() {
            addCriterion("service_key is not null");
            return (Criteria) this;
        }

        public Criteria andServiceKeyEqualTo(String value) {
            addCriterion("service_key =", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyNotEqualTo(String value) {
            addCriterion("service_key <>", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyGreaterThan(String value) {
            addCriterion("service_key >", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("service_key >=", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyLessThan(String value) {
            addCriterion("service_key <", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyLessThanOrEqualTo(String value) {
            addCriterion("service_key <=", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyLike(String value) {
            addCriterion("service_key like", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyNotLike(String value) {
            addCriterion("service_key not like", value, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyIn(List<String> values) {
            addCriterion("service_key in", values, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyNotIn(List<String> values) {
            addCriterion("service_key not in", values, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyBetween(String value1, String value2) {
            addCriterion("service_key between", value1, value2, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceKeyNotBetween(String value1, String value2) {
            addCriterion("service_key not between", value1, value2, "serviceKey");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIsNull() {
            addCriterion("service_version is null");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIsNotNull() {
            addCriterion("service_version is not null");
            return (Criteria) this;
        }

        public Criteria andServiceVersionEqualTo(String value) {
            addCriterion("service_version =", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotEqualTo(String value) {
            addCriterion("service_version <>", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionGreaterThan(String value) {
            addCriterion("service_version >", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("service_version >=", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLessThan(String value) {
            addCriterion("service_version <", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLessThanOrEqualTo(String value) {
            addCriterion("service_version <=", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLike(String value) {
            addCriterion("service_version like", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotLike(String value) {
            addCriterion("service_version not like", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIn(List<String> values) {
            addCriterion("service_version in", values, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotIn(List<String> values) {
            addCriterion("service_version not in", values, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionBetween(String value1, String value2) {
            addCriterion("service_version between", value1, value2, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotBetween(String value1, String value2) {
            addCriterion("service_version not between", value1, value2, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupIsNull() {
            addCriterion("application_group is null");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupIsNotNull() {
            addCriterion("application_group is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupEqualTo(String value) {
            addCriterion("application_group =", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupNotEqualTo(String value) {
            addCriterion("application_group <>", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupGreaterThan(String value) {
            addCriterion("application_group >", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupGreaterThanOrEqualTo(String value) {
            addCriterion("application_group >=", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupLessThan(String value) {
            addCriterion("application_group <", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupLessThanOrEqualTo(String value) {
            addCriterion("application_group <=", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupLike(String value) {
            addCriterion("application_group like", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupNotLike(String value) {
            addCriterion("application_group not like", value, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupIn(List<String> values) {
            addCriterion("application_group in", values, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupNotIn(List<String> values) {
            addCriterion("application_group not in", values, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupBetween(String value1, String value2) {
            addCriterion("application_group between", value1, value2, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andApplicationGroupNotBetween(String value1, String value2) {
            addCriterion("application_group not between", value1, value2, "applicationGroup");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNull() {
            addCriterion("is_test is null");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNotNull() {
            addCriterion("is_test is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestEqualTo(Integer value) {
            addCriterion("is_test =", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotEqualTo(Integer value) {
            addCriterion("is_test <>", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThan(Integer value) {
            addCriterion("is_test >", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_test >=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThan(Integer value) {
            addCriterion("is_test <", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThanOrEqualTo(Integer value) {
            addCriterion("is_test <=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestIn(List<Integer> values) {
            addCriterion("is_test in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotIn(List<Integer> values) {
            addCriterion("is_test not in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestBetween(Integer value1, Integer value2) {
            addCriterion("is_test between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotBetween(Integer value1, Integer value2) {
            addCriterion("is_test not between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andTestIpIsNull() {
            addCriterion("test_ip is null");
            return (Criteria) this;
        }

        public Criteria andTestIpIsNotNull() {
            addCriterion("test_ip is not null");
            return (Criteria) this;
        }

        public Criteria andTestIpEqualTo(String value) {
            addCriterion("test_ip =", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpNotEqualTo(String value) {
            addCriterion("test_ip <>", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpGreaterThan(String value) {
            addCriterion("test_ip >", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpGreaterThanOrEqualTo(String value) {
            addCriterion("test_ip >=", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpLessThan(String value) {
            addCriterion("test_ip <", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpLessThanOrEqualTo(String value) {
            addCriterion("test_ip <=", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpLike(String value) {
            addCriterion("test_ip like", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpNotLike(String value) {
            addCriterion("test_ip not like", value, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpIn(List<String> values) {
            addCriterion("test_ip in", values, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpNotIn(List<String> values) {
            addCriterion("test_ip not in", values, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpBetween(String value1, String value2) {
            addCriterion("test_ip between", value1, value2, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestIpNotBetween(String value1, String value2) {
            addCriterion("test_ip not between", value1, value2, "testIp");
            return (Criteria) this;
        }

        public Criteria andTestPortIsNull() {
            addCriterion("test_port is null");
            return (Criteria) this;
        }

        public Criteria andTestPortIsNotNull() {
            addCriterion("test_port is not null");
            return (Criteria) this;
        }

        public Criteria andTestPortEqualTo(String value) {
            addCriterion("test_port =", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortNotEqualTo(String value) {
            addCriterion("test_port <>", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortGreaterThan(String value) {
            addCriterion("test_port >", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortGreaterThanOrEqualTo(String value) {
            addCriterion("test_port >=", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortLessThan(String value) {
            addCriterion("test_port <", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortLessThanOrEqualTo(String value) {
            addCriterion("test_port <=", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortLike(String value) {
            addCriterion("test_port like", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortNotLike(String value) {
            addCriterion("test_port not like", value, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortIn(List<String> values) {
            addCriterion("test_port in", values, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortNotIn(List<String> values) {
            addCriterion("test_port not in", values, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortBetween(String value1, String value2) {
            addCriterion("test_port between", value1, value2, "testPort");
            return (Criteria) this;
        }

        public Criteria andTestPortNotBetween(String value1, String value2) {
            addCriterion("test_port not between", value1, value2, "testPort");
            return (Criteria) this;
        }

        public Criteria andIsAsyncIsNull() {
            addCriterion("is_async is null");
            return (Criteria) this;
        }

        public Criteria andIsAsyncIsNotNull() {
            addCriterion("is_async is not null");
            return (Criteria) this;
        }

        public Criteria andIsAsyncEqualTo(Integer value) {
            addCriterion("is_async =", value, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncNotEqualTo(Integer value) {
            addCriterion("is_async <>", value, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncGreaterThan(Integer value) {
            addCriterion("is_async >", value, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_async >=", value, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncLessThan(Integer value) {
            addCriterion("is_async <", value, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncLessThanOrEqualTo(Integer value) {
            addCriterion("is_async <=", value, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncIn(List<Integer> values) {
            addCriterion("is_async in", values, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncNotIn(List<Integer> values) {
            addCriterion("is_async not in", values, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncBetween(Integer value1, Integer value2) {
            addCriterion("is_async between", value1, value2, "isAsync");
            return (Criteria) this;
        }

        public Criteria andIsAsyncNotBetween(Integer value1, Integer value2) {
            addCriterion("is_async not between", value1, value2, "isAsync");
            return (Criteria) this;
        }

        public Criteria andServiceRetryIsNull() {
            addCriterion("service_retry is null");
            return (Criteria) this;
        }

        public Criteria andServiceRetryIsNotNull() {
            addCriterion("service_retry is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRetryEqualTo(Integer value) {
            addCriterion("service_retry =", value, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryNotEqualTo(Integer value) {
            addCriterion("service_retry <>", value, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryGreaterThan(Integer value) {
            addCriterion("service_retry >", value, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_retry >=", value, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryLessThan(Integer value) {
            addCriterion("service_retry <", value, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryLessThanOrEqualTo(Integer value) {
            addCriterion("service_retry <=", value, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryIn(List<Integer> values) {
            addCriterion("service_retry in", values, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryNotIn(List<Integer> values) {
            addCriterion("service_retry not in", values, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryBetween(Integer value1, Integer value2) {
            addCriterion("service_retry between", value1, value2, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceRetryNotBetween(Integer value1, Integer value2) {
            addCriterion("service_retry not between", value1, value2, "serviceRetry");
            return (Criteria) this;
        }

        public Criteria andServiceGroupIsNull() {
            addCriterion("service_group is null");
            return (Criteria) this;
        }

        public Criteria andServiceGroupIsNotNull() {
            addCriterion("service_group is not null");
            return (Criteria) this;
        }

        public Criteria andServiceGroupEqualTo(String value) {
            addCriterion("service_group =", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotEqualTo(String value) {
            addCriterion("service_group <>", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupGreaterThan(String value) {
            addCriterion("service_group >", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupGreaterThanOrEqualTo(String value) {
            addCriterion("service_group >=", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupLessThan(String value) {
            addCriterion("service_group <", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupLessThanOrEqualTo(String value) {
            addCriterion("service_group <=", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupLike(String value) {
            addCriterion("service_group like", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotLike(String value) {
            addCriterion("service_group not like", value, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupIn(List<String> values) {
            addCriterion("service_group in", values, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotIn(List<String> values) {
            addCriterion("service_group not in", values, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupBetween(String value1, String value2) {
            addCriterion("service_group between", value1, value2, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andServiceGroupNotBetween(String value1, String value2) {
            addCriterion("service_group not between", value1, value2, "serviceGroup");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlIsNull() {
            addCriterion("async_notify_url is null");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlIsNotNull() {
            addCriterion("async_notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlEqualTo(String value) {
            addCriterion("async_notify_url =", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlNotEqualTo(String value) {
            addCriterion("async_notify_url <>", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlGreaterThan(String value) {
            addCriterion("async_notify_url >", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("async_notify_url >=", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlLessThan(String value) {
            addCriterion("async_notify_url <", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("async_notify_url <=", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlLike(String value) {
            addCriterion("async_notify_url like", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlNotLike(String value) {
            addCriterion("async_notify_url not like", value, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlIn(List<String> values) {
            addCriterion("async_notify_url in", values, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlNotIn(List<String> values) {
            addCriterion("async_notify_url not in", values, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlBetween(String value1, String value2) {
            addCriterion("async_notify_url between", value1, value2, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andAsyncNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("async_notify_url not between", value1, value2, "asyncNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNull() {
            addCriterion("time_out is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNotNull() {
            addCriterion("time_out is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutEqualTo(Integer value) {
            addCriterion("time_out =", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotEqualTo(Integer value) {
            addCriterion("time_out <>", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThan(Integer value) {
            addCriterion("time_out >", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_out >=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThan(Integer value) {
            addCriterion("time_out <", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThanOrEqualTo(Integer value) {
            addCriterion("time_out <=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIn(List<Integer> values) {
            addCriterion("time_out in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotIn(List<Integer> values) {
            addCriterion("time_out not in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutBetween(Integer value1, Integer value2) {
            addCriterion("time_out between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotBetween(Integer value1, Integer value2) {
            addCriterion("time_out not between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * gw_service
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * gw_service 2017-11-21
     */
    public static class Criterion implements Serializable {
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