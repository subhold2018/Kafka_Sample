package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="swip:Contact_CommunicationAddress")
public class CommunicationAddress {


	@XmlAttribute(name="IsPrimaryMVG")
	private String isPrimaryMVG;
	
	@XmlElement(name="swip:AlternateEmailAddress")
	private  String alternateEmailAddress;
	
	@XmlElement(name="swip:CommunicationAddressMediumType")
	private  String communicationAddressMediumType;
	
	@XmlElement(name="swip:UseType")
	private  String useType;
	
	@XmlElement(name="swip:LogicalDeleteFlg")
	private  String logicalDeleteFlg;

	@Override
	public String toString() {
		return "CommunicationAddress [isPrimaryMVG=" + isPrimaryMVG + ", alternateEmailAddress=" + alternateEmailAddress
				+ ", communicationAddressMediumType=" + communicationAddressMediumType + ", useType=" + useType
				+ ", logicalDeleteFlg=" + logicalDeleteFlg + "]";
	}
	
	
}
