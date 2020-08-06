package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="swip:Contact_AlternatePhone")
public class AlternatePhone {

	@XmlAttribute(name="IsPrimaryMVG")
	private String isPrimaryMVG;
	
	@XmlElement(name="swip:AlternatePhone")
	private  String alternatePhoneNum;
	
	@XmlElement(name="swip:AlternatePhoneMediumType")
	private  String alternatePhoneMediumType;
	
	@XmlElement(name="swip:UseType")
	private  String useType;
	
	@XmlElement(name="swip:LogicalDeleteFlg")
	private  String logicalDeleteFlg;

	@Override
	public String toString() {
		return "AlternatePhone [isPrimaryMVG=" + isPrimaryMVG + ", alternatePhone=" + alternatePhoneNum
				+ ", alternatePhoneMediumType=" + alternatePhoneMediumType + ", useType=" + useType
				+ ", logicalDeleteFlg=" + logicalDeleteFlg + "]";
	}

}
