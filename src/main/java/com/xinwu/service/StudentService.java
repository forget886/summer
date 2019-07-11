package com.xinwu.service;

import com.xinwu.common.dal.dao.StudentDao;
import com.xinwu.common.dal.pojo.StudentDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 张辉
 * @create: 2019-07-11
 **/
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void insertTest(){
        StudentDo studentDo = new StudentDo();
        studentDo.setName("李二");
        studentDo.setGrade("20");
        int i = studentDao.insertStudent(studentDo);
        System.out.println(studentDo);
        if(studentDo.getId() == 16){
            throw new RuntimeException("error");
        }

    }
}
