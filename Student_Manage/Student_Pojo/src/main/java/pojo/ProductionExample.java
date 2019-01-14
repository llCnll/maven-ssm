package pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andProductionIsNull() {
            addCriterion("production is null");
            return (Criteria) this;
        }

        public Criteria andProductionIsNotNull() {
            addCriterion("production is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEqualTo(String value) {
            addCriterion("production =", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotEqualTo(String value) {
            addCriterion("production <>", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThan(String value) {
            addCriterion("production >", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThanOrEqualTo(String value) {
            addCriterion("production >=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThan(String value) {
            addCriterion("production <", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThanOrEqualTo(String value) {
            addCriterion("production <=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLike(String value) {
            addCriterion("production like", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotLike(String value) {
            addCriterion("production not like", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionIn(List<String> values) {
            addCriterion("production in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotIn(List<String> values) {
            addCriterion("production not in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionBetween(String value1, String value2) {
            addCriterion("production between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotBetween(String value1, String value2) {
            addCriterion("production not between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCachetIsNull() {
            addCriterion("cachet is null");
            return (Criteria) this;
        }

        public Criteria andCachetIsNotNull() {
            addCriterion("cachet is not null");
            return (Criteria) this;
        }

        public Criteria andCachetEqualTo(String value) {
            addCriterion("cachet =", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotEqualTo(String value) {
            addCriterion("cachet <>", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetGreaterThan(String value) {
            addCriterion("cachet >", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetGreaterThanOrEqualTo(String value) {
            addCriterion("cachet >=", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetLessThan(String value) {
            addCriterion("cachet <", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetLessThanOrEqualTo(String value) {
            addCriterion("cachet <=", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetLike(String value) {
            addCriterion("cachet like", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotLike(String value) {
            addCriterion("cachet not like", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetIn(List<String> values) {
            addCriterion("cachet in", values, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotIn(List<String> values) {
            addCriterion("cachet not in", values, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetBetween(String value1, String value2) {
            addCriterion("cachet between", value1, value2, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotBetween(String value1, String value2) {
            addCriterion("cachet not between", value1, value2, "cachet");
            return (Criteria) this;
        }

        public Criteria andBooktimeIsNull() {
            addCriterion("booktime is null");
            return (Criteria) this;
        }

        public Criteria andBooktimeIsNotNull() {
            addCriterion("booktime is not null");
            return (Criteria) this;
        }

        public Criteria andBooktimeEqualTo(String value) {
            addCriterion("booktime =", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotEqualTo(String value) {
            addCriterion("booktime <>", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeGreaterThan(String value) {
            addCriterion("booktime >", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeGreaterThanOrEqualTo(String value) {
            addCriterion("booktime >=", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeLessThan(String value) {
            addCriterion("booktime <", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeLessThanOrEqualTo(String value) {
            addCriterion("booktime <=", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeLike(String value) {
            addCriterion("booktime like", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotLike(String value) {
            addCriterion("booktime not like", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeIn(List<String> values) {
            addCriterion("booktime in", values, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotIn(List<String> values) {
            addCriterion("booktime not in", values, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeBetween(String value1, String value2) {
            addCriterion("booktime between", value1, value2, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotBetween(String value1, String value2) {
            addCriterion("booktime not between", value1, value2, "booktime");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(String value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(String value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(String value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(String value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(String value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(String value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLike(String value) {
            addCriterion("member like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotLike(String value) {
            addCriterion("member not like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<String> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<String> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(String value1, String value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(String value1, String value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNull() {
            addCriterion("teachernum is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNotNull() {
            addCriterion("teachernum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumEqualTo(String value) {
            addCriterion("teachernum =", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotEqualTo(String value) {
            addCriterion("teachernum <>", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThan(String value) {
            addCriterion("teachernum >", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThanOrEqualTo(String value) {
            addCriterion("teachernum >=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThan(String value) {
            addCriterion("teachernum <", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThanOrEqualTo(String value) {
            addCriterion("teachernum <=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLike(String value) {
            addCriterion("teachernum like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotLike(String value) {
            addCriterion("teachernum not like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIn(List<String> values) {
            addCriterion("teachernum in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotIn(List<String> values) {
            addCriterion("teachernum not in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumBetween(String value1, String value2) {
            addCriterion("teachernum between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotBetween(String value1, String value2) {
            addCriterion("teachernum not between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andStunumIsNull() {
            addCriterion("stunum is null");
            return (Criteria) this;
        }

        public Criteria andStunumIsNotNull() {
            addCriterion("stunum is not null");
            return (Criteria) this;
        }

        public Criteria andStunumEqualTo(String value) {
            addCriterion("stunum =", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotEqualTo(String value) {
            addCriterion("stunum <>", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThan(String value) {
            addCriterion("stunum >", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThanOrEqualTo(String value) {
            addCriterion("stunum >=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThan(String value) {
            addCriterion("stunum <", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThanOrEqualTo(String value) {
            addCriterion("stunum <=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLike(String value) {
            addCriterion("stunum like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotLike(String value) {
            addCriterion("stunum not like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumIn(List<String> values) {
            addCriterion("stunum in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotIn(List<String> values) {
            addCriterion("stunum not in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumBetween(String value1, String value2) {
            addCriterion("stunum between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotBetween(String value1, String value2) {
            addCriterion("stunum not between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Float value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Float value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Float value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Float value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Float value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Float> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Float> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Float value1, Float value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Float value1, Float value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andFacultynumIsNull() {
            addCriterion("facultynum is null");
            return (Criteria) this;
        }

        public Criteria andFacultynumIsNotNull() {
            addCriterion("facultynum is not null");
            return (Criteria) this;
        }

        public Criteria andFacultynumEqualTo(Integer value) {
            addCriterion("facultynum =", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumNotEqualTo(Integer value) {
            addCriterion("facultynum <>", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumGreaterThan(Integer value) {
            addCriterion("facultynum >", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("facultynum >=", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumLessThan(Integer value) {
            addCriterion("facultynum <", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumLessThanOrEqualTo(Integer value) {
            addCriterion("facultynum <=", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumIn(List<Integer> values) {
            addCriterion("facultynum in", values, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumNotIn(List<Integer> values) {
            addCriterion("facultynum not in", values, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumBetween(Integer value1, Integer value2) {
            addCriterion("facultynum between", value1, value2, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumNotBetween(Integer value1, Integer value2) {
            addCriterion("facultynum not between", value1, value2, "facultynum");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNull() {
            addCriterion("majornum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("majornum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(Integer value) {
            addCriterion("majornum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(Integer value) {
            addCriterion("majornum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(Integer value) {
            addCriterion("majornum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("majornum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(Integer value) {
            addCriterion("majornum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(Integer value) {
            addCriterion("majornum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<Integer> values) {
            addCriterion("majornum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<Integer> values) {
            addCriterion("majornum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(Integer value1, Integer value2) {
            addCriterion("majornum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(Integer value1, Integer value2) {
            addCriterion("majornum not between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andGradenumIsNull() {
            addCriterion("gradenum is null");
            return (Criteria) this;
        }

        public Criteria andGradenumIsNotNull() {
            addCriterion("gradenum is not null");
            return (Criteria) this;
        }

        public Criteria andGradenumEqualTo(Integer value) {
            addCriterion("gradenum =", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumNotEqualTo(Integer value) {
            addCriterion("gradenum <>", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumGreaterThan(Integer value) {
            addCriterion("gradenum >", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradenum >=", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumLessThan(Integer value) {
            addCriterion("gradenum <", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumLessThanOrEqualTo(Integer value) {
            addCriterion("gradenum <=", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumIn(List<Integer> values) {
            addCriterion("gradenum in", values, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumNotIn(List<Integer> values) {
            addCriterion("gradenum not in", values, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumBetween(Integer value1, Integer value2) {
            addCriterion("gradenum between", value1, value2, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumNotBetween(Integer value1, Integer value2) {
            addCriterion("gradenum not between", value1, value2, "gradenum");
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