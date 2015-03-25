package com.practice;

import java.util.Map;

public class AjaxResultBuilder {
	private int code = 0;
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
	public AjaxResultBuilder(){
	}
	public AjaxResultBuilder code(int code){
		this.code = code;
		return this;
	}
	public AjaxResultBuilder message(String message){
		this.message = message;
		return this;
	}
	public AjaxResultBuilder map(Map<Object,Object> map){
		this.map = map;
		return this;
	}
	
	public AjaxResult build(){
		return new AjaxResult(this);
	}
	
	
	public static AjaxResultBuilder getBulider(){
		return new AjaxResultBuilder();
	}
}
