package com.ld.app.jaxb.unmarshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import com.ld.app.model.AcccountSetupTransaction;
import com.ld.app.model.CreatePersonInput;

@Service
public class CustomerUnmarshaller {

    private CreatePersonInput xml2Pojo1(String xmlStringData) throws Exception {
        SOAPMessage message = MessageFactory.newInstance().createMessage(null,
                new ByteArrayInputStream(xmlStringData.getBytes()));
        Unmarshaller unmarshaller = JAXBContext.newInstance(CreatePersonInput.class).createUnmarshaller();
        CreatePersonInput createPersonInput = (CreatePersonInput) unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
        return  createPersonInput;
    	
//    	 SOAPMessage message = MessageFactory.newInstance().createMessage(null,
//                 new ByteArrayInputStream(xmlStringData.getBytes()));
//         Unmarshaller unmarshaller = JAXBContext.newInstance(AcccountSetupTransaction.class).createUnmarshaller();
//         AcccountSetupTransaction createPersonInput = (AcccountSetupTransaction) unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
//         return  createPersonInput;
         
        
        
    }

    public static void main(String[] args) throws Exception {
        CustomerUnmarshaller customerUnmarshaller = new CustomerUnmarshaller();
        customerUnmarshaller.xml2Pojo1(getResourceFile("PersonAttributes1.xml"));
    }

    private static String getResourceFile(String fileName) {
		 ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String result = null;
		//	        try (InputStream inputStream = classLoader.getResourceAsStream("xml/data.xml")) {
		try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
			result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
    
    
//    private SwiPersonIO xml2Pojo(String xmlStringData, JAXBContext context) throws JAXBException {
//
//        StringReader reader = new StringReader(xmlStringData);
//
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//
//        SwiPersonIO customer = (SwiPersonIO) unmarshaller.unmarshal(reader);
//
//        return customer;
//
//    }
}
