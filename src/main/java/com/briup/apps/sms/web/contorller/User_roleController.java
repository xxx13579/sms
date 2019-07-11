package com.briup.apps.sms.web.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.User_role;
import com.briup.apps.sms.service.User_roleService;

@RestController
@RequestMapping("/User_role")
public class User_roleController {

	@Autowired
	private User_roleService User_roleService;
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(User_role user_role) {
		try {
			User_roleService.saveOrUpdate(user_role);
			return "保存或更新成功";
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	// http://localhost:8080/User_role/selectAll
	@GetMapping("selectAll")
	public List<User_role> selectAll(){
		return User_roleService.selectAll();
	}

//http://localhost:8080/user_role/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
		    User_roleService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}
}