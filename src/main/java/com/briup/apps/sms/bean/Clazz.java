package com.briup.apps.sms.bean;

public class Clazz {
	private Long id;
	private String name;
	private String begin_time;
	private Long college_id;
	
	public Long getCollege_id() {
		return college_id;
	}
	public void setCollege_id(Long college_id) {
		this.college_id = college_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(String begin_time) {
		this.begin_time = begin_time;
	}
}
