package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="swip:CuUcmHeConstituentAddress")
public class CuUcmHeConstituentAddress {
	
	@XmlAttribute(name="IsPrimaryMVG")
	private String isPrimaryMVG;
	
	@XmlElement(name="swip:City")
	private  String city;
	
	@XmlElement(name="swip:Country")
	private  String country;
	
	@XmlElement(name="swip:HEAddressType")
	private  String heAddressType;
	
	@XmlElement(name="swip:PostalCode")
	private  String postalCode;
	
	@XmlElement(name="swip:State")
	private  String state;
	
	@XmlElement(name="swip:StreetAddress")
	private  String streetAddress;
	
	@XmlElement(name="swip:StreetAddress2")
	private  String streetAddress2;
	
	@XmlElement(name="swip:StreetAddress3")
	private  String streetAddress3;
	
	@XmlElement(name="swip:StreetAddress4")
	private  String streetAddress4;
	
	@XmlElement(name="swip:ASMCountry")
	private  String asmCountry;
	
	@XmlElement(name="swip:LogicalDeleteFlg")
	private  String logicalDeleteFlg;
	
	@XmlElement(name="swip:RecordActiveFlg")
	private  String recordActiveFlg;

	@Override
	public String toString() {
		return "CuUcmHeConstituentAddress [isPrimaryMVG=" + isPrimaryMVG + ", city=" + city + ", country=" + country
				+ ", heAddressType=" + heAddressType + ", postalCode=" + postalCode + ", state=" + state
				+ ", streetAddress=" + streetAddress + ", streetAddress2=" + streetAddress2 + ", streetAddress3="
				+ streetAddress3 + ", streetAddress4=" + streetAddress4 + ", asmCountry=" + asmCountry
				+ ", logicalDeleteFlg=" + logicalDeleteFlg + ", recordActiveFlg=" + recordActiveFlg + "]";
	}
	
	
}
