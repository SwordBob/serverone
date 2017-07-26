package com.waylau.rest.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	private int respCode;
	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}
	private String respDesc;
	
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
}
