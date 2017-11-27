package com.zj.ws.resource.impl;

import java.net.MalformedURLException;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserCxfResponse;
import com.zj.ws.resource.QueryaUserCxfResource;

/**
 * @Description: 服务接口测试
 * 服务地址：http://localhost:8080/webservice-cxf-web/services/users?wsdl
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
		String wsUrl="http://localhost:8080/webservice-cxf-web/services/users?wsdl";
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		//请求日志拦截器
		factoryBean.getInInterceptors().add(new LoggingInInterceptor());
		//请求响应日志拦截器
		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		factoryBean.setServiceClass(QueryaUserCxfResource.class);
		factoryBean.setAddress(wsUrl);
		QueryaUserCxfResource impl = (QueryaUserCxfResource) factoryBean.create();
		QueryUserCxfResponse result = impl.queryUsers(new QueryUserRequest());
		System.out.println(JsonUtils.obj2JsonString(result));
	}

}
