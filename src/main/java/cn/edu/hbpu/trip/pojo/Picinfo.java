package cn.edu.hbpu.trip.pojo;

public class Picinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picinfo.picid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private Integer picid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picinfo.goodsid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picinfo.goodspic
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    private String goodspic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picinfo.picid
     *
     * @return the value of picinfo.picid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public Integer getPicid() {
        return picid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picinfo.picid
     *
     * @param picid the value for picinfo.picid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picinfo.goodsid
     *
     * @return the value of picinfo.goodsid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picinfo.goodsid
     *
     * @param goodsid the value for picinfo.goodsid
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picinfo.goodspic
     *
     * @return the value of picinfo.goodspic
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public String getGoodspic() {
        return goodspic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picinfo.goodspic
     *
     * @param goodspic the value for picinfo.goodspic
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic == null ? null : goodspic.trim();
    }
}