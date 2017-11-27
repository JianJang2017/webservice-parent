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
