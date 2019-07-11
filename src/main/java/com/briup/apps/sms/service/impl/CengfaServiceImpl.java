package com.briup.apps.sms.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Chengfa;
import com.briup.apps.sms.dao.ChengfaDao;
import com.briup.apps.sms.service.ChengfaService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public abstract class CengfaServiceImpl 
	implements ChengfaService {
	// 依赖注入，实例化ChengfaDao并且赋值给ChengfaDao这个变量
	@Resource
	private ChengfaDao chengfaDao;
	public List<Chengfa> selectAll() {
		// TODO Auto-generated method stub
		return chengfaDao.selectAll();
	}

	public void saveOrUpdate(Chengfa chengfa) throws Exception {
		if(chengfa.getId()==null) {
			chengfaDao.insert(chengfa);
		} 
		else {
			chengfaDao.update(chengfa);
	}


	
	}

}


