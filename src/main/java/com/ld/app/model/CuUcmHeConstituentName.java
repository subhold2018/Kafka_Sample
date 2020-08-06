package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="swip:CuUcmHeConstituentName")
public class CuUcmHeConstituentName {

	@XmlAttribute(name="IsPrimaryMVG")
	private String isPrimaryMVG;
	
	@XmlElement(name="swip:CountryNameFormat")
	private  String countryNameFormat;
	
	@XmlElement(name="swip:EffectiveStartDate")
	private  String effectiveStartDate;
	
	@XmlElement(name="swip:FirstName")
	private  String firstName;
	
	@XmlElement(name="swip:LastName")
	private  String lastName;
	
	@XmlElement(name="swip:NameType")
	private  String nameType;
	
	@XmlElement(name="swip:LogicalDeleteFlg")
	private  String logicalDeleteFlg;
	
	@XmlElement(name="swip:RecordActiveFlg")
	private  String recordActiveFlg;

	@Override
	public String toString() {
		return "CuUcmHeConstituentName [isPrimaryMVG=" + isPrimaryMVG + ", countryNameFormat=" + countryNameFormat
				+ ", effectiveStartDate=" + effectiveStartDate + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", nameType=" + nameType + ", logicalDeleteFlg=" + logicalDeleteFlg + ", recordActiveFlg="
				+ recordActiveFlg + "]";
	}
	
	
}
