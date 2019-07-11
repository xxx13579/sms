package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Chengfa;

public interface ChengfaDao {
//	查询所有
	List<Chengfa> selectAll();
//	输入
	void insert(Chengfa chengfa);
//	更新
	void update(Chengfa chengfa);
	

}

