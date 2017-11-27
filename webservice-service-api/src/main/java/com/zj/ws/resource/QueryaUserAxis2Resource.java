package com.zj.ws.resource;

import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserAxis2Response;

/**
 * @Description: 用户信息查询服务接口
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public interface QueryaUserAxis2Resource {
	/**
	 * 用户信息查询方法
	 * @param request
	 * @return
	 */
	QueryUserAxis2Response queryUsers(QueryUserRequest request);

}
