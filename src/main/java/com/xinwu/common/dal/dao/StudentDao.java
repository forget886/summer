package com.xinwu.common.dal.dao;

import com.xinwu.common.dal.pojo.StudentDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao {

    @Select("select * from student where id = #{id}")
    StudentDo selectById(@Param("id") Integer id);
}