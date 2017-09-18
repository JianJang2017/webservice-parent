/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor, 
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 *
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.zj.ws.message.response;

import java.util.List;

import com.zj.ws.message.Message;
import com.zj.ws.message.entity.User;

/**
 * @Description: 用户信息查询响应实体
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class QueryUserJerseyResponse extends Message {

	private static final long serialVersionUID = -8422103409414297969L;
	/**
	 * 总记录数
	 */
	private int count;
	/**
	 * cxf不会出现axis2中自定义POJO集合（axis2只能使用数组[]传输）无法实例化现象
	 */
	private List<User> listUsers;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}

}
