package com.liucw.resumeGenerator.dao;

import com.liucw.resumeGenerator.entity.Specialty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SpecialtyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kkb_specialty
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kkb_specialty
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    int insert(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kkb_specialty
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    Specialty selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kkb_specialty
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    List<Specialty> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kkb_specialty
     *
     * @mbg.generated Fri Mar 12 22:46:12 CST 2021
     */
    int updateByPrimaryKey(Specialty record);

    /**
     * 根据userId查询对应特长
     **/
    List<Specialty> selectByUserKey(Integer id);
}