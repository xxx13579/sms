package com.briup.apps.sms.web.contorller;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.service.RoleService;
import com.briup.apps.sms.service.SchoolService;
	
	@RestController
	@RequestMapping("/role")
	public class RloeController {
	
		@Autowired
		private RoleService roleService;
	
		// http://localhost:8080/role/selectAll
		@GetMapping("selectAll")
		public List<Role> selectAll(){
			return roleService.selectAll();
		}
	
}