package com.ld.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="swip:ListOfSwiPersonIO")
public class SwiPersonIO {
	
	@XmlElement(name = "swip:Contact")
	private Contact contact;

	@Override
	public String toString() {
		return "SwiPersonIO [contact=" + contact + "]";
	}
	
}
