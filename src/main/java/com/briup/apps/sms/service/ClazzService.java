package com.briup.apps.sms.service;


import java.util.List;

import com.briup.apps.sms.bean.Clazz;

//yi

public interface ClazzService {

	List<Clazz> selectAll();

	void saveOrUpdate(Clazz school) throws Exception;
	
	void deleteById(long id) throws Exception;
}
