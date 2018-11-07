package factory_simple.impl;

import factory_simple.service.Sender;

public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mail send!");
    }
}
