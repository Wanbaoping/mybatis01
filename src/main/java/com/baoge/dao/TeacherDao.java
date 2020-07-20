package com.baoge.dao;

import com.baoge.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TeacherDao {

    public Teacher getTeacherById(Integer id);

    public List<Teacher> getTeachers();
}
