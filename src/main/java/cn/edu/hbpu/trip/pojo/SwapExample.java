package cn.edu.hbpu.trip.pojo;

import java.util.ArrayList;
import java.util.List;

public class SwapExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public SwapExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
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
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
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

        public Criteria andPicidIsNull() {
            addCriterion("picid is null");
            return (Criteria) this;
        }

        public Criteria andPicidIsNotNull() {
            addCriterion("picid is not null");
            return (Criteria) this;
        }

        public Criteria andPicidEqualTo(Integer value) {
            addCriterion("picid =", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotEqualTo(Integer value) {
            addCriterion("picid <>", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThan(Integer value) {
            addCriterion("picid >", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("picid >=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThan(Integer value) {
            addCriterion("picid <", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThanOrEqualTo(Integer value) {
            addCriterion("picid <=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidIn(List<Integer> values) {
            addCriterion("picid in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotIn(List<Integer> values) {
            addCriterion("picid not in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidBetween(Integer value1, Integer value2) {
            addCriterion("picid between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotBetween(Integer value1, Integer value2) {
            addCriterion("picid not between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andSwappicIsNull() {
            addCriterion("swappic is null");
            return (Criteria) this;
        }

        public Criteria andSwappicIsNotNull() {
            addCriterion("swappic is not null");
            return (Criteria) this;
        }

        public Criteria andSwappicEqualTo(String value) {
            addCriterion("swappic =", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicNotEqualTo(String value) {
            addCriterion("swappic <>", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicGreaterThan(String value) {
            addCriterion("swappic >", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicGreaterThanOrEqualTo(String value) {
            addCriterion("swappic >=", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicLessThan(String value) {
            addCriterion("swappic <", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicLessThanOrEqualTo(String value) {
            addCriterion("swappic <=", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicLike(String value) {
            addCriterion("swappic like", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicNotLike(String value) {
            addCriterion("swappic not like", value, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicIn(List<String> values) {
            addCriterion("swappic in", values, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicNotIn(List<String> values) {
            addCriterion("swappic not in", values, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicBetween(String value1, String value2) {
            addCriterion("swappic between", value1, value2, "swappic");
            return (Criteria) this;
        }

        public Criteria andSwappicNotBetween(String value1, String value2) {
            addCriterion("swappic not between", value1, value2, "swappic");
            return (Criteria) this;
        }

        public Criteria andDifidIsNull() {
            addCriterion("difid is null");
            return (Criteria) this;
        }

        public Criteria andDifidIsNotNull() {
            addCriterion("difid is not null");
            return (Criteria) this;
        }

        public Criteria andDifidEqualTo(Integer value) {
            addCriterion("difid =", value, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidNotEqualTo(Integer value) {
            addCriterion("difid <>", value, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidGreaterThan(Integer value) {
            addCriterion("difid >", value, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidGreaterThanOrEqualTo(Integer value) {
            addCriterion("difid >=", value, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidLessThan(Integer value) {
            addCriterion("difid <", value, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidLessThanOrEqualTo(Integer value) {
            addCriterion("difid <=", value, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidIn(List<Integer> values) {
            addCriterion("difid in", values, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidNotIn(List<Integer> values) {
            addCriterion("difid not in", values, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidBetween(Integer value1, Integer value2) {
            addCriterion("difid between", value1, value2, "difid");
            return (Criteria) this;
        }

        public Criteria andDifidNotBetween(Integer value1, Integer value2) {
            addCriterion("difid not between", value1, value2, "difid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swap
     *
     * @mbggenerated do_not_delete_during_merge Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swap
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
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