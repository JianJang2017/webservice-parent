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
