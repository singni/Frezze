package com.frezze.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andOfferorIsNull() {
            addCriterion("OFFEROR is null");
            return (Criteria) this;
        }

        public Criteria andOfferorIsNotNull() {
            addCriterion("OFFEROR is not null");
            return (Criteria) this;
        }

        public Criteria andOfferorEqualTo(String value) {
            addCriterion("OFFEROR =", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorNotEqualTo(String value) {
            addCriterion("OFFEROR <>", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorGreaterThan(String value) {
            addCriterion("OFFEROR >", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorGreaterThanOrEqualTo(String value) {
            addCriterion("OFFEROR >=", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorLessThan(String value) {
            addCriterion("OFFEROR <", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorLessThanOrEqualTo(String value) {
            addCriterion("OFFEROR <=", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorLike(String value) {
            addCriterion("OFFEROR like", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorNotLike(String value) {
            addCriterion("OFFEROR not like", value, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorIn(List<String> values) {
            addCriterion("OFFEROR in", values, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorNotIn(List<String> values) {
            addCriterion("OFFEROR not in", values, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorBetween(String value1, String value2) {
            addCriterion("OFFEROR between", value1, value2, "offeror");
            return (Criteria) this;
        }

        public Criteria andOfferorNotBetween(String value1, String value2) {
            addCriterion("OFFEROR not between", value1, value2, "offeror");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("CONTRACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("CONTRACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("CONTRACT_NO =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("CONTRACT_NO <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("CONTRACT_NO >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("CONTRACT_NO <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("CONTRACT_NO like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("CONTRACT_NO not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("CONTRACT_NO in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("CONTRACT_NO not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andSigningDateIsNull() {
            addCriterion("SIGNING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSigningDateIsNotNull() {
            addCriterion("SIGNING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSigningDateEqualTo(Date value) {
            addCriterion("SIGNING_DATE =", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateNotEqualTo(Date value) {
            addCriterion("SIGNING_DATE <>", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateGreaterThan(Date value) {
            addCriterion("SIGNING_DATE >", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGNING_DATE >=", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateLessThan(Date value) {
            addCriterion("SIGNING_DATE <", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateLessThanOrEqualTo(Date value) {
            addCriterion("SIGNING_DATE <=", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateIn(List<Date> values) {
            addCriterion("SIGNING_DATE in", values, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateNotIn(List<Date> values) {
            addCriterion("SIGNING_DATE not in", values, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateBetween(Date value1, Date value2) {
            addCriterion("SIGNING_DATE between", value1, value2, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateNotBetween(Date value1, Date value2) {
            addCriterion("SIGNING_DATE not between", value1, value2, "signingDate");
            return (Criteria) this;
        }

        public Criteria andInputByIsNull() {
            addCriterion("INPUT_BY is null");
            return (Criteria) this;
        }

        public Criteria andInputByIsNotNull() {
            addCriterion("INPUT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andInputByEqualTo(String value) {
            addCriterion("INPUT_BY =", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByNotEqualTo(String value) {
            addCriterion("INPUT_BY <>", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByGreaterThan(String value) {
            addCriterion("INPUT_BY >", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_BY >=", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByLessThan(String value) {
            addCriterion("INPUT_BY <", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByLessThanOrEqualTo(String value) {
            addCriterion("INPUT_BY <=", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByLike(String value) {
            addCriterion("INPUT_BY like", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByNotLike(String value) {
            addCriterion("INPUT_BY not like", value, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByIn(List<String> values) {
            addCriterion("INPUT_BY in", values, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByNotIn(List<String> values) {
            addCriterion("INPUT_BY not in", values, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByBetween(String value1, String value2) {
            addCriterion("INPUT_BY between", value1, value2, "inputBy");
            return (Criteria) this;
        }

        public Criteria andInputByNotBetween(String value1, String value2) {
            addCriterion("INPUT_BY not between", value1, value2, "inputBy");
            return (Criteria) this;
        }

        public Criteria andCheckByIsNull() {
            addCriterion("CHECK_BY is null");
            return (Criteria) this;
        }

        public Criteria andCheckByIsNotNull() {
            addCriterion("CHECK_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckByEqualTo(String value) {
            addCriterion("CHECK_BY =", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotEqualTo(String value) {
            addCriterion("CHECK_BY <>", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByGreaterThan(String value) {
            addCriterion("CHECK_BY >", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_BY >=", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByLessThan(String value) {
            addCriterion("CHECK_BY <", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByLessThanOrEqualTo(String value) {
            addCriterion("CHECK_BY <=", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByLike(String value) {
            addCriterion("CHECK_BY like", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotLike(String value) {
            addCriterion("CHECK_BY not like", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByIn(List<String> values) {
            addCriterion("CHECK_BY in", values, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotIn(List<String> values) {
            addCriterion("CHECK_BY not in", values, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByBetween(String value1, String value2) {
            addCriterion("CHECK_BY between", value1, value2, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotBetween(String value1, String value2) {
            addCriterion("CHECK_BY not between", value1, value2, "checkBy");
            return (Criteria) this;
        }

        public Criteria andInspectorIsNull() {
            addCriterion("INSPECTOR is null");
            return (Criteria) this;
        }

        public Criteria andInspectorIsNotNull() {
            addCriterion("INSPECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andInspectorEqualTo(String value) {
            addCriterion("INSPECTOR =", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotEqualTo(String value) {
            addCriterion("INSPECTOR <>", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorGreaterThan(String value) {
            addCriterion("INSPECTOR >", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTOR >=", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorLessThan(String value) {
            addCriterion("INSPECTOR <", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorLessThanOrEqualTo(String value) {
            addCriterion("INSPECTOR <=", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorLike(String value) {
            addCriterion("INSPECTOR like", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotLike(String value) {
            addCriterion("INSPECTOR not like", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorIn(List<String> values) {
            addCriterion("INSPECTOR in", values, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotIn(List<String> values) {
            addCriterion("INSPECTOR not in", values, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorBetween(String value1, String value2) {
            addCriterion("INSPECTOR between", value1, value2, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotBetween(String value1, String value2) {
            addCriterion("INSPECTOR not between", value1, value2, "inspector");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMOUNT in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMOUNT not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMOUNT between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMOUNT not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andCrequestIsNull() {
            addCriterion("CREQUEST is null");
            return (Criteria) this;
        }

        public Criteria andCrequestIsNotNull() {
            addCriterion("CREQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andCrequestEqualTo(String value) {
            addCriterion("CREQUEST =", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestNotEqualTo(String value) {
            addCriterion("CREQUEST <>", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestGreaterThan(String value) {
            addCriterion("CREQUEST >", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestGreaterThanOrEqualTo(String value) {
            addCriterion("CREQUEST >=", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestLessThan(String value) {
            addCriterion("CREQUEST <", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestLessThanOrEqualTo(String value) {
            addCriterion("CREQUEST <=", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestLike(String value) {
            addCriterion("CREQUEST like", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestNotLike(String value) {
            addCriterion("CREQUEST not like", value, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestIn(List<String> values) {
            addCriterion("CREQUEST in", values, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestNotIn(List<String> values) {
            addCriterion("CREQUEST not in", values, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestBetween(String value1, String value2) {
            addCriterion("CREQUEST between", value1, value2, "crequest");
            return (Criteria) this;
        }

        public Criteria andCrequestNotBetween(String value1, String value2) {
            addCriterion("CREQUEST not between", value1, value2, "crequest");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNull() {
            addCriterion("CUSTOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("CUSTOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("CUSTOM_NAME =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("CUSTOM_NAME <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("CUSTOM_NAME >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_NAME >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("CUSTOM_NAME <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_NAME <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("CUSTOM_NAME like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("CUSTOM_NAME not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("CUSTOM_NAME in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("CUSTOM_NAME not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("CUSTOM_NAME between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_NAME not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("SHIP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("SHIP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Date value) {
            addCriterion("SHIP_TIME =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Date value) {
            addCriterion("SHIP_TIME <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Date value) {
            addCriterion("SHIP_TIME >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SHIP_TIME >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Date value) {
            addCriterion("SHIP_TIME <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("SHIP_TIME <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Date> values) {
            addCriterion("SHIP_TIME in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Date> values) {
            addCriterion("SHIP_TIME not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Date value1, Date value2) {
            addCriterion("SHIP_TIME between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("SHIP_TIME not between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andImportNumIsNull() {
            addCriterion("IMPORT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andImportNumIsNotNull() {
            addCriterion("IMPORT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andImportNumEqualTo(Integer value) {
            addCriterion("IMPORT_NUM =", value, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumNotEqualTo(Integer value) {
            addCriterion("IMPORT_NUM <>", value, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumGreaterThan(Integer value) {
            addCriterion("IMPORT_NUM >", value, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMPORT_NUM >=", value, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumLessThan(Integer value) {
            addCriterion("IMPORT_NUM <", value, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumLessThanOrEqualTo(Integer value) {
            addCriterion("IMPORT_NUM <=", value, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumIn(List<Integer> values) {
            addCriterion("IMPORT_NUM in", values, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumNotIn(List<Integer> values) {
            addCriterion("IMPORT_NUM not in", values, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumBetween(Integer value1, Integer value2) {
            addCriterion("IMPORT_NUM between", value1, value2, "importNum");
            return (Criteria) this;
        }

        public Criteria andImportNumNotBetween(Integer value1, Integer value2) {
            addCriterion("IMPORT_NUM not between", value1, value2, "importNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodIsNull() {
            addCriterion("DELIVERY_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodIsNotNull() {
            addCriterion("DELIVERY_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodEqualTo(Date value) {
            addCriterion("DELIVERY_PERIOD =", value, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodNotEqualTo(Date value) {
            addCriterion("DELIVERY_PERIOD <>", value, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodGreaterThan(Date value) {
            addCriterion("DELIVERY_PERIOD >", value, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_PERIOD >=", value, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodLessThan(Date value) {
            addCriterion("DELIVERY_PERIOD <", value, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_PERIOD <=", value, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodIn(List<Date> values) {
            addCriterion("DELIVERY_PERIOD in", values, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodNotIn(List<Date> values) {
            addCriterion("DELIVERY_PERIOD not in", values, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_PERIOD between", value1, value2, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andDeliveryPeriodNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_PERIOD not between", value1, value2, "deliveryPeriod");
            return (Criteria) this;
        }

        public Criteria andOldStateIsNull() {
            addCriterion("OLD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOldStateIsNotNull() {
            addCriterion("OLD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOldStateEqualTo(Integer value) {
            addCriterion("OLD_STATE =", value, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateNotEqualTo(Integer value) {
            addCriterion("OLD_STATE <>", value, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateGreaterThan(Integer value) {
            addCriterion("OLD_STATE >", value, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_STATE >=", value, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateLessThan(Integer value) {
            addCriterion("OLD_STATE <", value, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_STATE <=", value, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateIn(List<Integer> values) {
            addCriterion("OLD_STATE in", values, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateNotIn(List<Integer> values) {
            addCriterion("OLD_STATE not in", values, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateBetween(Integer value1, Integer value2) {
            addCriterion("OLD_STATE between", value1, value2, "oldState");
            return (Criteria) this;
        }

        public Criteria andOldStateNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_STATE not between", value1, value2, "oldState");
            return (Criteria) this;
        }

        public Criteria andOutStateIsNull() {
            addCriterion("OUT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOutStateIsNotNull() {
            addCriterion("OUT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutStateEqualTo(Integer value) {
            addCriterion("OUT_STATE =", value, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateNotEqualTo(Integer value) {
            addCriterion("OUT_STATE <>", value, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateGreaterThan(Integer value) {
            addCriterion("OUT_STATE >", value, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_STATE >=", value, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateLessThan(Integer value) {
            addCriterion("OUT_STATE <", value, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_STATE <=", value, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateIn(List<Integer> values) {
            addCriterion("OUT_STATE in", values, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateNotIn(List<Integer> values) {
            addCriterion("OUT_STATE not in", values, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateBetween(Integer value1, Integer value2) {
            addCriterion("OUT_STATE between", value1, value2, "outState");
            return (Criteria) this;
        }

        public Criteria andOutStateNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_STATE not between", value1, value2, "outState");
            return (Criteria) this;
        }

        public Criteria andTradeTermsIsNull() {
            addCriterion("TRADE_TERMS is null");
            return (Criteria) this;
        }

        public Criteria andTradeTermsIsNotNull() {
            addCriterion("TRADE_TERMS is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTermsEqualTo(String value) {
            addCriterion("TRADE_TERMS =", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotEqualTo(String value) {
            addCriterion("TRADE_TERMS <>", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsGreaterThan(String value) {
            addCriterion("TRADE_TERMS >", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TERMS >=", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsLessThan(String value) {
            addCriterion("TRADE_TERMS <", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TERMS <=", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsLike(String value) {
            addCriterion("TRADE_TERMS like", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotLike(String value) {
            addCriterion("TRADE_TERMS not like", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsIn(List<String> values) {
            addCriterion("TRADE_TERMS in", values, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotIn(List<String> values) {
            addCriterion("TRADE_TERMS not in", values, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsBetween(String value1, String value2) {
            addCriterion("TRADE_TERMS between", value1, value2, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotBetween(String value1, String value2) {
            addCriterion("TRADE_TERMS not between", value1, value2, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andPrintStyleIsNull() {
            addCriterion("PRINT_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andPrintStyleIsNotNull() {
            addCriterion("PRINT_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintStyleEqualTo(String value) {
            addCriterion("PRINT_STYLE =", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleNotEqualTo(String value) {
            addCriterion("PRINT_STYLE <>", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleGreaterThan(String value) {
            addCriterion("PRINT_STYLE >", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_STYLE >=", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleLessThan(String value) {
            addCriterion("PRINT_STYLE <", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleLessThanOrEqualTo(String value) {
            addCriterion("PRINT_STYLE <=", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleLike(String value) {
            addCriterion("PRINT_STYLE like", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleNotLike(String value) {
            addCriterion("PRINT_STYLE not like", value, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleIn(List<String> values) {
            addCriterion("PRINT_STYLE in", values, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleNotIn(List<String> values) {
            addCriterion("PRINT_STYLE not in", values, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleBetween(String value1, String value2) {
            addCriterion("PRINT_STYLE between", value1, value2, "printStyle");
            return (Criteria) this;
        }

        public Criteria andPrintStyleNotBetween(String value1, String value2) {
            addCriterion("PRINT_STYLE not between", value1, value2, "printStyle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNull() {
            addCriterion("CREATE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNotNull() {
            addCriterion("CREATE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptEqualTo(String value) {
            addCriterion("CREATE_DEPT =", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotEqualTo(String value) {
            addCriterion("CREATE_DEPT <>", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThan(String value) {
            addCriterion("CREATE_DEPT >", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT >=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThan(String value) {
            addCriterion("CREATE_DEPT <", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT <=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLike(String value) {
            addCriterion("CREATE_DEPT like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotLike(String value) {
            addCriterion("CREATE_DEPT not like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIn(List<String> values) {
            addCriterion("CREATE_DEPT in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotIn(List<String> values) {
            addCriterion("CREATE_DEPT not in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT not between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
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