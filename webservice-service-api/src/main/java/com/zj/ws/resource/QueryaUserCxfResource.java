/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor, 
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 *
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
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
