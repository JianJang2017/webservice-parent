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

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserAxis2Response;

/**
 * @Description: 测试类： 服务地址
 *               http://localhost:8080/webservice-axis2-web/services/myService
 *               ?wsdl
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class QueryUserResourceImplTest {

	public static void main(String[] args) throws AxisFault {
		String url = "http://localhost:8080/webservice-axis2-web/services/myService?wsdl";
		RPCServiceClient client = new RPCServiceClient();
		Options option = client.getOptions();
		// 指定调用的URL
		EndpointReference reference = new EndpointReference(url);
		option.setTo(reference);

		/*
		 * 设置要调用的方法 http://ws.apache.org/axis2 为默认的（无package的情况）命名空间， 如果有包名，则为
		 * http://impl.resource.ws.zj.com,包名倒过来即可 method为方法名称
		 */
		Object[] params = { new QueryUserRequest() };
		QName qname = new QName("http://impl.resource.ws.zj.com", "queryUsers");

		// 调用远程方法,并指定方法参数以及返回值类型
		Object[] result = client.invokeBlocking(qname, params,
				new Class[] { QueryUserAxis2Response.class });
		System.out.println(JsonUtils.obj2JsonString(result[0]));
	}

}
