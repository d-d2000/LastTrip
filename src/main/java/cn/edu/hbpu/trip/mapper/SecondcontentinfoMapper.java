package cn.edu.hbpu.trip.mapper;

import cn.edu.hbpu.trip.pojo.Secondcontentinfo;
import cn.edu.hbpu.trip.pojo.SecondcontentinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondcontentinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int countByExample(SecondcontentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int deleteByExample(SecondcontentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int insert(Secondcontentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int insertSelective(Secondcontentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    List<Secondcontentinfo> selectByExampleWithBLOBs(SecondcontentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    List<Secondcontentinfo> selectByExample(SecondcontentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") Secondcontentinfo record, @Param("example") SecondcontentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExampleWithBLOBs(@Param("record") Secondcontentinfo record, @Param("example") SecondcontentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondcontentinfo
     *
     * @mbggenerated Sun Dec 19 11:02:10 GMT+08:00 2021
     */
    int updateByExample(@Param("record") Secondcontentinfo record, @Param("example") SecondcontentinfoExample example);
}