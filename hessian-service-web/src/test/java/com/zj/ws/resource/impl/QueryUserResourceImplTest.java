package com.zj.ws.resource.impl;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zj.ws.message.request.QueryUserRequest;
import com.zj.ws.message.response.QueryUserHessianResponse;
import com.zj.ws.reource.impl.JsonUtils;
import com.zj.ws.resource.QueryUserHessianResource;

/**
 * @Description: 测试类： 服务地址
 *               http://localhost:8080/hessian-service-web/hessian/queryUsers
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class QueryUserResourceImplTest {

	public static void main(String[] args) throws Exception {
		String url = "http://localhost:8080/hessian-service-web/hessian/queryUsers";
		// Spring Hessian代理Servelet
		HessianProxyFactory factory = new HessianProxyFactory();
		QueryUserHessianResource api = (QueryUserHessianResource) factory.create(
				QueryUserHessianResource.class, url);
		QueryUserHessianResponse response = api.queryUsers(new QueryUserRequest());
		System.out.println(JsonUtils.obj2JsonString(response));
		// 也可以在客户端通过与spring整合配置调用，配置如下
		/*
		 * <!-- 客户端Hessian代理工厂Bean --> <bean id="hessianClient"
		 * class="org.springframework.remoting.caucho.HessianProxyFactoryBean">
		 * <!-- 请求代理Servlet路径 --> <property name="serviceUrl">
		 * <value>http://localhost
		 * :8080/hessian-service-web/hessian/queryUsers</value> </property> <!--
		 * 接口定义 --> <property name="serviceInterface">
		 * <value>com.zj.ws.resource.QueryUserHessianResource</value>
		 * </property> </bean>
		 */

	}

}
