package com.ld.app.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "swip:Contact")
public class Contact {

	@XmlAttribute(name = "operation" )
	private String operation;
	
	@XmlAttribute(name="ExternalSystemId")
	private String externalSystemId;
	
	@XmlElement(name="swip:Id")
	private  String id;
	
	@XmlElement(name="swip:BirthDate")
	private  String dob;
	
	@XmlElement(name="swip:EmailAddress")
	private  String emailAddress;
	
	@XmlElement(name="swip:FirstName")
	private  String firstName;
	
	@XmlElement(name="swip:LastName")
	private  String lastName;
	
	@XmlElement(name="swip:HomePhone")
	private  String homePhone;
	
	@XmlElement(name="swip:MF")
	private  String mf;
	
	@XmlElement(name="swip:MaritalStatus")
	private  String maritalStatus;
	
	@XmlElement(name="swip:MaritalStatusDate")
	private  String maritalStatusDate;
	
	@XmlElement(name="swip:VABenefits")
	private  String vaBenefits;
	
	@XmlElement(name="swip:PartyUId")
	private  String partyUId;
	
	@XmlElement(name="swip:SuppressAllMailings")
	private  String suppressAllMailings;
	
	@XmlElement(name="swip:ListOfContact_CommunicationAddress")
	private  List<CommunicationAddress> communicationAddresses ;
	
	@XmlElement(name="swip:ListOfContact_AlternatePhone")
	private  List<AlternatePhone> alternatePhones ;
	
	@XmlElement(name="swip:ListOfCuUcmHeConstituentName")
	private  List<CuUcmHeConstituentName> cuUcmHeConstituentNames ;
	
	@XmlElement(name="swip:ListOfCuUcmHeConstituentAddress")
	private  List<CuUcmHeConstituentAddress> CuUcmHeConstituentAddresses ;

	@Override
	public String toString() {
		return "Contact [operation=" + operation + ", externalSystemId=" + externalSystemId + ", id=" + id + ", dob="
				+ dob + ", emailAddress=" + emailAddress + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", homePhone=" + homePhone + ", mf=" + mf + ", maritalStatus=" + maritalStatus
				+ ", maritalStatusDate=" + maritalStatusDate + ", vaBenefits=" + vaBenefits + ", partyUId=" + partyUId
				+ ", suppressAllMailings=" + suppressAllMailings + ", communicationAddresses=" + communicationAddresses
				+ ", alternatePhones=" + alternatePhones + ", cuUcmHeConstituentNames=" + cuUcmHeConstituentNames
				+ ", CuUcmHeConstituentAddresses=" + CuUcmHeConstituentAddresses + "]";
	}
	
}
