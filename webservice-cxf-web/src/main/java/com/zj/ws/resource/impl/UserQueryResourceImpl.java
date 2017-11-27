package com.zj.ws.resource.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.zj.ws.message.entity.User;
import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserCxfResponse;
import com.zj.ws.resource.QueryaUserCxfResource;

/**
 * @Description: 用户查询实现类
 * @author Jian Jang
 * @version 1.0 2017年9月15日
 */
@WebService(endpointInterface = "com.zj.ws.resource.QueryaUserCxfResource")
public class UserQueryResourceImpl implements QueryaUserCxfResource {

	@Override
	public QueryUserCxfResponse queryUsers(QueryUserRequest request) {
		System.out.println("request>>>>"+JsonUtils.obj2JsonString(request));
		QueryUserCxfResponse response = new QueryUserCxfResponse();
		List<User> list = new ArrayList<User>();
		User u1 = new User();
		u1.setId(2001);
		u1.setName("张三");
		u1.setAge(22);
		u1.setEmail("zhangsan@ips.com");
		u1.setGender("Male");
		list.add(u1);
		list.add(u1);
		list.add(u1);
		list.add(u1);
		list.add(u1);
		response.setCount(5);
		response.setRepCode("000000");
		response.setRepMsg("查询成功");
		//response.setUserList(list.toArray(new User[] {}));
		response.setListUsers(list);
		System.out.println("response>>>>"+JsonUtils.obj2JsonString(response));
		return response;
	}

}
