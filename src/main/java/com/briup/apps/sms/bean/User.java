package com.briup.apps.sms.bean;

public class User {
	private  Long id;
	
	private   String Realname;
	
	private  Long telephone;
	
	private Long password;
	
	private Long student_no;
	
	private String gender;
	
	private Long clazz_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRealname() {
		return Realname;
	}

	public void setRealname(String realname) {
		Realname = realname;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public Long getStudent_no() {
		return student_no;
	}

	public void setStudent_no(Long student_no) {
		this.student_no = student_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getClazz_id() {
		return clazz_id;
	}

	public void setClazz_id(Long clazz_id) {
		this.clazz_id = clazz_id;
	}
	
	
}
