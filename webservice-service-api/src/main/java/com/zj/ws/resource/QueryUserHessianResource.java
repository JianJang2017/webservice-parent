package com.zj.ws.resource;

import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserHessianResponse;

/**
 * @Description: 用户信息查询服务接口
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public interface QueryUserHessianResource {
	/**
	 * 用户信息查询方法
	 * @param request
	 * @return
	 */
	QueryUserHessianResponse queryUsers(QueryUserRequest request);

}
