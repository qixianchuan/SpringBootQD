package com.qi.war.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author     ：qixianchuan
 * @date       ：Created in 2019-09-04 13:26
 * @description：${description}
 * @modified By：
 * @version:     $version$
 */
public class ChasesunEdiOrderReceiptMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChasesunEdiOrderReceiptMainExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUmainidIsNull() {
            addCriterion("uMainid is null");
            return (Criteria) this;
        }

        public Criteria andUmainidIsNotNull() {
            addCriterion("uMainid is not null");
            return (Criteria) this;
        }

        public Criteria andUmainidEqualTo(String value) {
            addCriterion("uMainid =", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidNotEqualTo(String value) {
            addCriterion("uMainid <>", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidGreaterThan(String value) {
            addCriterion("uMainid >", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidGreaterThanOrEqualTo(String value) {
            addCriterion("uMainid >=", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidLessThan(String value) {
            addCriterion("uMainid <", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidLessThanOrEqualTo(String value) {
            addCriterion("uMainid <=", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidLike(String value) {
            addCriterion("uMainid like", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidNotLike(String value) {
            addCriterion("uMainid not like", value, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidIn(List<String> values) {
            addCriterion("uMainid in", values, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidNotIn(List<String> values) {
            addCriterion("uMainid not in", values, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidBetween(String value1, String value2) {
            addCriterion("uMainid between", value1, value2, "umainid");
            return (Criteria) this;
        }

        public Criteria andUmainidNotBetween(String value1, String value2) {
            addCriterion("uMainid not between", value1, value2, "umainid");
            return (Criteria) this;
        }

        public Criteria andTenantcodeIsNull() {
            addCriterion("tenantCode is null");
            return (Criteria) this;
        }

        public Criteria andTenantcodeIsNotNull() {
            addCriterion("tenantCode is not null");
            return (Criteria) this;
        }

        public Criteria andTenantcodeEqualTo(String value) {
            addCriterion("tenantCode =", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotEqualTo(String value) {
            addCriterion("tenantCode <>", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeGreaterThan(String value) {
            addCriterion("tenantCode >", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tenantCode >=", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeLessThan(String value) {
            addCriterion("tenantCode <", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeLessThanOrEqualTo(String value) {
            addCriterion("tenantCode <=", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeLike(String value) {
            addCriterion("tenantCode like", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotLike(String value) {
            addCriterion("tenantCode not like", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeIn(List<String> values) {
            addCriterion("tenantCode in", values, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotIn(List<String> values) {
            addCriterion("tenantCode not in", values, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeBetween(String value1, String value2) {
            addCriterion("tenantCode between", value1, value2, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotBetween(String value1, String value2) {
            addCriterion("tenantCode not between", value1, value2, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andAsnstatusIsNull() {
            addCriterion("asnStatus is null");
            return (Criteria) this;
        }

        public Criteria andAsnstatusIsNotNull() {
            addCriterion("asnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAsnstatusEqualTo(String value) {
            addCriterion("asnStatus =", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusNotEqualTo(String value) {
            addCriterion("asnStatus <>", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusGreaterThan(String value) {
            addCriterion("asnStatus >", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusGreaterThanOrEqualTo(String value) {
            addCriterion("asnStatus >=", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusLessThan(String value) {
            addCriterion("asnStatus <", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusLessThanOrEqualTo(String value) {
            addCriterion("asnStatus <=", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusLike(String value) {
            addCriterion("asnStatus like", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusNotLike(String value) {
            addCriterion("asnStatus not like", value, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusIn(List<String> values) {
            addCriterion("asnStatus in", values, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusNotIn(List<String> values) {
            addCriterion("asnStatus not in", values, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusBetween(String value1, String value2) {
            addCriterion("asnStatus between", value1, value2, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnstatusNotBetween(String value1, String value2) {
            addCriterion("asnStatus not between", value1, value2, "asnstatus");
            return (Criteria) this;
        }

        public Criteria andAsnnoIsNull() {
            addCriterion("asnNo is null");
            return (Criteria) this;
        }

        public Criteria andAsnnoIsNotNull() {
            addCriterion("asnNo is not null");
            return (Criteria) this;
        }

        public Criteria andAsnnoEqualTo(String value) {
            addCriterion("asnNo =", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoNotEqualTo(String value) {
            addCriterion("asnNo <>", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoGreaterThan(String value) {
            addCriterion("asnNo >", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoGreaterThanOrEqualTo(String value) {
            addCriterion("asnNo >=", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoLessThan(String value) {
            addCriterion("asnNo <", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoLessThanOrEqualTo(String value) {
            addCriterion("asnNo <=", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoLike(String value) {
            addCriterion("asnNo like", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoNotLike(String value) {
            addCriterion("asnNo not like", value, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoIn(List<String> values) {
            addCriterion("asnNo in", values, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoNotIn(List<String> values) {
            addCriterion("asnNo not in", values, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoBetween(String value1, String value2) {
            addCriterion("asnNo between", value1, value2, "asnno");
            return (Criteria) this;
        }

        public Criteria andAsnnoNotBetween(String value1, String value2) {
            addCriterion("asnNo not between", value1, value2, "asnno");
            return (Criteria) this;
        }

        public Criteria andVerifybyIsNull() {
            addCriterion("verifyBy is null");
            return (Criteria) this;
        }

        public Criteria andVerifybyIsNotNull() {
            addCriterion("verifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andVerifybyEqualTo(String value) {
            addCriterion("verifyBy =", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyNotEqualTo(String value) {
            addCriterion("verifyBy <>", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyGreaterThan(String value) {
            addCriterion("verifyBy >", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyGreaterThanOrEqualTo(String value) {
            addCriterion("verifyBy >=", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyLessThan(String value) {
            addCriterion("verifyBy <", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyLessThanOrEqualTo(String value) {
            addCriterion("verifyBy <=", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyLike(String value) {
            addCriterion("verifyBy like", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyNotLike(String value) {
            addCriterion("verifyBy not like", value, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyIn(List<String> values) {
            addCriterion("verifyBy in", values, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyNotIn(List<String> values) {
            addCriterion("verifyBy not in", values, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyBetween(String value1, String value2) {
            addCriterion("verifyBy between", value1, value2, "verifyby");
            return (Criteria) this;
        }

        public Criteria andVerifybyNotBetween(String value1, String value2) {
            addCriterion("verifyBy not between", value1, value2, "verifyby");
            return (Criteria) this;
        }

        public Criteria andShpdIsNull() {
            addCriterion("shpd is null");
            return (Criteria) this;
        }

        public Criteria andShpdIsNotNull() {
            addCriterion("shpd is not null");
            return (Criteria) this;
        }

        public Criteria andShpdEqualTo(String value) {
            addCriterion("shpd =", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdNotEqualTo(String value) {
            addCriterion("shpd <>", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdGreaterThan(String value) {
            addCriterion("shpd >", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdGreaterThanOrEqualTo(String value) {
            addCriterion("shpd >=", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdLessThan(String value) {
            addCriterion("shpd <", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdLessThanOrEqualTo(String value) {
            addCriterion("shpd <=", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdLike(String value) {
            addCriterion("shpd like", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdNotLike(String value) {
            addCriterion("shpd not like", value, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdIn(List<String> values) {
            addCriterion("shpd in", values, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdNotIn(List<String> values) {
            addCriterion("shpd not in", values, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdBetween(String value1, String value2) {
            addCriterion("shpd between", value1, value2, "shpd");
            return (Criteria) this;
        }

        public Criteria andShpdNotBetween(String value1, String value2) {
            addCriterion("shpd not between", value1, value2, "shpd");
            return (Criteria) this;
        }

        public Criteria andRecheckbyIsNull() {
            addCriterion("recheckBy is null");
            return (Criteria) this;
        }

        public Criteria andRecheckbyIsNotNull() {
            addCriterion("recheckBy is not null");
            return (Criteria) this;
        }

        public Criteria andRecheckbyEqualTo(String value) {
            addCriterion("recheckBy =", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyNotEqualTo(String value) {
            addCriterion("recheckBy <>", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyGreaterThan(String value) {
            addCriterion("recheckBy >", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyGreaterThanOrEqualTo(String value) {
            addCriterion("recheckBy >=", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyLessThan(String value) {
            addCriterion("recheckBy <", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyLessThanOrEqualTo(String value) {
            addCriterion("recheckBy <=", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyLike(String value) {
            addCriterion("recheckBy like", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyNotLike(String value) {
            addCriterion("recheckBy not like", value, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyIn(List<String> values) {
            addCriterion("recheckBy in", values, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyNotIn(List<String> values) {
            addCriterion("recheckBy not in", values, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyBetween(String value1, String value2) {
            addCriterion("recheckBy between", value1, value2, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRecheckbyNotBetween(String value1, String value2) {
            addCriterion("recheckBy not between", value1, value2, "recheckby");
            return (Criteria) this;
        }

        public Criteria andRechecktimeIsNull() {
            addCriterion("recheckTime is null");
            return (Criteria) this;
        }

        public Criteria andRechecktimeIsNotNull() {
            addCriterion("recheckTime is not null");
            return (Criteria) this;
        }

        public Criteria andRechecktimeEqualTo(String value) {
            addCriterion("recheckTime =", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeNotEqualTo(String value) {
            addCriterion("recheckTime <>", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeGreaterThan(String value) {
            addCriterion("recheckTime >", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("recheckTime >=", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeLessThan(String value) {
            addCriterion("recheckTime <", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeLessThanOrEqualTo(String value) {
            addCriterion("recheckTime <=", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeLike(String value) {
            addCriterion("recheckTime like", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeNotLike(String value) {
            addCriterion("recheckTime not like", value, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeIn(List<String> values) {
            addCriterion("recheckTime in", values, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeNotIn(List<String> values) {
            addCriterion("recheckTime not in", values, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeBetween(String value1, String value2) {
            addCriterion("recheckTime between", value1, value2, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andRechecktimeNotBetween(String value1, String value2) {
            addCriterion("recheckTime not between", value1, value2, "rechecktime");
            return (Criteria) this;
        }

        public Criteria andReceivebyIsNull() {
            addCriterion("receiveBy is null");
            return (Criteria) this;
        }

        public Criteria andReceivebyIsNotNull() {
            addCriterion("receiveBy is not null");
            return (Criteria) this;
        }

        public Criteria andReceivebyEqualTo(String value) {
            addCriterion("receiveBy =", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotEqualTo(String value) {
            addCriterion("receiveBy <>", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyGreaterThan(String value) {
            addCriterion("receiveBy >", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyGreaterThanOrEqualTo(String value) {
            addCriterion("receiveBy >=", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyLessThan(String value) {
            addCriterion("receiveBy <", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyLessThanOrEqualTo(String value) {
            addCriterion("receiveBy <=", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyLike(String value) {
            addCriterion("receiveBy like", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotLike(String value) {
            addCriterion("receiveBy not like", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyIn(List<String> values) {
            addCriterion("receiveBy in", values, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotIn(List<String> values) {
            addCriterion("receiveBy not in", values, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyBetween(String value1, String value2) {
            addCriterion("receiveBy between", value1, value2, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotBetween(String value1, String value2) {
            addCriterion("receiveBy not between", value1, value2, "receiveby");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeIsNull() {
            addCriterion("finishReceiptTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeIsNotNull() {
            addCriterion("finishReceiptTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeEqualTo(String value) {
            addCriterion("finishReceiptTime =", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeNotEqualTo(String value) {
            addCriterion("finishReceiptTime <>", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeGreaterThan(String value) {
            addCriterion("finishReceiptTime >", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeGreaterThanOrEqualTo(String value) {
            addCriterion("finishReceiptTime >=", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeLessThan(String value) {
            addCriterion("finishReceiptTime <", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeLessThanOrEqualTo(String value) {
            addCriterion("finishReceiptTime <=", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeLike(String value) {
            addCriterion("finishReceiptTime like", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeNotLike(String value) {
            addCriterion("finishReceiptTime not like", value, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeIn(List<String> values) {
            addCriterion("finishReceiptTime in", values, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeNotIn(List<String> values) {
            addCriterion("finishReceiptTime not in", values, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeBetween(String value1, String value2) {
            addCriterion("finishReceiptTime between", value1, value2, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andFinishreceipttimeNotBetween(String value1, String value2) {
            addCriterion("finishReceiptTime not between", value1, value2, "finishreceipttime");
            return (Criteria) this;
        }

        public Criteria andAsntypeIsNull() {
            addCriterion("asnType is null");
            return (Criteria) this;
        }

        public Criteria andAsntypeIsNotNull() {
            addCriterion("asnType is not null");
            return (Criteria) this;
        }

        public Criteria andAsntypeEqualTo(String value) {
            addCriterion("asnType =", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeNotEqualTo(String value) {
            addCriterion("asnType <>", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeGreaterThan(String value) {
            addCriterion("asnType >", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeGreaterThanOrEqualTo(String value) {
            addCriterion("asnType >=", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeLessThan(String value) {
            addCriterion("asnType <", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeLessThanOrEqualTo(String value) {
            addCriterion("asnType <=", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeLike(String value) {
            addCriterion("asnType like", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeNotLike(String value) {
            addCriterion("asnType not like", value, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeIn(List<String> values) {
            addCriterion("asnType in", values, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeNotIn(List<String> values) {
            addCriterion("asnType not in", values, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeBetween(String value1, String value2) {
            addCriterion("asnType between", value1, value2, "asntype");
            return (Criteria) this;
        }

        public Criteria andAsntypeNotBetween(String value1, String value2) {
            addCriterion("asnType not between", value1, value2, "asntype");
            return (Criteria) this;
        }

        public Criteria andSourcesysIsNull() {
            addCriterion("sourceSys is null");
            return (Criteria) this;
        }

        public Criteria andSourcesysIsNotNull() {
            addCriterion("sourceSys is not null");
            return (Criteria) this;
        }

        public Criteria andSourcesysEqualTo(String value) {
            addCriterion("sourceSys =", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysNotEqualTo(String value) {
            addCriterion("sourceSys <>", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysGreaterThan(String value) {
            addCriterion("sourceSys >", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysGreaterThanOrEqualTo(String value) {
            addCriterion("sourceSys >=", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysLessThan(String value) {
            addCriterion("sourceSys <", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysLessThanOrEqualTo(String value) {
            addCriterion("sourceSys <=", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysLike(String value) {
            addCriterion("sourceSys like", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysNotLike(String value) {
            addCriterion("sourceSys not like", value, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysIn(List<String> values) {
            addCriterion("sourceSys in", values, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysNotIn(List<String> values) {
            addCriterion("sourceSys not in", values, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysBetween(String value1, String value2) {
            addCriterion("sourceSys between", value1, value2, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andSourcesysNotBetween(String value1, String value2) {
            addCriterion("sourceSys not between", value1, value2, "sourcesys");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseId is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("warehouseId =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("warehouseId <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("warehouseId >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseId >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("warehouseId <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("warehouseId <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("warehouseId like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("warehouseId not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("warehouseId in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("warehouseId not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("warehouseId between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("warehouseId not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andEdiStatusIsNull() {
            addCriterion("edi_status is null");
            return (Criteria) this;
        }

        public Criteria andEdiStatusIsNotNull() {
            addCriterion("edi_status is not null");
            return (Criteria) this;
        }

        public Criteria andEdiStatusEqualTo(Integer value) {
            addCriterion("edi_status =", value, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusNotEqualTo(Integer value) {
            addCriterion("edi_status <>", value, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusGreaterThan(Integer value) {
            addCriterion("edi_status >", value, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("edi_status >=", value, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusLessThan(Integer value) {
            addCriterion("edi_status <", value, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("edi_status <=", value, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusIn(List<Integer> values) {
            addCriterion("edi_status in", values, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusNotIn(List<Integer> values) {
            addCriterion("edi_status not in", values, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusBetween(Integer value1, Integer value2) {
            addCriterion("edi_status between", value1, value2, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andEdiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("edi_status not between", value1, value2, "ediStatus");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(LocalDateTime value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(LocalDateTime value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(LocalDateTime value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(LocalDateTime value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<LocalDateTime> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<LocalDateTime> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(LocalDateTime value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(LocalDateTime value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(LocalDateTime value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(LocalDateTime value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<LocalDateTime> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<LocalDateTime> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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