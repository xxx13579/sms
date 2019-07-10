package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.dao.Student_CourseDao;
import com.briup.apps.sms.service.Student_CourseService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public  class Student_CourseServicelmp 
	implements Student_CourseService {
	// 依赖注入，实例化Student_CourseDao并且赋值给student_courseDao这个变量
	@Resource
	private Student_CourseDao student_courseDao;
	@Override
	public List<Student_Course> selectAll() {
		// TODO Auto-generated method stub
		return student_courseDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Student_Course student_course) throws Exception {
		if(student_course.getId()==null) {
			student_courseDao.insert(student_course);
		} 
		else {
			student_courseDao.update(student_course);
	}


	
	}

}



