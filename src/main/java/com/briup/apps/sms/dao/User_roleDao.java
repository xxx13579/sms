package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User_role;

public interface User_roleDao {
	//查询所有
List<User_role> selectAll() ;
//插入
void insert(User_role user_role);
//更新
void update(User_role user_role);
}
