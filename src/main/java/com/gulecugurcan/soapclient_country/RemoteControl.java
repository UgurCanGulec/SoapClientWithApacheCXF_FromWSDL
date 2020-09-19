package com.gulecugurcan.soapclient_country;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void doProcess(){
        command.execute();
    }
}
