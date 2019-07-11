package com.briup.apps.sms.web.contorller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Chengfa;
import com.briup.apps.sms.service.ChengfaService;

@RestController
@RequestMapping("/chengfa")
public class ChengfaController{

	@Autowired
	private ChengfaService chengfaService;

	// http://localhost:8080/chengfaService;
	@GetMapping("selectAll")
	public List<Chengfa> selectAll(){
		return chengfaService.selectAll();
	}
// http://localhost:8080/college/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			chengfaService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}
}

