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

import java.net.MalformedURLException;

import javax.ws.rs.core.MediaType;
import org.springframework.http.HttpStatus;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserJerseyResponse;

/**
 * @Description: 服务接口测试
 *               服务地址检查地址：http://localhost:8080/webservice-jersey-web/resource
 *               /application.wadl
 *               服务地址：http://localhost:8080/webservice-jersey-web/resource/users/queryUsers
 * 
 * @author Jian Jang
 * @version 1.0 2017年9月15日
 */
public class UserQueryResourceImplTest {

	/**
	 * Test method for
	 * {@link com.zj.ws.resource.impl.UserQueryResourceImpl#queryUsers(com.zj.ws.message.request.QueryUserRequest)}
	 * .
	 * @throws MalformedURLException
	 */
	public static void main(String args[]) throws MalformedURLException {
		String wsUrl = "http://localhost:8080/webservice-jersey-web/resource/users/queryUsers";
		Client client = Client.create();

		WebResource webResource = client.resource(wsUrl);

		 ClientResponse response = (ClientResponse)webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,JsonUtils.obj2JsonString(new QueryUserRequest()));
		if (response.getStatus() != HttpStatus.OK.value()) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		QueryUserJerseyResponse output = response.getEntity(QueryUserJerseyResponse.class);
		System.out.println(JsonUtils.obj2JsonString(output));

		
		
	}

}
