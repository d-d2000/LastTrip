package cn.edu.hbpu.trip.pojo;

public class Glinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column glinfo.glid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private Integer glid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column glinfo.headid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private Integer headid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column glinfo.islike
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private Integer islike;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column glinfo.glctx
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private String glctx;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column glinfo.glid
     *
     * @return the value of glinfo.glid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public Integer getGlid() {
        return glid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column glinfo.glid
     *
     * @param glid the value for glinfo.glid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setGlid(Integer glid) {
        this.glid = glid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column glinfo.headid
     *
     * @return the value of glinfo.headid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public Integer getHeadid() {
        return headid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column glinfo.headid
     *
     * @param headid the value for glinfo.headid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setHeadid(Integer headid) {
        this.headid = headid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column glinfo.islike
     *
     * @return the value of glinfo.islike
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public Integer getIslike() {
        return islike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column glinfo.islike
     *
     * @param islike the value for glinfo.islike
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setIslike(Integer islike) {
        this.islike = islike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column glinfo.glctx
     *
     * @return the value of glinfo.glctx
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public String getGlctx() {
        return glctx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column glinfo.glctx
     *
     * @param glctx the value for glinfo.glctx
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setGlctx(String glctx) {
        this.glctx = glctx == null ? null : glctx.trim();
    }
}