package com.briup.apps.sms.web.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.service.ClazzService;

@RestController
@RequestMapping("/clazz")
public class ClazzController {

	@Autowired
	private ClazzService clazzService;

	// http://localhost:8080/clazz/selectAll
	@GetMapping("selectAll")
	public List<Clazz> selectAll(){
		return clazzService.selectAll();
	}
	// http://localhost:8080/school/deleteById?id=3
		@GetMapping("deleteById")
		public String deleteById(long id) {
			try {
				clazzService.deleteById(id);
				return "删除成功";
			} catch (Exception e) {
				// 打印异常信息，返回异常信息
				e.printStackTrace();
				return e.getMessage();
			}
		}






}