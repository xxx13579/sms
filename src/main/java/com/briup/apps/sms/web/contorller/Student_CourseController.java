package com.briup.apps.sms.web.contorller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.service.Student_CourseService;

@RestController
@RequestMapping("Student_Course")
public class Student_CourseController{

	@Autowired
	private Student_CourseService student_courseService;

	// http://localhost:8080/student_courseService;
	@GetMapping("selectAll")
	public List<Student_Course> selectAll(){
		return student_courseService.selectAll();
	}
}