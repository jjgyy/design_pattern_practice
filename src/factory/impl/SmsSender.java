package factory.impl;

import factory.service.Sender;

public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send!");
    }
}
