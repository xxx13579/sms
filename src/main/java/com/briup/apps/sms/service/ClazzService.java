package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.School;

public interface ClazzService {

	List<School> selectAll();

	void saveOrUpdate(School school) throws Exception;
}