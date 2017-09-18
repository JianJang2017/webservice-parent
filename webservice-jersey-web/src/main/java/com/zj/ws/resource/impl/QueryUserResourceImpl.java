/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor, 
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 *
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.zj.ws.resource.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.zj.ws.message.entity.User;
import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserJerseyResponse;
import com.zj.ws.resource.QueryaUserJerseyResource;

/**
 * @Description: jersey rest 风格服务实现类
 * @author Jian Jang
 * @version 1.0 2017年9月15日
 */
@Component//交给spring实例化
@Path("/users")
public class QueryUserResourceImpl implements QueryaUserJerseyResource {
	@Path("/queryUsers")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public QueryUserJerseyResponse queryUsers(QueryUserRequest request) {
		System.out.println("request>>>>"+JsonUtils.obj2JsonString(request));
		QueryUserJerseyResponse response = new QueryUserJerseyResponse();
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
		// response.setUserList(list.toArray(new User[] {}));
		response.setListUsers(list);
		System.out.println("response>>>>"+JsonUtils.obj2JsonString(response));

		return response;
	}

}
