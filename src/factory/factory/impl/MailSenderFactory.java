package factory.factory.impl;

import factory.factory.service.Factory;
import factory.service.Sender;
import factory.impl.MailSender;

public class MailSenderFactory implements Factory {

    @Override
    public Sender produce() {
        return new MailSender();
    }

}
