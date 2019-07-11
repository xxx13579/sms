package com.briup.apps.sms.service.impl;
import java.util.List;
import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Course;

import com.briup.apps.sms.dao.CourseDao;

import com.briup.apps.sms.service.CourseService;


/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
<<<<<<< HEAD
public  class CourseServiceImpl implements CourseService {
=======
public class CourseServiceImpl implements CourseService {
>>>>>>> 213bbb74fe7258360918a743a8699ea4577b884d
	// 依赖注入，实例化CourseDao并且赋值给schoolDao这个变量
	@Resource
	private CourseDao courseDao;
	@Override
	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		return courseDao.selectAll();
	}
	@Override
	public void saveOrUpdate(Course course) throws Exception {
		if(course.getId()==null) {
			courseDao.insert(course);
		} 
		else {
			courseDao.update(course);
	}
	}
	@Override
	public void deleteById(long id) throws Exception {
		courseDao.delectById(id);
	}
	
}



