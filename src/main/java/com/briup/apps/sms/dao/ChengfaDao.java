package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Chengfa;

public interface ChengfaDao {

	void update(Chengfa chengfa);

	void insert(Chengfa chengfa);

	List<Chengfa> selectAll();

}
