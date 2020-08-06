package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AccountSetupTransaction")
public class AcccountSetupTransaction {

	@XmlElement(name = "Errors")
	private Error error;

	@Override
	public String toString() {
		return "AcccountSetupTransaction [error=" + error + "]";
	}
	
}
