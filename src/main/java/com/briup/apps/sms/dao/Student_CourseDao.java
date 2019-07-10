package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Student_Course;

public interface Student_CourseDao {
	//查询所有
	List<Student_Course>selectAll();
	//插入
void insert(Student_Course  student_course );
	//更新
	void update(Student_Course student_course);
}