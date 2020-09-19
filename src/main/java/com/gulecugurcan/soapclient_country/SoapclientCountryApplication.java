package com.gulecugurcan.soapclient_country;

import com.gulecugurcan.soapwebservice.CountriesPort;
import com.gulecugurcan.soapwebservice.CountriesPortService;
import com.gulecugurcan.soapwebservice.GetCountryRequest;
import com.gulecugurcan.soapwebservice.GetCountryResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class SoapclientCountryApplication {

    public static void main(String[] args) {

        RequestResponse requestResponse = new RequestResponse();
        RemoteControl control = new RemoteControl();
        Command requestCommand = new CreateRequest(requestResponse);
        Command responseCommand = new GetResponse(requestResponse);

        //İstek Yapmak İçin
        control.setCommand(requestCommand);
        control.doProcess();

        //Cevabı almak için
        control.setCommand(responseCommand);
        control.doProcess();
//
//        CountriesPortService service=new CountriesPortService();
//        CountriesPort countriesPort=service.getCountriesPortSoap11();
//
//        GetCountryRequest request=new GetCountryRequest();
//        request.setName("Spain");

//        GetCountryResponse response=countriesPort.getCountry(request);


//        System.out.println(response.getCountry().getName());
//        System.out.println(response.getCountry().getCapital());
//        System.out.println(response.getCountry().getPopulation());
//        System.out.println(response.getCountry().getCurrency());


    }

}
