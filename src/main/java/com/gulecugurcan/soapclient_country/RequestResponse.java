package com.gulecugurcan.soapclient_country;

import com.gulecugurcan.soapwebservice.CountriesPort;
import com.gulecugurcan.soapwebservice.CountriesPortService;
import com.gulecugurcan.soapwebservice.GetCountryRequest;
import com.gulecugurcan.soapwebservice.GetCountryResponse;

import java.util.Scanner;

//receiver sınıf
public class RequestResponse {

    private CountriesPortService service;
    private CountriesPort countriesPort;
    private GetCountryRequest request;
    private GetCountryResponse response;
    Scanner scanner;

    public RequestResponse(){
        this.service=new CountriesPortService();
        this.countriesPort=service.getCountriesPortSoap11();
        scanner=new Scanner(System.in);
    }


    //İstek oluşturma Metodu.
    public void createRequestToWebService(){
        this.request=new GetCountryRequest();
        System.out.println("Ülke Adı : ");
        this.request.setName(scanner.nextLine());
    }

    public void getResponseFromWebService(){
    this.response=countriesPort.getCountry(request);
    EkranaYazdir();
    }
    public void EkranaYazdir(){
        System.out.println("*******************************************");
        System.out.println("Ülke Adı : "+response.getCountry().getName());
        System.out.println("--------------------------------------------");
        System.out.println("Ülke Nüfusu : "+response.getCountry().getPopulation());
        System.out.println("--------------------------------------------");
        System.out.println("Ülke Para Birimi : "+response.getCountry().getCurrency());
        System.out.println("--------------------------------------------");
        System.out.println("Ülke Başkenti : "+response.getCountry().getCapital());
        System.out.println("--------------------------------------------");
    }
}
