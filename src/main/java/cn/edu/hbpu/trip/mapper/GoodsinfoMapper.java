package cn.edu.hbpu.trip.mapper;

import cn.edu.hbpu.trip.pojo.Contentinfo;
import cn.edu.hbpu.trip.pojo.Goodsinfo;
import cn.edu.hbpu.trip.pojo.GoodsinfoExample;
import java.util.List;

import cn.edu.hbpu.trip.pojo.Picinfo;
import org.apache.ibatis.annotations.*;

public interface GoodsinfoMapper {
    //查询地域
    @Select("select goodsid,title,firstpic,price,num,appraise from goodsinfo where adviceid=#{adviceid}")
    List<Goodsinfo> getPartGoodsInfo(int advice);
    //查询景点的详细信息
    @Select("select title,ctx,route,clubtel,clubinfo,clubtitle from goodsinfo where goodsid=#{goodsid}")
    Goodsinfo getGoodsDetails(int goodsid);
    //查询景点信息
    @Select("select title,firstpic,price,appraise from goodsinfo where goodsid=#{goodsid}")
    Goodsinfo getShoppingGoods(int goodsid);
    @Select("select title,firstpic,price,appraise from goodsinfo where goodsid=#{goodsid}")
    List<Goodsinfo> getGoods(int goodsid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int countByExample(GoodsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int deleteByExample(GoodsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int insert(Goodsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int insertSelective(Goodsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    List<Goodsinfo> selectByExampleWithBLOBs(GoodsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    List<Goodsinfo> selectByExample(GoodsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExampleWithBLOBs(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);
}