package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="soapenv:Body")
public class Body {

	@XmlElement(name= "cus:createPerson_Input")
	private CreatePersonInput createPersonInput;
	
}
