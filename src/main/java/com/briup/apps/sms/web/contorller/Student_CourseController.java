package com.briup.apps.sms.web.contorller;
	
import java.util.List;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.service.Student_CourseService;

@RestController
@RequestMapping("Student_Course")
public class Student_CourseController{

	@Autowired
	private Student_CourseService  student_courseService;
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Student_Course student_course) {
		try {
			student_courseService.saveOrUpdate(student_course);
			return "保存或更新成功";
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	// http://localhost:8080/student_course/selectAll
	@GetMapping("selectAll")
	public List<Student_Course> selectAll(){
		return student_courseService.selectAll();
	}
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			student_courseService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}




}
		

	