package cn.edu.hbpu.trip.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public GoodsinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
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
     * This method corresponds to the database table goodsinfo
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
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
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
     * This class corresponds to the database table goodsinfo
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

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andAdviceidIsNull() {
            addCriterion("adviceid is null");
            return (Criteria) this;
        }

        public Criteria andAdviceidIsNotNull() {
            addCriterion("adviceid is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceidEqualTo(Integer value) {
            addCriterion("adviceid =", value, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidNotEqualTo(Integer value) {
            addCriterion("adviceid <>", value, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidGreaterThan(Integer value) {
            addCriterion("adviceid >", value, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adviceid >=", value, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidLessThan(Integer value) {
            addCriterion("adviceid <", value, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidLessThanOrEqualTo(Integer value) {
            addCriterion("adviceid <=", value, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidIn(List<Integer> values) {
            addCriterion("adviceid in", values, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidNotIn(List<Integer> values) {
            addCriterion("adviceid not in", values, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidBetween(Integer value1, Integer value2) {
            addCriterion("adviceid between", value1, value2, "adviceid");
            return (Criteria) this;
        }

        public Criteria andAdviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("adviceid not between", value1, value2, "adviceid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFirstpicIsNull() {
            addCriterion("firstpic is null");
            return (Criteria) this;
        }

        public Criteria andFirstpicIsNotNull() {
            addCriterion("firstpic is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpicEqualTo(String value) {
            addCriterion("firstpic =", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicNotEqualTo(String value) {
            addCriterion("firstpic <>", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicGreaterThan(String value) {
            addCriterion("firstpic >", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicGreaterThanOrEqualTo(String value) {
            addCriterion("firstpic >=", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicLessThan(String value) {
            addCriterion("firstpic <", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicLessThanOrEqualTo(String value) {
            addCriterion("firstpic <=", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicLike(String value) {
            addCriterion("firstpic like", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicNotLike(String value) {
            addCriterion("firstpic not like", value, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicIn(List<String> values) {
            addCriterion("firstpic in", values, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicNotIn(List<String> values) {
            addCriterion("firstpic not in", values, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicBetween(String value1, String value2) {
            addCriterion("firstpic between", value1, value2, "firstpic");
            return (Criteria) this;
        }

        public Criteria andFirstpicNotBetween(String value1, String value2) {
            addCriterion("firstpic not between", value1, value2, "firstpic");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNull() {
            addCriterion("appraise is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNotNull() {
            addCriterion("appraise is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseEqualTo(Float value) {
            addCriterion("appraise =", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotEqualTo(Float value) {
            addCriterion("appraise <>", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThan(Float value) {
            addCriterion("appraise >", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThanOrEqualTo(Float value) {
            addCriterion("appraise >=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThan(Float value) {
            addCriterion("appraise <", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThanOrEqualTo(Float value) {
            addCriterion("appraise <=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseIn(List<Float> values) {
            addCriterion("appraise in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotIn(List<Float> values) {
            addCriterion("appraise not in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseBetween(Float value1, Float value2) {
            addCriterion("appraise between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotBetween(Float value1, Float value2) {
            addCriterion("appraise not between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andRouteIsNull() {
            addCriterion("route is null");
            return (Criteria) this;
        }

        public Criteria andRouteIsNotNull() {
            addCriterion("route is not null");
            return (Criteria) this;
        }

        public Criteria andRouteEqualTo(String value) {
            addCriterion("route =", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotEqualTo(String value) {
            addCriterion("route <>", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThan(String value) {
            addCriterion("route >", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThanOrEqualTo(String value) {
            addCriterion("route >=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThan(String value) {
            addCriterion("route <", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThanOrEqualTo(String value) {
            addCriterion("route <=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLike(String value) {
            addCriterion("route like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotLike(String value) {
            addCriterion("route not like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteIn(List<String> values) {
            addCriterion("route in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotIn(List<String> values) {
            addCriterion("route not in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteBetween(String value1, String value2) {
            addCriterion("route between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotBetween(String value1, String value2) {
            addCriterion("route not between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andClubinfoIsNull() {
            addCriterion("clubinfo is null");
            return (Criteria) this;
        }

        public Criteria andClubinfoIsNotNull() {
            addCriterion("clubinfo is not null");
            return (Criteria) this;
        }

        public Criteria andClubinfoEqualTo(String value) {
            addCriterion("clubinfo =", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoNotEqualTo(String value) {
            addCriterion("clubinfo <>", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoGreaterThan(String value) {
            addCriterion("clubinfo >", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoGreaterThanOrEqualTo(String value) {
            addCriterion("clubinfo >=", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoLessThan(String value) {
            addCriterion("clubinfo <", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoLessThanOrEqualTo(String value) {
            addCriterion("clubinfo <=", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoLike(String value) {
            addCriterion("clubinfo like", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoNotLike(String value) {
            addCriterion("clubinfo not like", value, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoIn(List<String> values) {
            addCriterion("clubinfo in", values, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoNotIn(List<String> values) {
            addCriterion("clubinfo not in", values, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoBetween(String value1, String value2) {
            addCriterion("clubinfo between", value1, value2, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubinfoNotBetween(String value1, String value2) {
            addCriterion("clubinfo not between", value1, value2, "clubinfo");
            return (Criteria) this;
        }

        public Criteria andClubtelIsNull() {
            addCriterion("clubtel is null");
            return (Criteria) this;
        }

        public Criteria andClubtelIsNotNull() {
            addCriterion("clubtel is not null");
            return (Criteria) this;
        }

        public Criteria andClubtelEqualTo(String value) {
            addCriterion("clubtel =", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelNotEqualTo(String value) {
            addCriterion("clubtel <>", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelGreaterThan(String value) {
            addCriterion("clubtel >", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelGreaterThanOrEqualTo(String value) {
            addCriterion("clubtel >=", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelLessThan(String value) {
            addCriterion("clubtel <", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelLessThanOrEqualTo(String value) {
            addCriterion("clubtel <=", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelLike(String value) {
            addCriterion("clubtel like", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelNotLike(String value) {
            addCriterion("clubtel not like", value, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelIn(List<String> values) {
            addCriterion("clubtel in", values, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelNotIn(List<String> values) {
            addCriterion("clubtel not in", values, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelBetween(String value1, String value2) {
            addCriterion("clubtel between", value1, value2, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtelNotBetween(String value1, String value2) {
            addCriterion("clubtel not between", value1, value2, "clubtel");
            return (Criteria) this;
        }

        public Criteria andClubtitleIsNull() {
            addCriterion("clubtitle is null");
            return (Criteria) this;
        }

        public Criteria andClubtitleIsNotNull() {
            addCriterion("clubtitle is not null");
            return (Criteria) this;
        }

        public Criteria andClubtitleEqualTo(String value) {
            addCriterion("clubtitle =", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleNotEqualTo(String value) {
            addCriterion("clubtitle <>", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleGreaterThan(String value) {
            addCriterion("clubtitle >", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("clubtitle >=", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleLessThan(String value) {
            addCriterion("clubtitle <", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleLessThanOrEqualTo(String value) {
            addCriterion("clubtitle <=", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleLike(String value) {
            addCriterion("clubtitle like", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleNotLike(String value) {
            addCriterion("clubtitle not like", value, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleIn(List<String> values) {
            addCriterion("clubtitle in", values, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleNotIn(List<String> values) {
            addCriterion("clubtitle not in", values, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleBetween(String value1, String value2) {
            addCriterion("clubtitle between", value1, value2, "clubtitle");
            return (Criteria) this;
        }

        public Criteria andClubtitleNotBetween(String value1, String value2) {
            addCriterion("clubtitle not between", value1, value2, "clubtitle");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goodsinfo
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
     * This class corresponds to the database table goodsinfo
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