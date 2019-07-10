package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.User_role;
import com.briup.apps.sms.dao.User_roleDao;
import com.briup.apps.sms.service.User_roleService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class User_roleServicelmp implements User_roleService {
	// 依赖注入，实例化User_roleDao并且赋值给user_roleDao这个变量
	@Resource
	private User_roleDao user_roleDao;


	
	@Override
	public List<User_role> selectAll(){
	return user_roleDao.selectAll();	
	}
	@Override
	public void saveorUpdate(User_role user_role) throws Exception {
		// TODO Auto-generated method stub
		if(user_role.getId()==null) {
			user_roleDao.insert(user_role);
		} else {
			user_roleDao.update(user_role);
		}
	}
}
