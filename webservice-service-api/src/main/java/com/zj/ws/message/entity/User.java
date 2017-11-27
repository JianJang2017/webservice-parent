package com.zj.ws.message.entity;

import java.io.Serializable;

/**
 * @Description: 用户信息实体
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class User implements Serializable {

	private static final long serialVersionUID = 3534828834223851467L;
	private Integer id;

	private String name;

	private String gender;

	private String email;

	private int age;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

}
