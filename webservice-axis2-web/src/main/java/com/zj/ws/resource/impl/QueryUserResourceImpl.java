package com.zj.ws.resource.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zj.ws.message.entity.User;
import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserAxis2Response;
import com.zj.ws.resource.QueryaUserAxis2Resource;

/**
 * @Description: 用户信息查询服务实现类
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
@Component("queryUserResource")
public class QueryUserResourceImpl implements QueryaUserAxis2Resource {

	@Override
	public QueryUserAxis2Response queryUsers(QueryUserRequest request) {
		System.out.println("request>>>>" + JsonUtils.obj2JsonString(request));
		QueryUserAxis2Response response = new QueryUserAxis2Response();
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
		response.setUserList(list.toArray(new User[] {}));
		System.out.println("response>>>>" + JsonUtils.obj2JsonString(response));
		return response;
	}
}
