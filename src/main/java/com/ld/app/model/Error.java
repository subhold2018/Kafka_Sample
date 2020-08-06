package com.ld.app.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root:Error")
public class Error {

	@XmlElement(name = "root:ErrorLevel")
	private String errorLevel;
	
	@XmlElement(name = "root:ErrorCode")
	private String errorCode;
	
	@XmlElement(name = "root:ErrorMessageText")
	private String errorMessageText;

	@Override
	public String toString() {
		return "AcccountSetupTransaction [errorLevel=" + errorLevel + ", errorCode=" + errorCode + ", errorMessageText="
				+ errorMessageText + "]";
	}
}
