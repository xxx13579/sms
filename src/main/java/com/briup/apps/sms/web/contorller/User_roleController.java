package com.briup.apps.sms.web.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.User_role;
import com.briup.apps.sms.service.User_roleService;

@RestController
@RequestMapping("/User_role")
public class User_roleController {

	@Autowired
	private User_roleService User_roleService;

	// http://localhost:8080/User_role/selectAll
	@GetMapping("selectAll")
	public List<User_role> selectAll(){
		return User_roleService.selectAll();
	}





}