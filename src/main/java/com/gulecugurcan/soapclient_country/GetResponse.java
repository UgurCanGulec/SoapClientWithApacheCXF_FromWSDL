package com.gulecugurcan.soapclient_country;

public class GetResponse implements Command{

    RequestResponse requestResponse;

    public GetResponse(RequestResponse requestResponse) {
        this.requestResponse = requestResponse;
    }

    @Override
    public void execute() {
        requestResponse.getResponseFromWebService();
    }
}
