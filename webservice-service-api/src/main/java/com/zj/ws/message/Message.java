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
