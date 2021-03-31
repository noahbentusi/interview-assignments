package com.sequoiacap.data;


import java.io.Serializable;
import java.util.HashMap;

public class Response<T>
	implements Serializable
{
	private static final long serialVersionUID = 2318866198328783813L;

	/**
	 * 状态值
	 */
	private Integer status = 200;
	
	/**
	 * 错误信息
	 */
	private String message;
	
	/**
	 * 验证码
	 */
	private String nbCode;
	
	/**
	 * 数据
	 */
	private T result;
	
	private HashMap<String, Object> attach = new HashMap<String, Object>();

	public T getResult()
	{
		return result;
	}

	public void setResult(T result)
	{
		this.result = result;
	}

	public String getNbCode() {
		return nbCode;
	}

	public void setNbCode(String nbCode) {
		this.nbCode = nbCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HashMap<String, Object> getAttach() {
		return attach;
	}

	public void setAttach(HashMap<String, Object> attach) {
		this.attach = attach;
	}
}
