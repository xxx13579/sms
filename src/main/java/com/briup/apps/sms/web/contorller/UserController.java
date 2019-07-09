package com.briup.apps.sms.web.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//xxxx
@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("findAll")
	public String findAll() {
		return "hello springboot";
	}
}
