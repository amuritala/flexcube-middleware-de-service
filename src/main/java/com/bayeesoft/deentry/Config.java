package com.bayeesoft.deentry;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // marshaller.setContextPath("com.bayee.bayees.stub");
        marshaller.setPackagesToScan("com.bayeesoft.stub");
        return marshaller;
    }

    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://10.1.12.71:8101/FCUBSDEService/FCUBSDEService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }


}
