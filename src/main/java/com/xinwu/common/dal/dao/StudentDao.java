package com.xinwu.common.dal.dao;

import com.xinwu.common.dal.pojo.StudentDo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentDao {


    @Select("select * from student where id = #{id}")
    StudentDo selectById(Integer id);


    int insertStudent(StudentDo studentDo);
}