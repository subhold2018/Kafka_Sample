package com.ld.app.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Errors")
public class Errors {
	
	@XmlElement(name = "root:Error")
	private List<Error> errors;

}
