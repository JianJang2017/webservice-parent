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

import com.zj.ws.message.Message;
import com.zj.ws.message.entity.User;

/**
 * @Description: 用户信息查询响应实体
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class QueryUserAxis2Response extends Message {

	private static final long serialVersionUID = 1576282285249356507L;
	/**
	 * 总记录数
	 */
	private int count;
	/**
	 * 查询结果集合:由于list无法序列化，所以此处只能使用数组，否则报错
	 */
	private User[] userList;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public User[] getUserList() {
		return userList;
	}

	public void setUserList(User[] userList) {
		this.userList = userList;
	}

}
