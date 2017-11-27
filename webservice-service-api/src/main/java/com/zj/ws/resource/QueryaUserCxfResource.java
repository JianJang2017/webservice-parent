package com.zj.ws.resource;

import javax.jws.WebService;

import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserCxfResponse;

/**
 * @Description: 用户信息查询服务接口
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
@WebService
public interface QueryaUserCxfResource {
	/**
	 * 用户信息查询方法
	 * @param request
	 * @return
	 */
	QueryUserCxfResponse queryUsers(QueryUserRequest request);

}
