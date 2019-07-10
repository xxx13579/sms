package com.briup.apps.sms.service;




import java.util.List;

import com.briup.apps.sms.bean.Student_Course;

public interface Student_CourseService {

	List<Student_Course> selectAll();

	void saveOrUpdate(Student_Course student_course) throws Exception;
}
