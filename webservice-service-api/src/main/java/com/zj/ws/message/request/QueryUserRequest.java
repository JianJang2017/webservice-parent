package com.zj.ws.message.request;

import java.io.Serializable;

/**
 * @Description: 用户查询请求实体
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class QueryUserRequest implements Serializable {

	private static final long serialVersionUID = 1553735580446836159L;

	private Integer id;

	private String name;

	private String gender;

	private String email;

	private int age;
	/**
	 * 页码
	 */
	private int start;
	/**
	 * 页大小
	 */
	private int limit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
