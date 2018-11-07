package factory_simple.impl;

import factory_simple.service.Sender;

public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send!");
    }
}
