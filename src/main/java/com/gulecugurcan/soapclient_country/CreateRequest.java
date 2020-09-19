package com.gulecugurcan.soapclient_country;

public class CreateRequest implements Command {

    private RequestResponse requestResponse;

    public CreateRequest(RequestResponse requestResponse) {
        this.requestResponse = requestResponse;
    }

    @Override
    public void execute() {
        requestResponse.createRequestToWebService();
    }
}
