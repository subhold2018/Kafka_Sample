package com.ld.app.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "cus:createPerson_Input")
public class CreatePersonInput {

	@XmlElement(name = "cus:RealtimePubSub")
	private String realtimePubSub;
	
	@XmlElement(name="swip:ListOfSwiPersonIO")
	private List<Contact> contacts;

	@Override
	public String toString() {
		return "CreatePersonInput [realtimePubSub=" + realtimePubSub + ", contacts=" + contacts + "]";
	}

}
