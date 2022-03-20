package cn.edu.hbpu.trip.mapper;

import cn.edu.hbpu.trip.pojo.Contentinfo;
import cn.edu.hbpu.trip.pojo.ContentinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface ContentinfoMapper {
    //查询所有的留言
    @Select("select * from contentinfo where goodsid=#{goodsid}")
    @Results({
            @Result(property = "user", column = "uid",
                    one = @One(select = "cn.edu.hbpu.trip.mapper.UserMapper.getUserinfo"))
    })
    List<Contentinfo> getContent(int goodsid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int countByExample(ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int deleteByExample(ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer contentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int insert(Contentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int insertSelective(Contentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    List<Contentinfo> selectByExampleWithBLOBs(ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    List<Contentinfo> selectByExample(ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    Contentinfo selectByPrimaryKey(Integer contentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") Contentinfo record, @Param("example") ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExampleWithBLOBs(@Param("record") Contentinfo record, @Param("example") ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExample(@Param("record") Contentinfo record, @Param("example") ContentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(Contentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByPrimaryKeyWithBLOBs(Contentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByPrimaryKey(Contentinfo record);
}