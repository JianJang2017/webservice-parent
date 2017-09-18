/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor, 
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 *
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.zj.ws.message;

import java.io.Serializable;

/**
 * @Description: 公共类
 * @author Jian Jang
 * @version 1.0 2017年9月13日
 */
public class Message implements Serializable {

	private static final long serialVersionUID = 2627648901308504501L;
	/**
	 * 应答码
	 */
	private String repCode;
	/**
	 * 应答信息
	 */
	private String repMsg;

	public String getRepCode() {
		return repCode;
	}

	public void setRepCode(String repCode) {
		this.repCode = repCode;
	}

	public String getRepMsg() {
		return repMsg;
	}

	public void setRepMsg(String repMsg) {
		this.repMsg = repMsg;
	}

}
