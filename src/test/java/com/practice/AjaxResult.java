package com.practice;

import java.util.Map;

/**
 * Ajax返回消息bean
 * @author liuzhengyang
 * Email 1403568240@qq.com
 * Date ： 2015年3月25日
 */
public class AjaxResult {
	private int code;
	private String message;
	private Map<Object, Object> map;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	public AjaxResult(int code, String message, Map<Object, Object> map) {
		super();
		this.code = code;
		this.message = message;
		this.map = map;
	}
	public AjaxResult() {
		super();
	}
	public AjaxResult(AjaxResultBuilder ajaxBuilder) {
		this.code = ajaxBuilder.getCode();
		this.map = ajaxBuilder.getMap();
		this.message = ajaxBuilder.getMessage();
	}
	@Override
	public String toString() {
		return "AjaxResult [code=" + code + ", message=" + message + ", map="
				+ map + "]";
	}
	
}
