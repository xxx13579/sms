package com.briup.apps.sms.service.impl;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.service.SchoolService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public  class ClazzServiceImpl 
	implements SchoolService {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private SchoolDao clazzDao;
	@Override
	public List<School> selectAll() {
		// TODO Auto-generated method stub
		return clazzDao.selectAll();
	}

	@Override
	public void saveOrUpdate(School school) throws Exception {
		if(school.getId()==null) {
			clazzDao.insert(school);
		} 
		else {
			clazzDao.update(school);
	}


	
	}

}


