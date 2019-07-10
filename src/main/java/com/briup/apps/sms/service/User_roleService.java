package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.User_role;

public interface User_roleService {
List<User_role>selectAll();
void saveorUpdate(User_role user_role)throws Exception;
}
