package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Chengfa;

public interface ChengfaService { 

	List<Chengfa> selectAll();

	void saveOrUpdate(Chengfa chengfa) throws Exception;

}
