package factory.impl;

import factory.service.Sender;

public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mail send!");
    }
}
