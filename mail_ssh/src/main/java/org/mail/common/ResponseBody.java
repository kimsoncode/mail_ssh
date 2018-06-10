package org.mail.common;

import org.mail.util.JsonUtil;

/**
 * 响应�?
 * @author VIC
 *
 */
public class ResponseBody {
	
	// 响应状�?�码: 200表示请求成功
	private int status = 200;
	// 响应数据内容
	private Object data;
	// 响应的消息描�?
	private String message;
	
	public String toJson(){
		return JsonUtil.toJson(this);
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseBody [status=" + status + ", data=" + data + ", message=" + message + "]";
	}
	
}
